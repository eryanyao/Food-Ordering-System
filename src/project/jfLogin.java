/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author yanyao
 */
public class jfLogin extends javax.swing.JFrame {

    /**
     * Creates new form jfLogin
     */
    public jfLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlLogin = new javax.swing.JLabel();
        jlUser = new javax.swing.JLabel();
        jlPasswd = new javax.swing.JLabel();
        tfuser = new javax.swing.JTextField();
        tfPass = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jlIns = new javax.swing.JLabel();
        jlSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlLogin.setText("LOGIN");

        jlUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlUser.setText("User ID");

        jlPasswd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPasswd.setText("Password");

        tfuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfuserActionPerformed(evt);
            }
        });

        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReturn.setText("RETURN");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jlIns.setText("No Member? Please");

        jlSignUp.setText("Sign Up");
        jlSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlPasswd)
                            .addComponent(jlUser)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfuser, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(btnReturn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jlIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlSignUp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(jlLogin))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlUser))
                        .addGap(43, 43, 43)
                        .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jlPasswd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIns)
                    .addComponent(jlSignUp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfuserActionPerformed

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        jfWelcome welcome = new jfWelcome();
        this.setVisible(false);
        welcome.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed
     
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
          jfMenu menu = new jfMenu();
          jfDiscount discount = new jfDiscount();
              
          if(tfuser.getText().isEmpty()||tfPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter the empty.");
        }
         else
         {
          
             String user = tfuser.getText().toLowerCase();
             String passwd = tfPass.getText();
                   if(user.equals(LSystem.acc[LSystem.c].getUserName())&&
                         passwd.equals(LSystem.acc[LSystem.c].getPassword()))
                     {
                         JOptionPane.showMessageDialog(null, "Welcome back!\n"+
                                                                                      LSystem.acc[LSystem.c].getName());
                         JOptionPane.showMessageDialog(null, "You got a change to earn a discount voucher.");
                        
                          this.setVisible(false);
                         
                          discount.setVisible(true);
                     }
                     else
                    {
                    JOptionPane.showMessageDialog(null, "Please Enter the correct username or password!");
                    tfuser.setText("");
                    tfPass.setText("");
                    }
         }
         
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jlSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlSignUpActionPerformed
        this.setVisible(false);
        jfSignup sign = new jfSignup();
        sign.setVisible(true);
    }//GEN-LAST:event_jlSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new jfLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jlIns;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlPasswd;
    private javax.swing.JButton jlSignUp;
    private javax.swing.JLabel jlUser;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfuser;
    // End of variables declaration//GEN-END:variables
}