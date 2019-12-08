/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.mediacenterapp.presentation.controller;

import dss.mediacenterapp.model.MediaCenter_LN;
import dss.mediacenterapp.model.conteudo.Conteudo;
import dss.pubsub.DSSObservable;
import dss.pubsub.DSSObserver;
import dss.mediacenterapp.model.utilizadores.Utilizador;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 */
public class MediaCenterController extends DSSObservable implements DSSObserver {
    
    private MediaCenter_LN model;
    
    public MediaCenterController(MediaCenter_LN model) {
        
        this.model = model;
    }

    @Override
    public void update(DSSObservable source, Object value) {
        
        //...
    }
    
    public String getUtilizadorAtualID() {
        
        return this.model.getUtilizadorAtualID();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean loginUtilizador (String email, String password) {
        
        return this.model.loginUtilizador(email, password);
    }

    public void logoutUtilizadorAtual() {
        
        this.model.logoutUtilizadorAtual();
    }

    //--------------------------------------------------------------------------
 
    public List<String> listNomesFicheirosDir(String dir_path) {
        
        List<String> fileNames = new ArrayList<>();
        
        File folder = new File(dir_path);

        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            
            if (listOfFiles[i].isFile()) {
            
                fileNames.add(listOfFiles[i].getName());
            
            } else if (listOfFiles[i].isDirectory()) {
            
                //...
            }
        }
        
        return fileNames;
    }

    //--------------------------------------------------------------------------

    public void loginUtilizadorAsGuest() {

        this.model.loginUtilizadorAsGuest();
    }

    public String getNomeUtilizadorAtual() {

        return this.model.getNomeUtilizadorAtual();
    }

    public List<String> getListaConteudoBiblioteca() {
        
        return this.model.getListaConteudoBiblioteca();
    }

    public List<String> getListaAlbunsUserAtual() {
        
        return this.model.getListaAlbunsUserAtual();
    }

    public List<Conteudo> getListaConteudoAlbum(String nomeA) {
        
        return this.model.getListaConteudoAlbum(nomeA);
    }

    public boolean upload(String nomeAlbum, List<String> elementos, String base_path) throws IOException {
        
        return this.model.upload(nomeAlbum, elementos, base_path);
    }

    public Utilizador getUtilizadorAtual() {
        
        return this.model.getUtilizadorAtual();
    }

    public List<String> getListaConteudoUserAtual() {
        
        return this.model.getListaConteudoUserAtual();
    }

    public void editarConteudoUtilizadorAtual(String conteudoSelecionado, String catnova, String catantiga) {
        
        this.model.editarConteudoUtilizadorAtual(conteudoSelecionado, catnova, catantiga);
    }

}
