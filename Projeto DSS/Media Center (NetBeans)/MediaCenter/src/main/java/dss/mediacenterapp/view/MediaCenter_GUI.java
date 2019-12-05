
/*------------------------------------------------------------------------------*/

package dss.mediacenterapp.view;

/*------------------------------------------------------------------------------*/

import dss.mediacenterapp.controller.MediaCenterController;
import dss.pubsub.DSSObservable;
import dss.pubsub.DSSObserver;
import dss.mediacenterapp.externalplayer.ContentPlayer;
import dss.mediacenterapp.model.conteudo.Conteudo;
import java.awt.Desktop;

/*------------------------------------------------------------------------------*/

import java.awt.Dimension;
import java.io.File;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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

        Menu_OPTIONS = new javax.swing.JFrame();
        OPT_tittle = new javax.swing.JLabel();
        OPT_reproduzir = new javax.swing.JButton();
        OPT_note = new javax.swing.JLabel();
        OPT_useridlabel = new javax.swing.JLabel();
        OPT_logout = new javax.swing.JButton();
        OPT_upload = new javax.swing.JButton();
        Menu_LOGINform = new javax.swing.JFrame();
        LOGIN_tittle = new javax.swing.JLabel();
        LOGIN_emailfield = new javax.swing.JTextField();
        LOGIN_emaillabel = new javax.swing.JLabel();
        LOGIN_passfield = new javax.swing.JTextField();
        LOGIN_passlabel = new javax.swing.JLabel();
        LOGIN_ButtonLogin = new javax.swing.JButton();
        LOGIN_ButtonBack = new javax.swing.JButton();
        Menu_REPRODUZIRoptions = new javax.swing.JFrame();
        REPOPT_Tittle = new javax.swing.JLabel();
        REPOPT_note = new javax.swing.JLabel();
        REPOPT_ButtonBibliotecaMC = new javax.swing.JButton();
        REPOPT_ButtonAlbuns = new javax.swing.JButton();
        REPOPT_ButtonBack = new javax.swing.JButton();
        Menu_REPRODUZIR_biblioteca = new javax.swing.JFrame();
        REPBIBL_tittle = new javax.swing.JLabel();
        REPBIBL_scroll = new javax.swing.JScrollPane();
        REPBIBL_listaconteudo = new javax.swing.JList<>();
        REPBIBL_ButtonPlay = new javax.swing.JButton();
        REPBIBL_ButtonPause = new javax.swing.JButton();
        REPBIBL_ButtonResume = new javax.swing.JButton();
        REPBIBL_ButtonBack = new javax.swing.JButton();
        REPBIBL_currentcontentlabel = new javax.swing.JLabel();
        Menu_CHOOSEalbum = new javax.swing.JFrame();
        CHOOSEALB_tittle = new javax.swing.JLabel();
        CHOOSEALB_scroll = new javax.swing.JScrollPane();
        CHOOSEALB_listaalbuns = new javax.swing.JList<>();
        CHOOSEALB_ButtonRep = new javax.swing.JButton();
        CHOOSEALB_ButtonBack = new javax.swing.JButton();
        Menu_REPRODUZIR_album = new javax.swing.JFrame();
        REPALBUM_tittle = new javax.swing.JLabel();
        REPALBUM_scroll = new javax.swing.JScrollPane();
        REPALBUM_listaconteudo = new javax.swing.JList<>();
        REPALBUM_ButtonPlay = new javax.swing.JButton();
        REPALBUM_ButtonPause = new javax.swing.JButton();
        REPALBUM_ButtonResume = new javax.swing.JButton();
        REPALBUM_ButtonBack = new javax.swing.JButton();
        REPALBUM_ButtonCurrContent = new javax.swing.JLabel();
        REPALBUM_albumname = new javax.swing.JLabel();
        MAIN_tittle = new javax.swing.JLabel();
        MAIN_ButtonLogin = new javax.swing.JButton();
        MAIN_ButtonGuest = new javax.swing.JButton();
        MAIN_newuserlabel = new javax.swing.JLabel();
        MAIN_ButtonRegistar = new javax.swing.JButton();

        Menu_OPTIONS.setResizable(false);
        Menu_OPTIONS.setSize(new java.awt.Dimension(900, 600));

        OPT_tittle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        OPT_tittle.setForeground(new java.awt.Color(1, 1, 1));
        OPT_tittle.setText("Media Center");

        OPT_reproduzir.setBackground(java.awt.SystemColor.activeCaptionBorder);
        OPT_reproduzir.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        OPT_reproduzir.setText("Reproduzir");
        OPT_reproduzir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPT_reproduzirActionPerformed(evt);
            }
        });

        OPT_note.setFont(new java.awt.Font("Tlwg Typo", 2, 18)); // NOI18N
        OPT_note.setText("Nota: Outras funcionalidades encontram-se em desenvolvimento...");

        OPT_useridlabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        OPT_useridlabel.setText("User ID Label");

        OPT_logout.setText("Log-Out");
        OPT_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPT_logoutActionPerformed(evt);
            }
        });

        OPT_upload.setBackground(java.awt.SystemColor.activeCaptionBorder);
        OPT_upload.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        OPT_upload.setText("Upload");
        OPT_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPT_uploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_OPTIONSLayout = new javax.swing.GroupLayout(Menu_OPTIONS.getContentPane());
        Menu_OPTIONS.getContentPane().setLayout(Menu_OPTIONSLayout);
        Menu_OPTIONSLayout.setHorizontalGroup(
            Menu_OPTIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_OPTIONSLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(Menu_OPTIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_OPTIONSLayout.createSequentialGroup()
                        .addComponent(OPT_tittle)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_OPTIONSLayout.createSequentialGroup()
                        .addComponent(OPT_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_OPTIONSLayout.createSequentialGroup()
                        .addComponent(OPT_note)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_OPTIONSLayout.createSequentialGroup()
                        .addGroup(Menu_OPTIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OPT_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPT_reproduzir, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(239, 239, 239))))
            .addGroup(Menu_OPTIONSLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(OPT_useridlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Menu_OPTIONSLayout.setVerticalGroup(
            Menu_OPTIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_OPTIONSLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(OPT_useridlabel)
                .addGap(41, 41, 41)
                .addComponent(OPT_tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addComponent(OPT_reproduzir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(OPT_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(OPT_note)
                .addGap(73, 73, 73)
                .addComponent(OPT_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        Menu_LOGINform.setSize(new java.awt.Dimension(900, 600));

        LOGIN_tittle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        LOGIN_tittle.setForeground(new java.awt.Color(1, 1, 1));
        LOGIN_tittle.setText("Media Center");

        LOGIN_emailfield.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        LOGIN_emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_emailfieldActionPerformed(evt);
            }
        });

        LOGIN_emaillabel.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        LOGIN_emaillabel.setText("E-Mail:");

        LOGIN_passfield.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        LOGIN_passfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_passfieldActionPerformed(evt);
            }
        });

        LOGIN_passlabel.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        LOGIN_passlabel.setText("Password:");

        LOGIN_ButtonLogin.setText("Log-In");
        LOGIN_ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_ButtonLoginActionPerformed(evt);
            }
        });

        LOGIN_ButtonBack.setText("Back");
        LOGIN_ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_ButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_LOGINformLayout = new javax.swing.GroupLayout(Menu_LOGINform.getContentPane());
        Menu_LOGINform.getContentPane().setLayout(Menu_LOGINformLayout);
        Menu_LOGINformLayout.setHorizontalGroup(
            Menu_LOGINformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_LOGINformLayout.createSequentialGroup()
                .addGroup(Menu_LOGINformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_LOGINformLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(Menu_LOGINformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LOGIN_emaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LOGIN_emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LOGIN_passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LOGIN_passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Menu_LOGINformLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(LOGIN_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(Menu_LOGINformLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(LOGIN_ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LOGIN_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        Menu_LOGINformLayout.setVerticalGroup(
            Menu_LOGINformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_LOGINformLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(LOGIN_tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(LOGIN_emaillabel)
                .addGap(18, 18, 18)
                .addComponent(LOGIN_emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(LOGIN_passlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LOGIN_passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Menu_LOGINformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_LOGINformLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LOGIN_ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_LOGINformLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LOGIN_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        Menu_REPRODUZIRoptions.setSize(new java.awt.Dimension(900, 600));

        REPOPT_Tittle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        REPOPT_Tittle.setForeground(new java.awt.Color(1, 1, 1));
        REPOPT_Tittle.setText("Reproduzir");

        REPOPT_note.setFont(new java.awt.Font("Tlwg Typo", 2, 18)); // NOI18N
        REPOPT_note.setText("Nota: Outras funcionalidades encontram-se em desenvolvimento...");

        REPOPT_ButtonBibliotecaMC.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPOPT_ButtonBibliotecaMC.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPOPT_ButtonBibliotecaMC.setText("Biblioteca do Media Center");
        REPOPT_ButtonBibliotecaMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPOPT_ButtonBibliotecaMCActionPerformed(evt);
            }
        });

        REPOPT_ButtonAlbuns.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPOPT_ButtonAlbuns.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPOPT_ButtonAlbuns.setText("Albuns");
        REPOPT_ButtonAlbuns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPOPT_ButtonAlbunsActionPerformed(evt);
            }
        });

        REPOPT_ButtonBack.setText("Back");
        REPOPT_ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPOPT_ButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_REPRODUZIRoptionsLayout = new javax.swing.GroupLayout(Menu_REPRODUZIRoptions.getContentPane());
        Menu_REPRODUZIRoptions.getContentPane().setLayout(Menu_REPRODUZIRoptionsLayout);
        Menu_REPRODUZIRoptionsLayout.setHorizontalGroup(
            Menu_REPRODUZIRoptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_REPRODUZIRoptionsLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(REPOPT_Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(212, 212, 212))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_REPRODUZIRoptionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Menu_REPRODUZIRoptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_REPRODUZIRoptionsLayout.createSequentialGroup()
                        .addGroup(Menu_REPRODUZIRoptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(REPOPT_ButtonAlbuns, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REPOPT_ButtonBibliotecaMC, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_REPRODUZIRoptionsLayout.createSequentialGroup()
                        .addComponent(REPOPT_note)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_REPRODUZIRoptionsLayout.createSequentialGroup()
                        .addComponent(REPOPT_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        Menu_REPRODUZIRoptionsLayout.setVerticalGroup(
            Menu_REPRODUZIRoptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_REPRODUZIRoptionsLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(REPOPT_Tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(REPOPT_ButtonBibliotecaMC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(REPOPT_ButtonAlbuns, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(REPOPT_note)
                .addGap(29, 29, 29)
                .addComponent(REPOPT_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        Menu_REPRODUZIR_biblioteca.setSize(new java.awt.Dimension(900, 600));

        REPBIBL_tittle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        REPBIBL_tittle.setForeground(new java.awt.Color(1, 1, 1));
        REPBIBL_tittle.setText("Biblioteca");

        REPBIBL_listaconteudo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        REPBIBL_listaconteudo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        REPBIBL_scroll.setViewportView(REPBIBL_listaconteudo);

        REPBIBL_ButtonPlay.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPBIBL_ButtonPlay.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPBIBL_ButtonPlay.setText("Play");
        REPBIBL_ButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPBIBL_ButtonPlayActionPerformed(evt);
            }
        });

        REPBIBL_ButtonPause.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPBIBL_ButtonPause.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPBIBL_ButtonPause.setText("Pause");
        REPBIBL_ButtonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPBIBL_ButtonPauseActionPerformed(evt);
            }
        });

        REPBIBL_ButtonResume.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPBIBL_ButtonResume.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPBIBL_ButtonResume.setText("Resume");
        REPBIBL_ButtonResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPBIBL_ButtonResumeActionPerformed(evt);
            }
        });

        REPBIBL_ButtonBack.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPBIBL_ButtonBack.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPBIBL_ButtonBack.setText("Back");
        REPBIBL_ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPBIBL_ButtonBackActionPerformed(evt);
            }
        });

        REPBIBL_currentcontentlabel.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        REPBIBL_currentcontentlabel.setText("Nenhum conteúdo foi ainda selecionado da lista disponível...");

        javax.swing.GroupLayout Menu_REPRODUZIR_bibliotecaLayout = new javax.swing.GroupLayout(Menu_REPRODUZIR_biblioteca.getContentPane());
        Menu_REPRODUZIR_biblioteca.getContentPane().setLayout(Menu_REPRODUZIR_bibliotecaLayout);
        Menu_REPRODUZIR_bibliotecaLayout.setHorizontalGroup(
            Menu_REPRODUZIR_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_REPRODUZIR_bibliotecaLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(Menu_REPRODUZIR_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_REPRODUZIR_bibliotecaLayout.createSequentialGroup()
                        .addComponent(REPBIBL_tittle)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_REPRODUZIR_bibliotecaLayout.createSequentialGroup()
                        .addGroup(Menu_REPRODUZIR_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Menu_REPRODUZIR_bibliotecaLayout.createSequentialGroup()
                                .addComponent(REPBIBL_currentcontentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(REPBIBL_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Menu_REPRODUZIR_bibliotecaLayout.createSequentialGroup()
                                .addComponent(REPBIBL_ButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(REPBIBL_ButtonPause, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(REPBIBL_ButtonResume, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(REPBIBL_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))))
        );
        Menu_REPRODUZIR_bibliotecaLayout.setVerticalGroup(
            Menu_REPRODUZIR_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_REPRODUZIR_bibliotecaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(REPBIBL_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(Menu_REPRODUZIR_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REPBIBL_ButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPBIBL_ButtonResume, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPBIBL_ButtonPause, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(REPBIBL_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(Menu_REPRODUZIR_bibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REPBIBL_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPBIBL_currentcontentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        Menu_CHOOSEalbum.setSize(new java.awt.Dimension(900, 600));

        CHOOSEALB_tittle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        CHOOSEALB_tittle.setForeground(new java.awt.Color(1, 1, 1));
        CHOOSEALB_tittle.setText("Álbuns");

        CHOOSEALB_listaalbuns.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        CHOOSEALB_listaalbuns.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        CHOOSEALB_scroll.setViewportView(CHOOSEALB_listaalbuns);

        CHOOSEALB_ButtonRep.setBackground(java.awt.SystemColor.activeCaptionBorder);
        CHOOSEALB_ButtonRep.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        CHOOSEALB_ButtonRep.setText("Reproduzir ");
        CHOOSEALB_ButtonRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHOOSEALB_ButtonRepActionPerformed(evt);
            }
        });

        CHOOSEALB_ButtonBack.setBackground(java.awt.SystemColor.activeCaptionBorder);
        CHOOSEALB_ButtonBack.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        CHOOSEALB_ButtonBack.setText("Back");
        CHOOSEALB_ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHOOSEALB_ButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_CHOOSEalbumLayout = new javax.swing.GroupLayout(Menu_CHOOSEalbum.getContentPane());
        Menu_CHOOSEalbum.getContentPane().setLayout(Menu_CHOOSEalbumLayout);
        Menu_CHOOSEalbumLayout.setHorizontalGroup(
            Menu_CHOOSEalbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_CHOOSEalbumLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(CHOOSEALB_tittle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_CHOOSEalbumLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CHOOSEALB_ButtonRep, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(CHOOSEALB_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_CHOOSEalbumLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(CHOOSEALB_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        Menu_CHOOSEalbumLayout.setVerticalGroup(
            Menu_CHOOSEalbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_CHOOSEalbumLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(CHOOSEALB_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(CHOOSEALB_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(Menu_CHOOSEalbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHOOSEALB_ButtonRep, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHOOSEALB_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        Menu_REPRODUZIR_album.setSize(new java.awt.Dimension(900, 600));

        REPALBUM_tittle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        REPALBUM_tittle.setForeground(new java.awt.Color(1, 1, 1));
        REPALBUM_tittle.setText("Álbum");

        REPALBUM_listaconteudo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        REPALBUM_listaconteudo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        REPALBUM_scroll.setViewportView(REPALBUM_listaconteudo);

        REPALBUM_ButtonPlay.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPALBUM_ButtonPlay.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPALBUM_ButtonPlay.setText("Play");
        REPALBUM_ButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPALBUM_ButtonPlayActionPerformed(evt);
            }
        });

        REPALBUM_ButtonPause.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPALBUM_ButtonPause.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPALBUM_ButtonPause.setText("Pause");
        REPALBUM_ButtonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPALBUM_ButtonPauseActionPerformed(evt);
            }
        });

        REPALBUM_ButtonResume.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPALBUM_ButtonResume.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPALBUM_ButtonResume.setText("Resume");
        REPALBUM_ButtonResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPALBUM_ButtonResumeActionPerformed(evt);
            }
        });

        REPALBUM_ButtonBack.setBackground(java.awt.SystemColor.activeCaptionBorder);
        REPALBUM_ButtonBack.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        REPALBUM_ButtonBack.setText("Back");
        REPALBUM_ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPALBUM_ButtonBackActionPerformed(evt);
            }
        });

        REPALBUM_ButtonCurrContent.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        REPALBUM_ButtonCurrContent.setText("Nenhum conteúdo foi ainda selecionado da lista disponível...");

        REPALBUM_albumname.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        REPALBUM_albumname.setText("jLabel1");

        javax.swing.GroupLayout Menu_REPRODUZIR_albumLayout = new javax.swing.GroupLayout(Menu_REPRODUZIR_album.getContentPane());
        Menu_REPRODUZIR_album.getContentPane().setLayout(Menu_REPRODUZIR_albumLayout);
        Menu_REPRODUZIR_albumLayout.setHorizontalGroup(
            Menu_REPRODUZIR_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_REPRODUZIR_albumLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(Menu_REPRODUZIR_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_REPRODUZIR_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(Menu_REPRODUZIR_albumLayout.createSequentialGroup()
                            .addComponent(REPALBUM_ButtonCurrContent, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(REPALBUM_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Menu_REPRODUZIR_albumLayout.createSequentialGroup()
                            .addComponent(REPALBUM_ButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(REPALBUM_ButtonPause, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(157, 157, 157)
                            .addComponent(REPALBUM_ButtonResume, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(REPALBUM_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_REPRODUZIR_albumLayout.createSequentialGroup()
                        .addComponent(REPALBUM_tittle)
                        .addGap(40, 40, 40)
                        .addComponent(REPALBUM_albumname, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        Menu_REPRODUZIR_albumLayout.setVerticalGroup(
            Menu_REPRODUZIR_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_REPRODUZIR_albumLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(Menu_REPRODUZIR_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REPALBUM_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPALBUM_albumname))
                .addGap(39, 39, 39)
                .addGroup(Menu_REPRODUZIR_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REPALBUM_ButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPALBUM_ButtonResume, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPALBUM_ButtonPause, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(REPALBUM_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(Menu_REPRODUZIR_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REPALBUM_ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REPALBUM_ButtonCurrContent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 60));

        MAIN_tittle.setFont(new java.awt.Font("URW Palladio L", 3, 90)); // NOI18N
        MAIN_tittle.setForeground(new java.awt.Color(1, 1, 1));
        MAIN_tittle.setText("Media Center");

        MAIN_ButtonLogin.setBackground(java.awt.SystemColor.activeCaptionBorder);
        MAIN_ButtonLogin.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        MAIN_ButtonLogin.setText("Log-In");
        MAIN_ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAIN_ButtonLoginActionPerformed(evt);
            }
        });

        MAIN_ButtonGuest.setBackground(java.awt.SystemColor.activeCaptionBorder);
        MAIN_ButtonGuest.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        MAIN_ButtonGuest.setText("Convidado");
        MAIN_ButtonGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAIN_ButtonGuestActionPerformed(evt);
            }
        });

        MAIN_newuserlabel.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        MAIN_newuserlabel.setText("Novo Utente?");

        MAIN_ButtonRegistar.setBackground(java.awt.SystemColor.activeCaptionBorder);
        MAIN_ButtonRegistar.setFont(new java.awt.Font("Padauk Book", 0, 24)); // NOI18N
        MAIN_ButtonRegistar.setText("Registar");
        MAIN_ButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAIN_ButtonRegistarActionPerformed(evt);
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
                            .addComponent(MAIN_ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MAIN_ButtonGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MAIN_ButtonRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(MAIN_newuserlabel)))
                        .addGap(311, 311, 311))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MAIN_tittle)
                        .addGap(174, 174, 174))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(MAIN_tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(MAIN_ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MAIN_ButtonGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(MAIN_newuserlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MAIN_ButtonRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MAIN_ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAIN_ButtonLoginActionPerformed
        
        this.Menu_LOGINform.setVisible(true);
        this.setVisible(false);
        
        this.LOGIN_emailfield.setText("");
        this.LOGIN_passfield.setText("");
        
        this.OPT_upload.setEnabled(true);
        this.REPOPT_ButtonAlbuns.setEnabled(true);
        this.OPT_logout.setText("Logout");
    }//GEN-LAST:event_MAIN_ButtonLoginActionPerformed

    private void MAIN_ButtonGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAIN_ButtonGuestActionPerformed

        this.setVisible(false);
        this.Menu_OPTIONS.setVisible(true);
        this.controller.loginUtilizadorAsGuest();
        this.OPT_useridlabel.setText(this.controller.getUtilizadorAtualID());
        
        this.OPT_upload.setEnabled(false);
        this.REPOPT_ButtonAlbuns.setEnabled(false);
        this.OPT_logout.setText("Back");
    }//GEN-LAST:event_MAIN_ButtonGuestActionPerformed

    private void MAIN_ButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAIN_ButtonRegistarActionPerformed

        JOptionPane.showMessageDialog(this, "Funcionalidade de momento indisponível!");
    }//GEN-LAST:event_MAIN_ButtonRegistarActionPerformed

    private void OPT_reproduzirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPT_reproduzirActionPerformed

        this.updateBibliotecaList();
        
        //Se não for um guest
        if (!this.controller.getUtilizadorAtualID().equals("Guest: guest@mediacenter")) {
                    
            this.updateAlbunsList();
        }
        
        this.Menu_OPTIONS.setVisible(false);
        this.Menu_REPRODUZIRoptions.setVisible(true);
    }//GEN-LAST:event_OPT_reproduzirActionPerformed

    private void OPT_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPT_logoutActionPerformed
        
        if (this.controller.getNomeUtilizadorAtual().equals("Guest")) {
            
            //...é um guest
            
            this.Menu_OPTIONS.setVisible(false);
            this.setVisible(true);        

        } else {
                    
            this.Menu_OPTIONS.setVisible(false);
            this.setVisible(true);        

            JOptionPane.showMessageDialog(this, "Terminou sessão com sucesso!");
        }

        this.controller.logoutUtilizadorAtual();        
    }//GEN-LAST:event_OPT_logoutActionPerformed

    private void LOGIN_emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_emailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGIN_emailfieldActionPerformed

    private void LOGIN_passfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_passfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGIN_passfieldActionPerformed

    private void LOGIN_ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_ButtonLoginActionPerformed
        
        String email = this.LOGIN_emailfield.getText();
        String password = this.LOGIN_passfield.getText();
        
        boolean loginok = this.controller.loginUtilizador(email, password);
        
        if (loginok == true) {
            
            this.Menu_OPTIONS.setVisible(true);
            this.Menu_LOGINform.setVisible(false);
            
            this.OPT_useridlabel.setText(this.controller.getUtilizadorAtualID());
                            
        } else {
            
            this.LOGIN_emailfield.setText("");
            this.LOGIN_passfield.setText("");
            
            JOptionPane.showMessageDialog(this, "As credenciais inseridas estão erradas! Tente novamente!");
        }
        
    }//GEN-LAST:event_LOGIN_ButtonLoginActionPerformed

    private void LOGIN_ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_ButtonBackActionPerformed
        
        this.Menu_LOGINform.setVisible(false);
        this.setVisible(true);
        this.LOGIN_emailfield.setText("");
        this.LOGIN_passfield.setText("");
    }//GEN-LAST:event_LOGIN_ButtonBackActionPerformed

    private void OPT_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPT_uploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OPT_uploadActionPerformed

    private void REPOPT_ButtonBibliotecaMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPOPT_ButtonBibliotecaMCActionPerformed
        
        this.Menu_REPRODUZIRoptions.setVisible(false);
        this.Menu_REPRODUZIR_biblioteca.setVisible(true);
    }//GEN-LAST:event_REPOPT_ButtonBibliotecaMCActionPerformed

    private void REPOPT_ButtonAlbunsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPOPT_ButtonAlbunsActionPerformed
        
        this.Menu_REPRODUZIRoptions.setVisible(false);
        this.Menu_CHOOSEalbum.setVisible(true);
    }//GEN-LAST:event_REPOPT_ButtonAlbunsActionPerformed

    private void REPOPT_ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPOPT_ButtonBackActionPerformed
        
        this.Menu_REPRODUZIRoptions.setVisible(false);
        this.Menu_OPTIONS.setVisible(true);
    }//GEN-LAST:event_REPOPT_ButtonBackActionPerformed

    private void REPBIBL_ButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPBIBL_ButtonPlayActionPerformed
        
        String conteudoSelecionado = null;
        
        try {
            
            conteudoSelecionado = this.REPBIBL_listaconteudo.getSelectedValue().toString();
                                    
        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(this.Menu_REPRODUZIR_biblioteca, "Selecione um conteúdo!");
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

                    this.REPBIBL_currentcontentlabel.setText("Playing: " + conteudoSelecionado);

                } else {

                    this.REPBIBL_currentcontentlabel.setText("O ficheiro selecionado não pode ser reproduzido.");
                }

            }
            
        } catch (Exception ex) {
        
            JOptionPane.showMessageDialog(null, "O ficheiro selecionado não pode ser reproduzido.");
        }        
    }//GEN-LAST:event_REPBIBL_ButtonPlayActionPerformed

    private void REPBIBL_ButtonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPBIBL_ButtonPauseActionPerformed
        
        this.currentContentPlayer.pause();
    }//GEN-LAST:event_REPBIBL_ButtonPauseActionPerformed

    private void REPBIBL_ButtonResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPBIBL_ButtonResumeActionPerformed
        
        this.currentContentPlayer.resume();
    }//GEN-LAST:event_REPBIBL_ButtonResumeActionPerformed

    private void REPBIBL_ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPBIBL_ButtonBackActionPerformed
        
        this.Menu_REPRODUZIR_biblioteca.setVisible(false);
        this.Menu_REPRODUZIRoptions.setVisible(true);
        this.currentContentPlayer.end();
    }//GEN-LAST:event_REPBIBL_ButtonBackActionPerformed

    private void CHOOSEALB_ButtonRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOOSEALB_ButtonRepActionPerformed
        
        String nomeAlbum = this.CHOOSEALB_listaalbuns.getSelectedValue().toString();
        
        List<Conteudo> conteudoAlbum = this.controller.getListaConteudoAlbum(nomeAlbum);

        //--------------------------------------------------------------------------------
                
        DefaultListModel model = new DefaultListModel();
        model.clear();
        
        model.addAll(conteudoAlbum);
        
        //--------------------------------------------------------------------------------

        this.REPALBUM_listaconteudo.setModel(model);
         
        this.REPALBUM_albumname.setText(nomeAlbum);
        
        this.Menu_CHOOSEalbum.setVisible(false);
        this.Menu_REPRODUZIR_album.setVisible(true);
         
    }//GEN-LAST:event_CHOOSEALB_ButtonRepActionPerformed

    private void REPALBUM_ButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPALBUM_ButtonPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REPALBUM_ButtonPlayActionPerformed

    private void REPALBUM_ButtonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPALBUM_ButtonPauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REPALBUM_ButtonPauseActionPerformed

    private void REPALBUM_ButtonResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPALBUM_ButtonResumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REPALBUM_ButtonResumeActionPerformed

    private void REPALBUM_ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPALBUM_ButtonBackActionPerformed
        
        this.Menu_CHOOSEalbum.setVisible(false);
        this.Menu_CHOOSEalbum.setVisible(true);
    }//GEN-LAST:event_REPALBUM_ButtonBackActionPerformed

    private void CHOOSEALB_ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHOOSEALB_ButtonBackActionPerformed
        
        this.Menu_CHOOSEalbum.setVisible(false);
        this.Menu_REPRODUZIRoptions.setVisible(true);
    }//GEN-LAST:event_CHOOSEALB_ButtonBackActionPerformed

    
    public void setInitialFormat() {
        
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));
        this.setTitle("Menu Inicial");
      
        this.Menu_CHOOSEalbum.setLocationRelativeTo(null);
        this.Menu_CHOOSEalbum.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.Menu_CHOOSEalbum.setVisible(false);
        this.Menu_CHOOSEalbum.setTitle("Álbuns");   
        
        this.Menu_OPTIONS.setLocationRelativeTo(null);
        this.Menu_OPTIONS.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.Menu_OPTIONS.setVisible(false);
        this.Menu_OPTIONS.setTitle("Menu Principal");
        
        this.Menu_LOGINform.setLocationRelativeTo(null);
        this.Menu_LOGINform.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.Menu_LOGINform.setVisible(false);
        this.Menu_LOGINform.setTitle("Menu de Login");
     
        this.Menu_REPRODUZIRoptions.setLocationRelativeTo(null);
        this.Menu_REPRODUZIRoptions.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.Menu_REPRODUZIRoptions.setVisible(false);
        this.Menu_REPRODUZIRoptions.setTitle("Menu de Reproduzir");
        
        this.Menu_REPRODUZIR_biblioteca.setLocationRelativeTo(null);
        this.Menu_REPRODUZIR_biblioteca.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.Menu_REPRODUZIR_biblioteca.setVisible(false);
        this.Menu_REPRODUZIR_biblioteca.setTitle("Biblioteca do Media Center");

        this.Menu_REPRODUZIR_album.setLocationRelativeTo(null);
        this.Menu_REPRODUZIR_album.setPreferredSize(new Dimension(WINDOW_X, WINDOW_Y));       
        this.Menu_REPRODUZIR_album.setVisible(false);
        this.Menu_REPRODUZIR_album.setTitle("Conteúdo do Álbum");        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Menu_OPTIONS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Menu_LOGINform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Menu_REPRODUZIRoptions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Menu_REPRODUZIR_biblioteca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Menu_CHOOSEalbum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.Menu_REPRODUZIR_album.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    private javax.swing.JButton CHOOSEALB_ButtonBack;
    private javax.swing.JButton CHOOSEALB_ButtonRep;
    private javax.swing.JList<String> CHOOSEALB_listaalbuns;
    private javax.swing.JScrollPane CHOOSEALB_scroll;
    private javax.swing.JLabel CHOOSEALB_tittle;
    private javax.swing.JButton LOGIN_ButtonBack;
    private javax.swing.JButton LOGIN_ButtonLogin;
    private javax.swing.JTextField LOGIN_emailfield;
    private javax.swing.JLabel LOGIN_emaillabel;
    private javax.swing.JTextField LOGIN_passfield;
    private javax.swing.JLabel LOGIN_passlabel;
    private javax.swing.JLabel LOGIN_tittle;
    private javax.swing.JButton MAIN_ButtonGuest;
    private javax.swing.JButton MAIN_ButtonLogin;
    private javax.swing.JButton MAIN_ButtonRegistar;
    private javax.swing.JLabel MAIN_newuserlabel;
    private javax.swing.JLabel MAIN_tittle;
    private javax.swing.JFrame Menu_CHOOSEalbum;
    private javax.swing.JFrame Menu_LOGINform;
    private javax.swing.JFrame Menu_OPTIONS;
    private javax.swing.JFrame Menu_REPRODUZIR_album;
    private javax.swing.JFrame Menu_REPRODUZIR_biblioteca;
    private javax.swing.JFrame Menu_REPRODUZIRoptions;
    private javax.swing.JButton OPT_logout;
    private javax.swing.JLabel OPT_note;
    private javax.swing.JButton OPT_reproduzir;
    private javax.swing.JLabel OPT_tittle;
    private javax.swing.JButton OPT_upload;
    private javax.swing.JLabel OPT_useridlabel;
    private javax.swing.JButton REPALBUM_ButtonBack;
    private javax.swing.JLabel REPALBUM_ButtonCurrContent;
    private javax.swing.JButton REPALBUM_ButtonPause;
    private javax.swing.JButton REPALBUM_ButtonPlay;
    private javax.swing.JButton REPALBUM_ButtonResume;
    private javax.swing.JLabel REPALBUM_albumname;
    private javax.swing.JList<String> REPALBUM_listaconteudo;
    private javax.swing.JScrollPane REPALBUM_scroll;
    private javax.swing.JLabel REPALBUM_tittle;
    private javax.swing.JButton REPBIBL_ButtonBack;
    private javax.swing.JButton REPBIBL_ButtonPause;
    private javax.swing.JButton REPBIBL_ButtonPlay;
    private javax.swing.JButton REPBIBL_ButtonResume;
    private javax.swing.JLabel REPBIBL_currentcontentlabel;
    private javax.swing.JList<String> REPBIBL_listaconteudo;
    private javax.swing.JScrollPane REPBIBL_scroll;
    private javax.swing.JLabel REPBIBL_tittle;
    private javax.swing.JButton REPOPT_ButtonAlbuns;
    private javax.swing.JButton REPOPT_ButtonBack;
    private javax.swing.JButton REPOPT_ButtonBibliotecaMC;
    private javax.swing.JLabel REPOPT_Tittle;
    private javax.swing.JLabel REPOPT_note;
    // End of variables declaration//GEN-END:variables

    private void updateBibliotecaList() {
    
        List<String> biblioteca = this.controller.getListaConteudoBiblioteca();

        DefaultListModel model = new DefaultListModel();
        model.clear();
        
        model.addAll(biblioteca);
        
        this.REPBIBL_listaconteudo.setModel(model);
    }
    
    private void updateAlbunsList() {
        
        List<String> nomesAlbuns = this.controller.getListaAlbunsUserAtual();
        
        DefaultListModel model = new DefaultListModel();
        model.clear();
        
        model.addAll(nomesAlbuns);
        
        this.CHOOSEALB_listaalbuns.setModel(model);
    }

    private Object getExtensionOfFile(String list_content_selected) {
        
        return FilenameUtils.getExtension(list_content_selected);
    }
}
