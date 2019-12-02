
/*------------------------------------------------------------------------------*/

package dss.mediacenterapp.view;

/*------------------------------------------------------------------------------*/

import dss.mediacenterapp.controller.MediaCenterController;
import dss.pubsub.DSSObservable;
import dss.pubsub.DSSObserver;
import dss.mediacenterapp.externalplayer.ContentPlayer;
import java.awt.Desktop;

/*------------------------------------------------------------------------------*/

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;
import org.apache.commons.io.FilenameUtils;

/*------------------------------------------------------------------------------*/

public class MediaCenter_GUI extends javax.swing.JFrame implements DSSObserver {

    /*--------------------------------------------------------------------------*/

    private static final int WINDOW_X = 900, WINDOW_Y = 600;
    
    /*--------------------------------------------------------------------------*/

    private MediaCenterController controller;
    private ContentPlayer currentContentPlayer;
    
    /*--------------------------------------------------------------------------*/
    
    public MediaCenter_GUI(MediaCenterController controller) {
        
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
        OptionsMenu_Logout = new javax.swing.JButton();
        OptionsMenu_Upload = new javax.swing.JButton();
        NormalLoginForm = new javax.swing.JFrame();
        NormalLoginForm_Title = new javax.swing.JLabel();
        normallogin_emailfield = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        normallogin_passwordfield = new javax.swing.JTextField();
        password_label = new javax.swing.JLabel();
        normallogin_loginbutton = new javax.swing.JButton();
        normallogin_backbutton = new javax.swing.JButton();
        ReproduzirMenu = new javax.swing.JFrame();
        ReproduzirMenu_MainTitle = new javax.swing.JLabel();
        OptionsMenuNote1 = new javax.swing.JLabel();
        ReproduzirMenu_Biblioteca = new javax.swing.JButton();
        ReproduzirMenu_Album = new javax.swing.JButton();
        ReproduzirMenu_Backbutton = new javax.swing.JButton();
        ReproduzirBibliotecaMenu = new javax.swing.JFrame();
        ReproduzirBiblioteca_MainTitle = new javax.swing.JLabel();
        RepBiblio_ScrollLista = new javax.swing.JScrollPane();
        ReproduzirBiblioteca_ListaConteudo = new javax.swing.JList<>();
        RepBiblio_PlayButton = new javax.swing.JButton();
        RepBiblio_PauseButton = new javax.swing.JButton();
        RepBiblio_ResumeButton = new javax.swing.JButton();
        RepBiblio_BackButton = new javax.swing.JButton();
        RepBiblioteca_CurrentContLabel = new javax.swing.JLabel();
        MainMenuTitle = new javax.swing.JLabel();
        LogInButton = new javax.swing.JButton();
        GuestLogInButton = new javax.swing.JButton();
        NewUserQuestionLabel = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();

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
        ReproduzirConteudoButton.setText("Reproduzir");
        ReproduzirConteudoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproduzirConteudoButtonActionPerformed(evt);
            }
        });

        OptionsMenuNote.setFont(new java.awt.Font("Tlwg Typo", 2, 18)); // NOI18N
        OptionsMenuNote.setText("Nota: Outras funcionalidades encontram-se em desenvolvimento...");

        CurrentUserIDLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        CurrentUserIDLabel.setText("User ID Label");

        OptionsMenu_Logout.setText("Log-Out");
        OptionsMenu_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsMenu_LogoutActionPerformed(evt);
            }
        });

        OptionsMenu_Upload.setBackground(java.awt.SystemColor.activeCaptionBorder);
        OptionsMenu_Upload.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        OptionsMenu_Upload.setText("Upload");
        OptionsMenu_Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsMenu_UploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsMenuLayout = new javax.swing.GroupLayout(OptionsMenu.getContentPane());
        OptionsMenu.getContentPane().setLayout(OptionsMenuLayout);
        OptionsMenuLayout.setHorizontalGroup(
            OptionsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(OptionsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                        .addComponent(OptionsMenuTitle)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                        .addComponent(OptionsMenu_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                        .addComponent(OptionsMenuNote)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuLayout.createSequentialGroup()
                        .addGroup(OptionsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OptionsMenu_Upload, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReproduzirConteudoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(239, 239, 239))))
            .addGroup(OptionsMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(CurrentUserIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(29, 29, 29)
                .addComponent(OptionsMenu_Upload, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(OptionsMenuNote)
                .addGap(73, 73, 73)
                .addComponent(OptionsMenu_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        NormalLoginForm.setPreferredSize(new java.awt.Dimension(900, 600));
        NormalLoginForm.setSize(new java.awt.Dimension(900, 600));

        NormalLoginForm_Title.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        NormalLoginForm_Title.setForeground(new java.awt.Color(1, 1, 1));
        NormalLoginForm_Title.setText("Media Center");

        normallogin_emailfield.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        normallogin_emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normallogin_emailfieldActionPerformed(evt);
            }
        });

        email_label.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        email_label.setText("E-Mail:");

        normallogin_passwordfield.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        normallogin_passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normallogin_passwordfieldActionPerformed(evt);
            }
        });

        password_label.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        password_label.setText("Password:");

        normallogin_loginbutton.setText("Log-In");
        normallogin_loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normallogin_loginbuttonActionPerformed(evt);
            }
        });

        normallogin_backbutton.setText("Back");
        normallogin_backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normallogin_backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NormalLoginFormLayout = new javax.swing.GroupLayout(NormalLoginForm.getContentPane());
        NormalLoginForm.getContentPane().setLayout(NormalLoginFormLayout);
        NormalLoginFormLayout.setHorizontalGroup(
            NormalLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NormalLoginFormLayout.createSequentialGroup()
                .addGroup(NormalLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NormalLoginFormLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(NormalLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(normallogin_emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(normallogin_passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NormalLoginFormLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(NormalLoginForm_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(NormalLoginFormLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(normallogin_loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(normallogin_backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        NormalLoginFormLayout.setVerticalGroup(
            NormalLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NormalLoginFormLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(NormalLoginForm_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(email_label)
                .addGap(18, 18, 18)
                .addComponent(normallogin_emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(normallogin_passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(NormalLoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NormalLoginFormLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(normallogin_loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NormalLoginFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(normallogin_backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        ReproduzirMenu.setPreferredSize(new java.awt.Dimension(900, 600));
        ReproduzirMenu.setSize(new java.awt.Dimension(900, 600));

        ReproduzirMenu_MainTitle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        ReproduzirMenu_MainTitle.setForeground(new java.awt.Color(1, 1, 1));
        ReproduzirMenu_MainTitle.setText("Reproduzir");

        OptionsMenuNote1.setFont(new java.awt.Font("Tlwg Typo", 2, 18)); // NOI18N
        OptionsMenuNote1.setText("Nota: Outras funcionalidades encontram-se em desenvolvimento...");

        ReproduzirMenu_Biblioteca.setBackground(java.awt.SystemColor.activeCaptionBorder);
        ReproduzirMenu_Biblioteca.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        ReproduzirMenu_Biblioteca.setText("Biblioteca do Media Center");
        ReproduzirMenu_Biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproduzirMenu_BibliotecaActionPerformed(evt);
            }
        });

        ReproduzirMenu_Album.setBackground(java.awt.SystemColor.activeCaptionBorder);
        ReproduzirMenu_Album.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        ReproduzirMenu_Album.setText("Albuns");
        ReproduzirMenu_Album.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproduzirMenu_AlbumActionPerformed(evt);
            }
        });

        ReproduzirMenu_Backbutton.setText("Back");
        ReproduzirMenu_Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproduzirMenu_BackbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReproduzirMenuLayout = new javax.swing.GroupLayout(ReproduzirMenu.getContentPane());
        ReproduzirMenu.getContentPane().setLayout(ReproduzirMenuLayout);
        ReproduzirMenuLayout.setHorizontalGroup(
            ReproduzirMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReproduzirMenuLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(ReproduzirMenu_MainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(212, 212, 212))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReproduzirMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ReproduzirMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReproduzirMenuLayout.createSequentialGroup()
                        .addGroup(ReproduzirMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReproduzirMenu_Album, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReproduzirMenu_Biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReproduzirMenuLayout.createSequentialGroup()
                        .addComponent(OptionsMenuNote1)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReproduzirMenuLayout.createSequentialGroup()
                        .addComponent(ReproduzirMenu_Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        ReproduzirMenuLayout.setVerticalGroup(
            ReproduzirMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReproduzirMenuLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(ReproduzirMenu_MainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(ReproduzirMenu_Biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(ReproduzirMenu_Album, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(OptionsMenuNote1)
                .addGap(29, 29, 29)
                .addComponent(ReproduzirMenu_Backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        ReproduzirBibliotecaMenu.setSize(new java.awt.Dimension(900, 600));

        ReproduzirBiblioteca_MainTitle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        ReproduzirBiblioteca_MainTitle.setForeground(new java.awt.Color(1, 1, 1));
        ReproduzirBiblioteca_MainTitle.setText("Biblioteca");

        ReproduzirBiblioteca_ListaConteudo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        RepBiblio_ScrollLista.setViewportView(ReproduzirBiblioteca_ListaConteudo);

        RepBiblio_PlayButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        RepBiblio_PlayButton.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        RepBiblio_PlayButton.setText("Play");
        RepBiblio_PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepBiblio_PlayButtonActionPerformed(evt);
            }
        });

        RepBiblio_PauseButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        RepBiblio_PauseButton.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        RepBiblio_PauseButton.setText("Pause");
        RepBiblio_PauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepBiblio_PauseButtonActionPerformed(evt);
            }
        });

        RepBiblio_ResumeButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        RepBiblio_ResumeButton.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        RepBiblio_ResumeButton.setText("Resume");
        RepBiblio_ResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepBiblio_ResumeButtonActionPerformed(evt);
            }
        });

        RepBiblio_BackButton.setBackground(java.awt.SystemColor.activeCaptionBorder);
        RepBiblio_BackButton.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        RepBiblio_BackButton.setText("Back");
        RepBiblio_BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepBiblio_BackButtonActionPerformed(evt);
            }
        });

        RepBiblioteca_CurrentContLabel.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        RepBiblioteca_CurrentContLabel.setText("Nenhum conteúdo foi ainda selecionado da lista disponível...");

        javax.swing.GroupLayout ReproduzirBibliotecaMenuLayout = new javax.swing.GroupLayout(ReproduzirBibliotecaMenu.getContentPane());
        ReproduzirBibliotecaMenu.getContentPane().setLayout(ReproduzirBibliotecaMenuLayout);
        ReproduzirBibliotecaMenuLayout.setHorizontalGroup(
            ReproduzirBibliotecaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReproduzirBibliotecaMenuLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(ReproduzirBibliotecaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReproduzirBibliotecaMenuLayout.createSequentialGroup()
                        .addComponent(ReproduzirBiblioteca_MainTitle)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReproduzirBibliotecaMenuLayout.createSequentialGroup()
                        .addGroup(ReproduzirBibliotecaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ReproduzirBibliotecaMenuLayout.createSequentialGroup()
                                .addComponent(RepBiblioteca_CurrentContLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RepBiblio_BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ReproduzirBibliotecaMenuLayout.createSequentialGroup()
                                .addComponent(RepBiblio_PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RepBiblio_PauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(RepBiblio_ResumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RepBiblio_ScrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))))
        );
        ReproduzirBibliotecaMenuLayout.setVerticalGroup(
            ReproduzirBibliotecaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReproduzirBibliotecaMenuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ReproduzirBiblioteca_MainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(ReproduzirBibliotecaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepBiblio_PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RepBiblio_ResumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RepBiblio_PauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(RepBiblio_ScrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(ReproduzirBibliotecaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepBiblio_BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RepBiblioteca_CurrentContLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
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
                  
    }//GEN-LAST:event_PlayMusicButtonActionPerformed

    private void PauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseButtonActionPerformed

        this.currentContentPlayer.pause();
    }//GEN-LAST:event_PauseButtonActionPerformed

    private void ResumeContentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumeContentButtonActionPerformed
        
        this.currentContentPlayer.resume();
    }//GEN-LAST:event_ResumeContentButtonActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        
        this.NormalLoginForm.setVisible(true);
        this.setVisible(false);
        
        this.normallogin_emailfield.setText("");
        this.normallogin_passwordfield.setText("");
        
        this.OptionsMenu_Upload.setEnabled(true);
        this.OptionsMenu_Logout.setText("Logout");
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void GuestLogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuestLogInButtonActionPerformed

        this.setVisible(false);
        this.OptionsMenu.setVisible(true);
        this.controller.loginUtilizadorAsGuest();
        this.CurrentUserIDLabel.setText(this.controller.getUtilizadorAtualID());
        
        this.OptionsMenu_Upload.setEnabled(false);
        this.OptionsMenu_Logout.setText("Back");
    }//GEN-LAST:event_GuestLogInButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed

        JOptionPane.showMessageDialog(this, "Funcionalidade de momento indisponível!");
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void ReproduzirConteudoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproduzirConteudoButtonActionPerformed

        this.updateBibliotecaList();
        
        this.OptionsMenu.setVisible(false);
        this.ReproduzirMenu.setVisible(true);
    }//GEN-LAST:event_ReproduzirConteudoButtonActionPerformed

    private void OptionsMenu_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsMenu_LogoutActionPerformed
        
        if (this.controller.getNomeUtilizadorAtual().equals("Guest")) {
            
            //...é um guest
            
            this.OptionsMenu.setVisible(false);
            this.setVisible(true);        

        } else {
                    
            this.OptionsMenu.setVisible(false);
            this.setVisible(true);        

            JOptionPane.showMessageDialog(this, "Terminou sessão com sucesso!");
        }

        this.controller.logoutUtilizadorAtual();        
    }//GEN-LAST:event_OptionsMenu_LogoutActionPerformed

    private void PlayContentBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayContentBackButtonActionPerformed
        
        this.PlayContentMenu.setVisible(false);
        this.OptionsMenu.setVisible(true);
        this.currentContentPlayer.end();
    }//GEN-LAST:event_PlayContentBackButtonActionPerformed

    private void normallogin_emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normallogin_emailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_normallogin_emailfieldActionPerformed

    private void normallogin_passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normallogin_passwordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_normallogin_passwordfieldActionPerformed

    private void normallogin_loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normallogin_loginbuttonActionPerformed
        
        String email = this.normallogin_emailfield.getText();
        String password = this.normallogin_passwordfield.getText();
        
        boolean loginok = this.controller.loginUtilizador(email, password);
        
        if (loginok == true) {
            
            this.OptionsMenu.setVisible(true);
            this.NormalLoginForm.setVisible(false);
            
            this.CurrentUserIDLabel.setText(this.controller.getUtilizadorAtualID());
                            
        } else {
            
            this.normallogin_emailfield.setText("");
            this.normallogin_passwordfield.setText("");
            
            JOptionPane.showMessageDialog(this, "As credenciais inseridas estão erradas! Tente novamente!");
        }
        
    }//GEN-LAST:event_normallogin_loginbuttonActionPerformed

    private void normallogin_backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normallogin_backbuttonActionPerformed
        
        this.NormalLoginForm.setVisible(false);
        this.setVisible(true);
        this.normallogin_emailfield.setText("");
        this.normallogin_passwordfield.setText("");
    }//GEN-LAST:event_normallogin_backbuttonActionPerformed

    private void OptionsMenu_UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsMenu_UploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OptionsMenu_UploadActionPerformed

    private void ReproduzirMenu_BibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproduzirMenu_BibliotecaActionPerformed
        
        this.ReproduzirMenu.setVisible(false);
        this.ReproduzirBibliotecaMenu.setVisible(true);
    }//GEN-LAST:event_ReproduzirMenu_BibliotecaActionPerformed

    private void ReproduzirMenu_AlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproduzirMenu_AlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReproduzirMenu_AlbumActionPerformed

    private void ReproduzirMenu_BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproduzirMenu_BackbuttonActionPerformed
        
        this.ReproduzirMenu.setVisible(false);
        this.OptionsMenu.setVisible(true);
    }//GEN-LAST:event_ReproduzirMenu_BackbuttonActionPerformed

    private void RepBiblio_PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepBiblio_PlayButtonActionPerformed
        
        String conteudoSelecionado = null;
        
        try {
            
            conteudoSelecionado = this.ReproduzirBiblioteca_ListaConteudo.getSelectedValue().toString();
                                    
        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(this.ReproduzirBibliotecaMenu, "Selecione um conteúdo!");
            return;
        }
        
        try {
                
            if (this.getExtensionOfFile(conteudoSelecionado).equals("mp4")) {
                
                String video_path = "DB/Content/" + conteudoSelecionado;

                Desktop.getDesktop().open(new File(video_path));
                            
            } else {
            
                this.currentContentPlayer.end();

                String music_path = "DB/Content/" + conteudoSelecionado;
               
                boolean canPlayContent;

                this.currentContentPlayer.setPath(music_path);

                canPlayContent = this.currentContentPlayer.play(0);

                if (canPlayContent == true) {

                    this.RepBiblioteca_CurrentContLabel.setText("Playing: " + conteudoSelecionado);

                } else {

                    this.RepBiblioteca_CurrentContLabel.setText("O ficheiro selecionado não pode ser reproduzido.");
                }

            }
            
        } catch (Exception ex) {
        
            Logger.getLogger(MediaCenter_GUI.class.getName()).log(Level.SEVERE, null, ex);       
        }        
    }//GEN-LAST:event_RepBiblio_PlayButtonActionPerformed

    private void RepBiblio_PauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepBiblio_PauseButtonActionPerformed
        
        this.currentContentPlayer.pause();
    }//GEN-LAST:event_RepBiblio_PauseButtonActionPerformed

    private void RepBiblio_ResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepBiblio_ResumeButtonActionPerformed
        
        this.currentContentPlayer.resume();
    }//GEN-LAST:event_RepBiblio_ResumeButtonActionPerformed

    private void RepBiblio_BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepBiblio_BackButtonActionPerformed
        
        this.ReproduzirBibliotecaMenu.setVisible(false);
        this.ReproduzirMenu.setVisible(true);
        this.currentContentPlayer.end();
    }//GEN-LAST:event_RepBiblio_BackButtonActionPerformed

    
    public void setInitialFormat() {
        
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));
        this.setTitle("Menu Inicial");
        
        this.PlayContentMenu.setLocationRelativeTo(null);
        this.PlayContentMenu.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.PlayContentMenu.setVisible(false);
        this.PlayContentMenu.setTitle("Menu Reproduzir");
                
        this.OptionsMenu.setLocationRelativeTo(null);
        this.OptionsMenu.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.OptionsMenu.setVisible(false);
        this.OptionsMenu.setTitle("Menu Principal");
        
        this.NormalLoginForm.setLocationRelativeTo(null);
        this.NormalLoginForm.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.NormalLoginForm.setVisible(false);
        this.NormalLoginForm.setTitle("Menu de Login");
     
        this.ReproduzirMenu.setLocationRelativeTo(null);
        this.ReproduzirMenu.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.ReproduzirMenu.setVisible(false);
        this.ReproduzirMenu.setTitle("Menu de Reproduzir");
        
        this.ReproduzirBibliotecaMenu.setLocationRelativeTo(null);
        this.ReproduzirBibliotecaMenu.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.ReproduzirBibliotecaMenu.setVisible(false);
        this.ReproduzirBibliotecaMenu.setTitle("Menu de Reproduzir");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.PlayContentMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.OptionsMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.NormalLoginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ReproduzirMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.ReproduzirBibliotecaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    private javax.swing.JFrame NormalLoginForm;
    private javax.swing.JLabel NormalLoginForm_Title;
    private javax.swing.JFrame OptionsMenu;
    private javax.swing.JLabel OptionsMenuNote;
    private javax.swing.JLabel OptionsMenuNote1;
    private javax.swing.JLabel OptionsMenuTitle;
    private javax.swing.JButton OptionsMenu_Logout;
    private javax.swing.JButton OptionsMenu_Upload;
    private javax.swing.JButton PauseButton;
    private javax.swing.JButton PlayContentBackButton;
    private javax.swing.JFrame PlayContentMenu;
    private javax.swing.JButton PlayMusicButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton RepBiblio_BackButton;
    private javax.swing.JButton RepBiblio_PauseButton;
    private javax.swing.JButton RepBiblio_PlayButton;
    private javax.swing.JButton RepBiblio_ResumeButton;
    private javax.swing.JScrollPane RepBiblio_ScrollLista;
    private javax.swing.JLabel RepBiblioteca_CurrentContLabel;
    private javax.swing.JFrame ReproduzirBibliotecaMenu;
    private javax.swing.JList<String> ReproduzirBiblioteca_ListaConteudo;
    private javax.swing.JLabel ReproduzirBiblioteca_MainTitle;
    private javax.swing.JButton ReproduzirConteudoButton;
    private javax.swing.JFrame ReproduzirMenu;
    private javax.swing.JButton ReproduzirMenu_Album;
    private javax.swing.JButton ReproduzirMenu_Backbutton;
    private javax.swing.JButton ReproduzirMenu_Biblioteca;
    private javax.swing.JLabel ReproduzirMenu_MainTitle;
    private javax.swing.JButton ResumeContentButton;
    private javax.swing.JLabel SelectMusicLabel;
    private javax.swing.JLabel email_label;
    private javax.swing.JButton normallogin_backbutton;
    private javax.swing.JTextField normallogin_emailfield;
    private javax.swing.JButton normallogin_loginbutton;
    private javax.swing.JTextField normallogin_passwordfield;
    private javax.swing.JLabel password_label;
    // End of variables declaration//GEN-END:variables

    private void updateBibliotecaList() {
    
        List<String> biblioteca = this.controller.getListaConteudoBiblioteca();

        DefaultListModel model = new DefaultListModel();
        model.clear();
        
        model.addAll(biblioteca);
        
        this.ReproduzirBiblioteca_ListaConteudo.setModel(model);
    }

    private Object getExtensionOfFile(String list_content_selected) {
        
        return FilenameUtils.getExtension(list_content_selected);
    }
}
