
package dss.mediacenterapp.data;

import dss.mediacenterapp.model.albuns.Album;
import dss.mediacenterapp.model.conteudo.Conteudo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConteudoPessoalDAO implements Map<String, Conteudo> {

    //--------------------------------------------------------------------------
    
    private ConteudoPessoalDAO inst = null;
    
    private String email_utilizador;
    
    //--------------------------------------------------------------------------

    public ConteudoPessoalDAO (String email_user) {
        
        this.email_utilizador = email_user;
                
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");       
            
        } catch (ClassNotFoundException e) {
            
            throw new NullPointerException(e.getMessage());
        }
        
    }
    
    //--------------------------------------------------------------------------

    public String categoriaFavorita() {
        
        String cat_fav = "nenhuma";
        
        Connection conn;
        
        try {
                
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","dss.projeto","dss.mediacenter");
            
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            String sql_categorias = "select c.Categoria_idNomeCategoria, count(c.Categoria_idNomeCategoria) "
                                  + "from Utilizador u, AlbunsDoUtilizador adu, Album a, ConteudoDoAlbum cda, Conteudo c where" +
                                    " u.email = adu.idUserADU" +
                                    " and adu.idAlbumADU = a.idAlbum" +
                                    " and cda.idAlbumCDA = a.idAlbum" +
                                    " and cda.idConteudoCDA = c.idConteudo" +
                                    " and u.email = '" + this.email_utilizador + "' "
                                  + "group by c.Categoria_idNomeCategoria "
                                  + "order by count(c.Categoria_idNomeCategoria) desc";
            
            ResultSet rs = stm.executeQuery(sql_categorias);
            
            if (rs.next()) {
                
                cat_fav = rs.getString(1);
            }
                        
            return cat_fav;

        } catch (Exception e) {
        
            throw new NullPointerException(e.getMessage());
        }
    }
    
    //--------------------------------------------------------------------------

    public Album getAlbum(String nomeAlbum) {
        
        Album alb = null;
        
        Connection conn;
        
        try {
                
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","dss.projeto","dss.mediacenter");
            
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            String sql_getAlbum = "select a.Categoria_idNomeCategoria "
                                + "from Utilizador u, AlbunsDoUtilizador adu, Album a "
                                + "where u.email = adu.idUserADU and adu.idAlbumADU = a.idAlbum "
                                + "and u.email = '" + this.email_utilizador + "'"
                                + " and a.idAlbum = '" + nomeAlbum + "'";
            
            ResultSet rs = stm.executeQuery(sql_getAlbum);

            rs.next();
            
            String cat_album = rs.getString(1);
            
            alb = new Album(nomeAlbum, cat_album);
            
            String sql_getConteudoAlbum = "select c.* from Utilizador u, AlbunsDoUtilizador adu, Album a, ConteudoDoAlbum cda, Conteudo c where" +
                                            " u.email = adu.idUserADU" +
                                            " and adu.idAlbumADU = a.idAlbum" +
                                            " and cda.idAlbumCDA = a.idAlbum" +
                                            " and cda.idConteudoCDA = c.idConteudo" +
                                            " and u.email = '" + this.email_utilizador + "'"
                                            + " and a.idAlbum = '" + nomeAlbum + "'";            
            
            rs = stm.executeQuery(sql_getConteudoAlbum);

            List<Conteudo> conteudoAlbum = new ArrayList<>();
             
            while (rs.next()) {
                
                Conteudo c = new Conteudo(rs.getString(1), rs.getString(2), rs.getBoolean(3), rs.getBoolean(4), rs.getString(5), rs.getString(6));
                
               
                conteudoAlbum.add(c);
            }
            
            alb.addAllConteudo(conteudoAlbum);
            
            return alb;

        } catch (Exception e) {
        
            throw new NullPointerException(e.getMessage());
        }
        
    }
    
    public List<String> getListaAlbuns() {
        
        List<String> nomesAlbuns = new ArrayList<>();
        
        Connection conn;
        
        try {
                
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","dss.projeto","dss.mediacenter");
            
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            String sql = "select a.idAlbum, a.Categoria_idNomeCategoria "
                    + "from Utilizador u, AlbunsDoUtilizador adu, Album a "
                    + "where u.email = adu.idUserADU and adu.idAlbumADU = a.idAlbum "
                    + "and u.email = '" + this.email_utilizador + "'";
            
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()) {
                
                nomesAlbuns.add(rs.getString(1) + " [" + rs.getString(2) + "]");
            }
                 
            return nomesAlbuns;

        } catch (Exception e) {
        
            throw new NullPointerException(e.getMessage());
        }
    }
    
    //--------------------------------------------------------------------------

    public boolean containsConteudo(String nomeC) {

        boolean temConteudo = true;
        
       Connection conn;
        
        try {
                
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","dss.projeto","dss.mediacenter");
            
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            String sql_temconteudo = "select count(c.idConteudo) from Utilizador u, AlbunsDoUtilizador adu, Album a, ConteudoDoAlbum cda, Conteudo c where" +
                                      " u.email = adu.idUserADU" +
                                      " and adu.idAlbumADU = a.idAlbum" +
                                      " and cda.idAlbumCDA = a.idAlbum" +
                                      " and cda.idConteudoCDA = c.idConteudo" +
                                      " and u.email = '" + this.email_utilizador + "'"
                                    + " and c.idConteudo = '" + nomeC + "'";            
            

            ResultSet rs = stm.executeQuery(sql_temconteudo);

            if (rs.next()) {
                
                temConteudo = rs.getInt(1) > 0 ? true : false;
            }
                 
            return temConteudo;

        } catch (Exception e) {
        
            throw new NullPointerException(e.getMessage());
        }       
    }

    //--------------------------------------------------------------------------
    
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsKey(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsValue(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Conteudo get(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Conteudo put(String arg0, Conteudo arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Conteudo remove(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putAll(Map<? extends String, ? extends Conteudo> arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Conteudo> values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Entry<String, Conteudo>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
