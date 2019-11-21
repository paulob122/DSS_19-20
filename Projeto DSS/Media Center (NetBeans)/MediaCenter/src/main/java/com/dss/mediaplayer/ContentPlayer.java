
package com.dss.mediaplayer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;

public class ContentPlayer {

    //--------------------------------------------------------------------------

    private Player player;
    private BufferedInputStream BIS;
    private FileInputStream FIS;

    //--------------------------------------------------------------------------

    private boolean canResume;
    private String path;
    private int totalFrames;
    private int stopped;
    private boolean playWorked;

    //--------------------------------------------------------------------------

    private Thread currentThreadRunning;

    //--------------------------------------------------------------------------

    public ContentPlayer(){

        this.player = null;
        this.FIS = null;
        this.playWorked = false;
        this.BIS = null;
        this.path = null;
        this.totalFrames = 0;
        this.stopped = 0;
        this.canResume = false;
        this.currentThreadRunning = null;
    }

    public void end() {
        
        if (this.currentThreadRunning == null || this.player == null) return;
        
        this.currentThreadRunning.stop();
            
        this.player.close();
    }
    
    public boolean canResume(){
        
        return this.canResume;
    }

    public void setPath(String path){
        
        this.path = path;
    }

    public void pause(){
 
        try{
        
            this.stopped = FIS.available();
            this.player.close();
            this.FIS = null;
            this.BIS = null;
            this.player = null;
 
            if(playWorked == true) 
                canResume = true;

        }catch(Exception e){

            System.out.println("Error pausing music");
        }
    }

    public void resume(){
        
        if(this.canResume == false) 
            return;
        
        if(play(this.totalFrames - this.stopped)) {
            
            this.canResume = false;
        }
    }

    public boolean play(int frame){

        this.playWorked = true;
        this.canResume = false;
        
        try{
        
            this.FIS = new FileInputStream(path);
            this.totalFrames = FIS.available();
            
            if(frame >= 0) {
                
                this.FIS.skip(frame);
            }
            
            this.BIS = new BufferedInputStream(FIS);
            this.player = new Player(BIS);
           
            Thread runningMusicThread = new Thread(new Runnable() {
                
                public void run() {
                    
                    try {
                        
                        player.play();
                        
                    } catch(Exception e) {
                        
                        System.out.println("Error playing music...");
                    }
                }
            });
            
            runningMusicThread.start();
            
        this.currentThreadRunning = runningMusicThread;    
        
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Error playing " + this.path + " file");
           
            this.playWorked = false;
        }
        
        return this.playWorked;
    }
}
