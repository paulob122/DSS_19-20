/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dss.mediacenter.controller;

import com.dss.mediacenter.model.MediaCenterModel;
import com.dss.mediacenter.model.user.Convidado;
import com.dss.pubsub.DSSObservable;
import com.dss.pubsub.DSSObserver;
import com.dss.mediacenter.model.user.Utilizador;

/**
 *
 * @author joao
 */
public class MediaCenterController extends DSSObservable implements DSSObserver {
    
    private MediaCenterModel model;
    private Utilizador currentLoggedUser;
    
    public MediaCenterController(MediaCenterModel model) {
        
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
        
        this.currentLoggedUser = new Convidado(12345);
    }
}
