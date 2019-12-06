
package dss.mediacenterapp.model;

import dss.mediacenterapp.data.BibliotecaDAO;
import dss.mediacenterapp.data.UtilizadorDAO;
import dss.mediacenterapp.model.albuns.Album;
import dss.mediacenterapp.model.conteudo.Conteudo;
import dss.mediacenterapp.model.utilizadores.Utilizador;
import dss.pubsub.DSSObservable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.io.FilenameUtils;

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

    public boolean upload(String nomeAlbum, List<String> elementos, String base_path) {

        boolean uploadOK = true;
        
        String categoriaFavorita = this.utilizadorAtual.categoriaFavorita();
        
        Album novoA = new Album(nomeAlbum, categoriaFavorita);
        Set<String> emailsAmigos = new HashSet<>();
        
        for (String nomeC : elementos) {
            
            boolean isMusic = isMusicFile(nomeC);
            
            Conteudo novoC = new Conteudo(nomeC, nomeC, isMusic, !isMusic, "DB/Content/" + nomeC, categoriaFavorita);
                    
            boolean existeConteudoBiblioteca = this.bibliotecaDB.containsKey(nomeC);
            
            if (existeConteudoBiblioteca == false) {
                
                novoA.adicionaConteudo(novoC);
                
                this.adicionaFicheiro(base_path + nomeC);
                
            } else {
                
                List<String> owners = this.getOwners(nomeC);
                emailsAmigos.addAll(owners);
                
                if (!this.utilizadorAtual.temConteudo(nomeC)) {
                    
                    novoA.adicionaConteudo(novoC);
                }
            }
        }
        
        this.utilizadorAtual.adicionaPotenciaisAmigos(emailsAmigos);
        
        System.out.println("Owners: " + emailsAmigos);
        System.out.println("Album: " + novoA.toString());
        
        return uploadOK;
    }
    
    public boolean isMusicFile(String filename) {
        
        return FilenameUtils.getExtension(filename).equals("mp3");
    }

    private List<String> getOwners(String nomeC) {
        
        return this.bibliotecaDB.getOwners(nomeC);
    
    }

    private void adicionaFicheiro(String filepath) {
        
        System.out.println("Adicionando ficheiro para a DB: " + filepath);
    }
}
