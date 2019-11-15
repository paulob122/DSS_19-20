
package com.dss.mediaplayer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;

public class ContentPlayer {

    private Player player;
    private FileInputStream FIS;
    private BufferedInputStream BIS;
    private boolean canResume;
    private String path;
    private int total;
    private int stopped;
    private boolean valid;
    private Thread currentThreadRunning;

    public ContentPlayer(){

        this.player = null;
        this.FIS = null;
        this.valid = false;
        this.BIS = null;
        this.path = null;
        this.total = 0;
        this.stopped = 0;
        this.canResume = false;
        this.currentThreadRunning = null;
    }

    public void end() {
        
        if (this.currentThreadRunning == null) return;
        
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
 
            if(valid) canResume = true;

        }catch(Exception e){

            System.out.println("Error pausing music");
        }
    }

    public void resume(){
        
        if(!this.canResume) return;
        
        if(play(this.total - this.stopped)) {
            
            this.canResume = false;
        }
    }

    public boolean play(int pos){

        this.valid = true;
        this.canResume = false;
        
        try{
        
            this.FIS = new FileInputStream(path);
            this.total = FIS.available();
            
            if(pos > -1) {
                
                this.FIS.skip(pos);
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
            
            JOptionPane.showMessageDialog(null, "Error playing mp3 file");
            this.valid = false;
        }
        
        return this.valid;
    }
}
