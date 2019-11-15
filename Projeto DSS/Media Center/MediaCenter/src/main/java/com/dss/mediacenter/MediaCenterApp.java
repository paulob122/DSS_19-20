
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dss.mediacenter;

import com.dss.mediacenter.controller.MediaCenterController;
import com.dss.mediacenter.model.MediaCenterModel;
import com.dss.mediacenter.view.MediaCenterView;
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
        
                MediaCenterModel model = new MediaCenterModel();
                MediaCenterController controller = new MediaCenterController(model);
                MediaCenterView view = new MediaCenterView(controller);
            
                controller.addObserver(view);
                model.addObserver(controller);
                
                view.run();
                
            }
        });
    }
}
