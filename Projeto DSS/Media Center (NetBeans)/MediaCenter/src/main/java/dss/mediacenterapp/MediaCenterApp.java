
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dss.mediacenterapp;

import dss.mediacenterapp.controller.MediaCenterController;
import dss.mediacenterapp.model.MediaCenter_LN;
import dss.mediacenterapp.view.MediaCenterView;
import javax.swing.SwingUtilities;

/**
 *
 * @author Grupo 1
 */

public class MediaCenterApp {

    private MediaCenterApp () {
        
        //...
    }
    
    public static void main (String args[]) {
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
        
                MediaCenter_LN model = new MediaCenter_LN();
                MediaCenterController controller = new MediaCenterController(model);
                MediaCenterView view = new MediaCenterView(controller);
            
                controller.addObserver(view);
                model.addObserver(controller);
                
                view.run();
                
            }
        });
    }
}
