
package dss.mediacenterapp.externalplayer;

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import org.apache.commons.io.FilenameUtils;

public class ContentPlayer implements Runnable {

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

    public boolean playingFinished() {
        
        try {
            
            if (FIS.available() == 0) {

                return true;
            }            
            
        } catch (Exception e) {
            
            return false;
        }
        
        return false;
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
    
    public boolean play(int frame) {
        
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

            Thread runThread = new Thread(new Runnable() {
                @Override
                public void run() {
              
                    try {
                        player.play();
                    } catch (JavaLayerException ex) {
                        Logger.getLogger(ContentPlayer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

            this.currentThreadRunning = runThread;
            this.currentThreadRunning.start();
                        
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Não foi possível reproduzir " + this.path);
           
            this.playWorked = false;
        }
        
        return this.playWorked;
         
    }
    
    public boolean playMT(int frame){

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
                                  
            synchronized(this) {
                player.play();
            }
                        
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Não foi possível reproduzir " + this.path);
           
            this.playWorked = false;
        }
        
        return this.playWorked;
    }
        
    private Object getExtensionOfFile(String list_content_selected) {
        
        return FilenameUtils.getExtension(list_content_selected);
    }

    @Override
    public void run() {
        
        playMT(0);
    }
    
}
