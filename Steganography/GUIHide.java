import java.awt.TextField;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUIHide extends javax.swing.JFrame {

    private Steganography steg;
    private RppRPE rpp;
    private String coverMediaDirektori;
    private BufferedImage image;

    /**
     * Creates new form Hiding
     */
    public GUIHide() {
        initComponents();
        //Steganography steg;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        keyTextField = new javax.swing.JTextField();
        coverMediaTextField = new javax.swing.JTextField();
        secretMessageTextField = new javax.swing.JTextField();
        proccessButton = new javax.swing.JButton();
        browseButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        saveToTextField = new javax.swing.JTextField();
        saveToButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        proccessButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Penyisipan Pesan Modifikasi RPP dengan RPE");

        jLabel1.setText("Gambar Asli");

        jLabel2.setText("Pesan Rahasia");

        jLabel4.setText("Kunci");

        keyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyTextFieldActionPerformed(evt);
            }
        });

        coverMediaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coverMediaTextFieldActionPerformed(evt);
            }
        });

        secretMessageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secretMessageTextFieldActionPerformed(evt);
            }
        });

        proccessButton.setText("Sisipkan");
        proccessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proccessButtonActionPerformed(evt);
            }
        });

        browseButton.setText("Cari");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        backButton.setText("Kembali");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        saveToTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToTextFieldActionPerformed(evt);
            }
        });

        saveToButton.setText("Cari");
        saveToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Simpan di");

        proccessButton1.setText("Reset");
        proccessButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proccessButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("FORM PENYISIPAN PESAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secretMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(coverMediaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(browseButton))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(keyTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveToTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(saveToButton)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(proccessButton)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(proccessButton1)
                        .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coverMediaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(browseButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(secretMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(saveToTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(saveToButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(proccessButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proccessButton1)
                    .addComponent(backButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyTextFieldActionPerformed

    private void coverMediaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coverMediaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coverMediaTextFieldActionPerformed

    private void proccessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proccessButtonActionPerformed
        boolean isCoverMedia = !coverMediaTextField.getText().isEmpty();
        boolean isSecretMessage = !secretMessageTextField.getText().isEmpty();
        boolean isBMP = coverMediaTextField.getText().contains(".bmp");
        System.out.println("isCoverMedia = "+isCoverMedia);
        System.out.println("isSecretMessage = "+ isSecretMessage);
        System.out.println("isBMP = "+ isBMP);
        if (isCoverMedia && isSecretMessage && isBMP) {
            CoverMedia coverImage = null;
            try {
                coverImage = new CoverMedia(coverMediaTextField.getText());
                try {
                    coverImage.ImageType();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Format gambar harus bitmap");
                }

            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(GUIHide.class.getName()).log(Level.SEVERE, null, ex);

            }
            Steganography steg = new Steganography() {
            };
            SecretMessage message = new SecretMessage(secretMessageTextField.getText());
            String newDir = saveToTextField.getText();
            String secretMessage = secretMessageTextField.getText();
            steg.hide(coverImage, message, newDir);
            {
                RppRPE rpp = new RppRPE();
                if (rpp.message_validation(message, coverImage)) {
                    rpp.hide(coverImage, message, newDir);
                    keyTextField.setText(rpp.Get_Seed());
                }else{
                    messageTooLong();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Periksa kembali inputan atau metode yang dipilih");
        }
    }//GEN-LAST:event_proccessButtonActionPerformed

    private void messageTooLong(){
        keyTextField.setText("");
        JOptionPane.showMessageDialog(rootPane, "Panjang pesan lebih besar daripada ukuran piksel pada gambar!");
    }
    
    private void secretMessageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secretMessageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secretMessageTextFieldActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        chooser.setDialogTitle("Choose image : ");
        chooser.setAcceptAllFileFilterUsed(false);
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            try {
                image = ImageIO.read(selectedFile);

            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(GUIHide.class.getName()).log(Level.SEVERE, null, ex);
            }
            String path = selectedFile.getAbsolutePath();
            coverMediaTextField.setText(path);
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "No File Selected");
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        GUIRppRPE rpprpe = new GUIRppRPE();
        rpprpe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveToTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveToTextFieldActionPerformed

    private void saveToButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToButtonActionPerformed
        String choosertitle = "";
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        File selectedFile = chooser.getSelectedFile();
        //    
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String path = chooser.getSelectedFile().getPath();
            saveToTextField.setText(path);
        } else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_saveToButtonActionPerformed

    private void proccessButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proccessButton1ActionPerformed
        coverMediaTextField.setText(null);
        secretMessageTextField.setText(null);
        saveToTextField.setText(null);
        keyTextField.setText(null);
    }//GEN-LAST:event_proccessButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIHide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIHide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIHide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIHide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton browseButton;
    private javax.swing.JTextField coverMediaTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField keyTextField;
    private javax.swing.JButton proccessButton;
    private javax.swing.JButton proccessButton1;
    private javax.swing.JButton saveToButton;
    private javax.swing.JTextField saveToTextField;
    private javax.swing.JTextField secretMessageTextField;
    // End of variables declaration//GEN-END:variables
}
