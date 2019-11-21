
/*------------------------------------------------------------------------------*/

package com.dss.mediacenter.view;

/*------------------------------------------------------------------------------*/

import com.dss.mediacenter.controller.MediaCenterController;
import com.dss.pubsub.DSSObservable;
import com.dss.pubsub.DSSObserver;
import com.dss.mediaplayer.ContentPlayer;
import java.awt.Desktop;

/*------------------------------------------------------------------------------*/

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;

/*------------------------------------------------------------------------------*/

public class MediaCenterView extends javax.swing.JFrame implements DSSObserver {

    /*--------------------------------------------------------------------------*/

    private static final int WINDOW_X = 900, WINDOW_Y = 600;
    
    /*--------------------------------------------------------------------------*/

    private MediaCenterController controller;
    private ContentPlayer currentContentPlayer;
    private String currentUserID;
    private String currentUserType;
    
    /*--------------------------------------------------------------------------*/
    
    public MediaCenterView(MediaCenterController controller) {
        
        this.controller = controller;
        
        this.currentContentPlayer = new ContentPlayer();
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlayContentMenu = new javax.swing.JFrame();
        PlayMusicButton = new javax.swing.JButton();
        PauseButton = new javax.swing.JButton();
        MainMenuTitleLabel = new javax.swing.JLabel();
        CurrentContentPlayingNameLabel = new javax.swing.JLabel();
        ResumeContentButton = new javax.swing.JButton();
        MenuListaConteudo = new javax.swing.JList<>();
        PlayContentBackButton = new javax.swing.JButton();
        SelectMusicLabel = new javax.swing.JLabel();
        OptionsMenu = new javax.swing.JFrame();
        OptionsMenuTitle = new javax.swing.JLabel();
        ReproduzirConteudoButton = new javax.swing.JButton();
        OptionsMenuNote = new javax.swing.JLabel();
        CurrentUserIDLabel = new javax.swing.JLabel();
        OptionsMenuBackButton = new javax.swing.JButton();
        MainMenuTitle = new javax.swing.JLabel();
        LogInButton = new javax.swing.JButton();
        GuestLogInButton = new javax.swing.JButton();
        NewUserQuestionLabel = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();

        PlayContentMenu.setPreferredSize(new java.awt.Dimension(900, 600));
        PlayContentMenu.setResizable(false);
        PlayContentMenu.setSize(new java.awt.Dimension(900, 600));

        PlayMusicButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        PlayMusicButton.setText("Play");
        PlayMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayMusicButtonActionPerformed(evt);
            }
        });

        PauseButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        PauseButton.setText("Pausar");
        PauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseButtonActionPerformed(evt);
            }
        });

        MainMenuTitleLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        MainMenuTitleLabel.setText("Conteúdo atual: ");

        CurrentContentPlayingNameLabel.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        CurrentContentPlayingNameLabel.setText("Nenhum conteúdo foi ainda selecionado da lista disponível...");

        ResumeContentButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        ResumeContentButton.setText("Retomar");
        ResumeContentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumeContentButtonActionPerformed(evt);
            }
        });

        MenuListaConteudo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        PlayContentBackButton.setText("Voltar");
        PlayContentBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayContentBackButtonActionPerformed(evt);
            }
        });

        SelectMusicLabel.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        SelectMusicLabel.setText("Select the music you want to play...");

        javax.swing.GroupLayout PlayContentMenuLayout = new javax.swing.GroupLayout(PlayContentMenu.getContentPane());
        PlayContentMenu.getContentPane().setLayout(PlayContentMenuLayout);
        PlayContentMenuLayout.setHorizontalGroup(
            PlayContentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayContentMenuLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(PlayMusicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(PauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ResumeContentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(PlayContentMenuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(MainMenuTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CurrentContentPlayingNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(PlayContentBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlayContentMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PlayContentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectMusicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuListaConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
        );
        PlayContentMenuLayout.setVerticalGroup(
            PlayContentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayContentMenuLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(SelectMusicLabel)
                .addGap(18, 18, 18)
                .addComponent(MenuListaConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(PlayContentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayMusicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResumeContentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(PlayContentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainMenuTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurrentContentPlayingNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayContentBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        OptionsMenu.setResizable(false);
        OptionsMenu.setSize(new java.awt.Dimension(900, 600));

        OptionsMenuTitle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        OptionsMenuTitle.setForeground(new java.awt.Color(1, 1, 1));
        OptionsMenuTitle.setText("Media Center");

        ReproduzirConteudoButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        ReproduzirConteudoButton.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        ReproduzirConteudoButton.setText("Reproduzir (em desenvolvimento)");
        ReproduzirConteudoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproduzirConteudoButtonActionPerformed(evt);
            }
        });

        OptionsMenuNote.setFont(new java.awt.Font("Tlwg Typo", 2, 18)); // NOI18N
        OptionsMenuNote.setText("Nota: Outras funcionalidades encontram-se em desenvolvimento...");

        CurrentUserIDLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        CurrentUserIDLabel.setText("User ID Label");

        OptionsMenuBackButton.setText("Voltar");
        OptionsMenuBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsMenuBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsMenuLayout = new javax.swing.GroupLayout(OptionsMenu.getContentPane());
        OptionsMenu.getContentPane().setLayout(OptionsMenuLayout);
        OptionsMenuLayout.setHorizontalGroup(
            OptionsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(CurrentUserIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(OptionsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                        .addComponent(OptionsMenuTitle)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                        .addComponent(OptionsMenuBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                        .addComponent(OptionsMenuNote)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                        .addComponent(ReproduzirConteudoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))))
        );
        OptionsMenuLayout.setVerticalGroup(
            OptionsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsMenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(CurrentUserIDLabel)
                .addGap(41, 41, 41)
                .addComponent(OptionsMenuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addComponent(ReproduzirConteudoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(OptionsMenuNote)
                .addGap(73, 73, 73)
                .addComponent(OptionsMenuBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 60));

        MainMenuTitle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        MainMenuTitle.setForeground(new java.awt.Color(1, 1, 1));
        MainMenuTitle.setText("Media Center");

        LogInButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        LogInButton.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        LogInButton.setText("Log-In");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        GuestLogInButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        GuestLogInButton.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        GuestLogInButton.setText("Convidado");
        GuestLogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuestLogInButtonActionPerformed(evt);
            }
        });

        NewUserQuestionLabel.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        NewUserQuestionLabel.setText("Novo Utente?");

        RegisterButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        RegisterButton.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        RegisterButton.setText("Registar");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuestLogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(NewUserQuestionLabel)))
                        .addGap(311, 311, 311))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MainMenuTitle)
                        .addGap(174, 174, 174))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(MainMenuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GuestLogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(NewUserQuestionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayMusicButtonActionPerformed
        try {
            
            this.currentContentPlayer.end();
            
            String list_content_selected = this.MenuListaConteudo.getSelectedValue().toString();
            
            String music_path = "DB/Content/Music/" + list_content_selected + ".mp3";
            
            String[] path_parts = music_path.split("/");
            
            boolean canPlayContent;
            
            this.currentContentPlayer.setPath(music_path);
            canPlayContent = this.currentContentPlayer.play(0);
            
            if (canPlayContent == true) {
                
                this.CurrentContentPlayingNameLabel.setText(list_content_selected);
            } else {

                this.CurrentContentPlayingNameLabel.setText("Error playing file selected...");            
            }
            
            //Para reproduzir vídeos:
            //Desktop.getDesktop().open(new File("DB/Content/Music/rei.mp4"));
        
        } catch (Exception ex) {
            Logger.getLogger(MediaCenterView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_PlayMusicButtonActionPerformed

    private void PauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseButtonActionPerformed

        this.currentContentPlayer.pause();
    }//GEN-LAST:event_PauseButtonActionPerformed

    private void ResumeContentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumeContentButtonActionPerformed
        
        this.currentContentPlayer.resume();
    }//GEN-LAST:event_ResumeContentButtonActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        
        JOptionPane.showMessageDialog(this, "Funcionalidade indisponível! Entre como convidado...");
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void GuestLogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuestLogInButtonActionPerformed
        
        this.setVisible(false);
        this.OptionsMenu.setVisible(true);
        this.controller.setUserAsGuest();
        this.currentUserID = this.controller.getUtilizadorAtualID();
        this.CurrentUserIDLabel.setText(this.currentUserID);
    }//GEN-LAST:event_GuestLogInButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed

        JOptionPane.showMessageDialog(this, "Funcionalidade indisponível! Entre como convidado...");
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void ReproduzirConteudoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproduzirConteudoButtonActionPerformed
        
        this.OptionsMenu.setVisible(false);
        this.PlayContentMenu.setVisible(true);
    }//GEN-LAST:event_ReproduzirConteudoButtonActionPerformed

    private void OptionsMenuBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsMenuBackButtonActionPerformed
        
        this.OptionsMenu.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_OptionsMenuBackButtonActionPerformed

    private void PlayContentBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayContentBackButtonActionPerformed
        
        this.PlayContentMenu.setVisible(false);
        this.OptionsMenu.setVisible(true);
        this.currentContentPlayer.end();
    }//GEN-LAST:event_PlayContentBackButtonActionPerformed

    
    public void setInitialFormat() {
        
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));
        this.setTitle("Menu Inicial");
        
        this.PlayContentMenu.setLocationRelativeTo(null);
        this.PlayContentMenu.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.PlayContentMenu.setVisible(false);
        this.PlayContentMenu.setTitle("Menu Reproduzir");
        
        DefaultListModel model=new DefaultListModel();
        model.clear();
        model.addElement("Metallica_Fade-to-Black");
        model.addElement("Metallica_Nothing-else-matters");
        this.MenuListaConteudo.setModel(model);
     
        this.MenuListaConteudo.removeAll();

        this.OptionsMenu.setLocationRelativeTo(null);
        this.OptionsMenu.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.OptionsMenu.setVisible(false);
        this.OptionsMenu.setTitle("Menu Principal");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.PlayContentMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.OptionsMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void run() {
        
        this.initComponents();
        this.setInitialFormat();
        this.setVisible(true);
    }
    
    public void update(DSSObservable o, Object arg) {
    
        
    } 
    
    public void exit() {
        
        System.exit(1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentContentPlayingNameLabel;
    private javax.swing.JLabel CurrentUserIDLabel;
    private javax.swing.JButton GuestLogInButton;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel MainMenuTitle;
    private javax.swing.JLabel MainMenuTitleLabel;
    private javax.swing.JList<String> MenuListaConteudo;
    private javax.swing.JLabel NewUserQuestionLabel;
    private javax.swing.JFrame OptionsMenu;
    private javax.swing.JButton OptionsMenuBackButton;
    private javax.swing.JLabel OptionsMenuNote;
    private javax.swing.JLabel OptionsMenuTitle;
    private javax.swing.JButton PauseButton;
    private javax.swing.JButton PlayContentBackButton;
    private javax.swing.JFrame PlayContentMenu;
    private javax.swing.JButton PlayMusicButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton ReproduzirConteudoButton;
    private javax.swing.JButton ResumeContentButton;
    private javax.swing.JLabel SelectMusicLabel;
    // End of variables declaration//GEN-END:variables
}
