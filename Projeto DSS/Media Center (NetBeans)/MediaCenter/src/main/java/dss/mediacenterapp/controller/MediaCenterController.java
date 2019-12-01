/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss.mediacenterapp.controller;

import dss.mediacenterapp.model.MediaCenter_LN;
import dss.pubsub.DSSObservable;
import dss.pubsub.DSSObserver;
import dss.mediacenterapp.model.utilizadores.Utilizador;
import java.io.File;
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
   
    public boolean loginUtilizador (String email, String password) {
        
        return this.model.loginUtilizador(email, password);
    }

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

    public void logoutUtilizador() {
        
        this.model.logoutUtilizador();
    }
}
