
package dss.mediacenterapp.model;

import dss.mediacenterapp.data.BibliotecaDAO;
import dss.mediacenterapp.data.UtilizadorDAO;
import dss.mediacenterapp.model.albuns.Album;
import dss.mediacenterapp.model.conteudo.Conteudo;
import dss.mediacenterapp.model.utilizadores.Utilizador;
import dss.pubsub.DSSObservable;
import java.util.List;
import java.util.stream.Collectors;

public class MediaCenter_LN extends DSSObservable {
    
    //--------------------------------------------------------------------------
    
    private Utilizador utilizadorAtual;
    
    private UtilizadorDAO utilizadorDB;
    private BibliotecaDAO bibliotecaDB;
    
    //--------------------------------------------------------------------------

    public MediaCenter_LN () {
        
        this.utilizadorDB = new UtilizadorDAO();
        this.bibliotecaDB = new BibliotecaDAO();
    }
 
    //--------------------------------------------------------------------------

    public boolean loginUtilizador(String Email, String Password) {
        
        boolean loginOK = false;
        
        if (this.utilizadorDB.containsKey(Email)) {
            
            Utilizador userAtual = this.utilizadorDB.get(Email);
            
            this.utilizadorAtual = userAtual;
            
            loginOK = this.utilizadorAtual.verificaCredenciais(Password);
            
        } else {
            
            loginOK = false;
        }
       
        return loginOK;
    }

    public void logoutUtilizadorAtual() {
        
        this.utilizadorAtual = null;
    }
    
    //--------------------------------------------------------------------------

    public void loginUtilizadorAsGuest() {
        
        //Empty constructor sets user as a guest
        this.utilizadorAtual = new Utilizador();
    }

    public String getNomeUtilizadorAtual() {
        
        return this.utilizadorAtual.getNome();
    }

    public String getUtilizadorAtualID() {
        
        return this.utilizadorAtual.getGeneralID();
    }

    public List<String> getListaConteudoBiblioteca() {
        
        return this.bibliotecaDB.keySet().stream().collect(Collectors.toList());
    }

    public List<String> getListaAlbunsUserAtual() {
        
        return this.utilizadorAtual.getListaAlbuns();
    }

    public List<Conteudo> getListaConteudoAlbum(String nomeA) {
        
        Album a = this.utilizadorAtual.getAlbum(nomeA);
        
        this.utilizadorAtual.adicionaAlbum(a);
        
        return a.getListaConteudo();
    }
    
}
