
package dss.mediacenterapp.model;

import dss.mediacenterapp.data.BibliotecaDAO;
import dss.mediacenterapp.data.UtilizadorDAO;
import dss.mediacenterapp.model.albuns.Album;
import dss.mediacenterapp.model.conteudo.Conteudo;
import dss.mediacenterapp.model.utilizadores.Utilizador;
import dss.pubsub.DSSObservable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class MediaCenter_LN extends DSSObservable {
    
    //--------------------------------------------------------------------------
    
    private Utilizador utilizadorAtual;
    
    private UtilizadorDAO utilizadorDB;
    private BibliotecaDAO bibliotecaDB;
    
    private static final String DB_Files_PATH = "DB/Content/";
    
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

    public boolean upload(String nomeAlbum, List<String> elementos, String base_path) throws IOException {

        boolean uploadOK = false;
        
        //String categoriaFavorita = this.utilizadorAtual.categoriaFavorita();
        String categoriaFavorita = "Nenhuma";
        
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
                
                //Existe na biblioteca do Media Center
                
                List<String> owners = this.getOwners(nomeC);
                emailsAmigos.addAll(owners);
                
                if (!this.utilizadorAtual.temConteudo(nomeC)) {
                    
                    novoA.adicionaConteudo(novoC);
                }
            }
        }
                                        
        if (novoA.hasContent()) {
            
            System.out.println("Owners: " + emailsAmigos);
            System.out.println("Album: " + novoA.toString());

            this.utilizadorAtual.adicionaAlbum(novoA);
            this.utilizadorAtual.insereAlbumNoConteudoPessoal(novoA);
                    
            emailsAmigos.remove(this.utilizadorAtual.getEmail());
    
            this.utilizadorAtual.adicionaPotenciaisAmigos(emailsAmigos);
            this.utilizadorDB.adicionaPotenciaisAmigos(this.utilizadorAtual.getEmail(), emailsAmigos);        
        
            uploadOK = true;
            
        } else {
            
            uploadOK = false;
        }
                
        return uploadOK;
    }
    
    public boolean isMusicFile(String filename) {
        
        return FilenameUtils.getExtension(filename).equals("mp3");
    }

    private List<String> getOwners(String nomeC) {
        
        return this.bibliotecaDB.getOwners(nomeC);
    
    }

    private void adicionaFicheiro(String filepath) throws IOException {
                
        System.out.println("Adicionando ficheiro:");
        System.out.println("\tSource: " + filepath);
        System.out.println("\tDest: " + "DB/Content/");
        
        File source = new File(filepath);
        File dest = new File(DB_Files_PATH);
        
        FileUtils.copyFileToDirectory(source, dest);
    }

    public Utilizador getUtilizadorAtual() {
        
        return this.utilizadorAtual.clone();
    }

    public List<String> getListaConteudoUserAtual() {
        
        return this.utilizadorAtual.getListaConteudoPessoal();
    }

    public void editarConteudoUtilizadorAtual(String conteudoSelecionado, String catnova, String catantiga) {
        
        List<String> owners = this.bibliotecaDB.getRealOwners(conteudoSelecionado, catantiga);
        
        int tam = owners.size();
        
        Conteudo c = this.utilizadorAtual.getConteudo(conteudoSelecionado);
        c.setCategoria(catnova);

        if (tam == 1) {
                        
            this.utilizadorAtual.updateConteudo(c, catantiga);
        
        } else {
            
            this.utilizadorAtual.replaceConteudo(c, catantiga);
        }
    }
}
