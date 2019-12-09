
package dss.mediacenterapp.model.utilizadores;

import dss.mediacenterapp.data.ConteudoPessoalDAO;
import dss.mediacenterapp.model.albuns.Album;
import dss.mediacenterapp.model.conteudo.Conteudo;
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
    
    public Utilizador (Utilizador copia) {
        
        this.nome = copia.getNome();
        this.email = copia.getEmail();
        this.password = copia.getPassword();
        this.typeOfUser = copia.getTypeOfUser();
        this.potenciaisAmigos = copia.getPotenciaisAmigos();
    }
    
    public Utilizador clone() {
        
        return new Utilizador(this);
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
    
    public void adicionaAmigo(String email) {
        
        this.potenciaisAmigos.add(email);
    }

    public void insereAlbumNoConteudoPessoal(Album novoA) {
        
        this.conteudoPessoal.adicionaAlbum(novoA);
    }

    public String getPassword() {
        
        return this.password;
    }

    public String getTypeOfUser() {
        
        return this.typeOfUser;
    }

    public Set<String> getPotenciaisAmigos() {
        
        return new HashSet<>(this.potenciaisAmigos);
    }

    public List<String> getListaConteudoPessoal() {
        
        return this.conteudoPessoal.getListaConteudo();
    }

    public Conteudo getConteudo(String conteudoSelecionado) {
        
        return this.conteudoPessoal.getConteudo(conteudoSelecionado);
    }

    public void updateConteudo(Conteudo c, String catant) {
        
        this.conteudoPessoal.updateConteudo(c, catant);
    }

    public void replaceConteudo(Conteudo c, String catantiga) {
        
        this.conteudoPessoal.replaceConteudo(c, catantiga);
    }
    
}
