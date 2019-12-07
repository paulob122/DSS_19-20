
package dss.mediacenterapp.model.utilizadores;

import dss.mediacenterapp.data.ConteudoPessoalDAO;
import dss.mediacenterapp.model.albuns.Album;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utilizador {
    
    /*--------------------------------------------------------------------------*/

    private static final String GUEST = "Guest";
    private static final String REG = "Registred";
    private static final String ADM = "Admin";
    private static final String TMP = "Temporary User";
    
    private static String typeOfUser;

    /*--------------------------------------------------------------------------*/
    
    private String email;
    private String password;
    private String nome;
    private boolean isTemporaryUser;
    private boolean isAdministrator;
    
    private ConteudoPessoalDAO conteudoPessoal;
    
    private Map<String, Album> albuns;
    private Set<String> potenciaisAmigos;
    
    /*--------------------------------------------------------------------------*/

    public Utilizador(String mail, 
                      String password, 
                      String nome, 
                      boolean isTempraryUser, 
                      boolean isAdministrator) {
        
        if (isAdministrator) {
            
            this.typeOfUser = "Administrator";
        
        } else if (isTemporaryUser) {
            
            this.typeOfUser = "Temporary User";
        
        } else {
            
            this.typeOfUser = "Registred";
        }
        
        this.email = mail;
        this.password = password;
        this.nome = nome;
        this.isTemporaryUser = isTempraryUser;
        this.isAdministrator = isAdministrator;
    
        this.conteudoPessoal = new ConteudoPessoalDAO(this.email);
        
        this.albuns = new HashMap<>();
        this.potenciaisAmigos = new HashSet<>();
    }

    public Utilizador() {
        
        this.typeOfUser = GUEST;
        
        this.email = "guest@mediacenter";
        this.nome = "Guest";
        this.password = "n/a";
        this.isAdministrator = false;
        this.isTemporaryUser = false;
        
        this.albuns = new HashMap<>();
        this.potenciaisAmigos = new HashSet<>();
    }
    
    /*--------------------------------------------------------------------------*/

    public String getGeneralID() {
    
        return this.typeOfUser + ": " + this.email;
    }
    
    public void setUserAsGuest() {
        
        this.typeOfUser = GUEST;
    }
    
    /*--------------------------------------------------------------------------*/
    
    public String toString () {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Type of User: " + this.typeOfUser + "\n");
        sb.append("E-Mail: " + this.email + "\n");
        sb.append("Nome: " + this.nome + "\n");
        sb.append("Password: " + this.password + "\n");
        sb.append("Temporary: " + this.isTemporaryUser + "\n");
        sb.append("Admin: " + this.isAdministrator + "\n");
        
        return sb.toString();
    }

    public boolean verificaCredenciais(String Password) {
        
        return this.password.equals(Password);
    }

    public String getNome() {
        
        return this.nome;
    }
    
    public String getEmail() {
        
        return this.email;
    }

    public List<String> getListaAlbuns() {
        
        return this.conteudoPessoal.getListaAlbuns();
    }

    public Album getAlbum(String nomeAlbum) {
        
        return this.conteudoPessoal.getAlbum(nomeAlbum);
    }

    public void adicionaAlbum(Album a) {
        
        this.albuns.put(a.getNome(), a);
    }

    public String categoriaFavorita() {
        
        return this.conteudoPessoal.categoriaFavorita();
    }

    public boolean temConteudo(String nomeC) {
        
        return this.conteudoPessoal.containsConteudo(nomeC);
    }

    public void adicionaPotenciaisAmigos(Set<String> emailsAmigos) {
        
        this.potenciaisAmigos.addAll(emailsAmigos);
    }

    public void insereAlbumNoConteudoPessoal(Album novoA) {
        
        this.conteudoPessoal.adicionaAlbum(novoA);
    }
    
}
