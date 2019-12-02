
package dss.mediacenterapp.data;

import dss.mediacenterapp.model.conteudo.Conteudo;
import dss.mediacenterapp.model.utilizadores.Utilizador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BibliotecaDAO implements Map<String, Conteudo> {
    
    private BibliotecaDAO inst = null;
    
    public BibliotecaDAO () {
        
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");       
            
        } catch (ClassNotFoundException e) {
            
            throw new NullPointerException(e.getMessage());
        }
    }
        
    /*Métodos abstratos da interface Map<..., ...>*/

    public void clear() {
        
    }
    
    @Override
    public boolean containsKey(Object key) {
        
        Connection conn;
        
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","root","admin");
            
            Statement stm = conn.createStatement();
            
            String sql = "SELECT * FROM Conteudo c WHERE c.idConteudo = '"+(String)key+"'";
            
            ResultSet rs = stm.executeQuery(sql);
            
            return rs.next();
        
        } catch (Exception e) {
        
            throw new NullPointerException(e.getMessage());
        }        
    }

        
    @Override
    public int size() {
        
        Connection conn;
        
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","dss.projeto","dss.mediacenter");
            
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            String sql = "SELECT COUNT(*) FROM Conteudo";
            
            ResultSet rs = stm.executeQuery(sql);

            rs.next();
            
            return rs.getInt(1);
        
        } catch (Exception e) {
        
            throw new NullPointerException(e.getMessage());
        }        
        
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean containsValue(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Conteudo get(Object key) {

        Connection conn;
        
        try {
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","dss.projeto","dss.mediacenter");
            
            Conteudo cont = null;
            
            Statement stm = conn.createStatement();
            
            String sql = "SELECT * FROM Conteudo WHERE idConteudo='"+(String)key+"'";
            
            ResultSet rs = stm.executeQuery(sql);
            
            if (rs.next()) {
                

            } 
            
            return cont;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}

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
    public Set<String> keySet() {

        Set<String> res = new HashSet<>();
        
        Connection conn;
        
        try {
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","dss.projeto","dss.mediacenter");
            
            Statement stm = conn.createStatement();
            
            String sql = "SELECT c.idConteudo, c.isVideo FROM Conteudo c";
            
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                
                res.add(rs.getString(1));
            } 
            
            return res;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}       
    }

    @Override
    public Collection<Conteudo> values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Map.Entry<String, Conteudo>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
