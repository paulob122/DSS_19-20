
package dss.mediacenterapp.data;

import dss.mediacenterapp.model.utilizadores.Utilizador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class UtilizadorDAO implements Map<String, Utilizador> {
    
    private UtilizadorDAO inst = null;
    
    public UtilizadorDAO () {
        
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");       
            
        } catch (ClassNotFoundException e) {
            
            throw new NullPointerException(e.getMessage());
        }
    }
    
    public void clear() {
        
        Connection connection;
        
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","root","admin");
            
            Statement stm = connection.createStatement();
            stm.executeUpdate("DELETE FROM TAlunos");
        
        } catch (Exception e) {
        
            throw new NullPointerException(e.getMessage());
        }
    }
    
    /*Métodos abstratos da interface Map<..., ...>*/

    @Override
    public boolean containsKey(Object key) {
        
        Connection conn;
        
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","root","admin");
            
            Statement stm = conn.createStatement();
            
            String sql = "SELECT * FROM Utilizador u WHERE u.email = '"+(String)key+"'";
            
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
            
            String sql = "SELECT COUNT(*) FROM Utilizador";
            
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
    public Utilizador get(Object key) {

        Connection conn;
        
        try {
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MediaCenterDB","dss.projeto","dss.mediacenter");
            
            Utilizador user = null;
            
            Statement stm = conn.createStatement();
            
            String sql = "SELECT * FROM Utilizador WHERE email='"+(String)key+"'";
            
            ResultSet rs = stm.executeQuery(sql);
            
            if (rs.next()) {
                
                user = new Utilizador(rs.getString(1), rs.getString(3), rs.getString(2), rs.getInt(4) > 0 ? true : false, rs.getInt(5) > 0 ? true : false);
            } 
            
            return user;
        }
        catch (Exception e) {throw new NullPointerException(e.getMessage());}

    }

    @Override
    public Utilizador put(String arg0, Utilizador arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Utilizador remove(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putAll(Map<? extends String, ? extends Utilizador> arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Utilizador> values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Entry<String, Utilizador>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
