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
    private Utilizador currentLoggedUser;
    
    public MediaCenterController(MediaCenter_LN model) {
        
        this.model = model;
        this.currentLoggedUser = null; //not set
    }

    @Override
    public void update(DSSObservable source, Object value) {
        
        //...
    }
    
    public String getUtilizadorAtualID() {
        
        return this.currentLoggedUser.getGeneralID();
    }
    
    public void setUserAsGuest() {
        
        this.currentLoggedUser = new Utilizador();
        this.currentLoggedUser.setUserAsGuest();
        
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
}
