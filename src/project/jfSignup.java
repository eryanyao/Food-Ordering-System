/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author yanyao
 */
public class jfSignup extends javax.swing.JFrame {

    /**
     * Creates new form jfSignup1
     */
        public jfSignup() {
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

        tfpass1 = new javax.swing.JPasswordField();
        jlSignUp = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jlUser = new javax.swing.JLabel();
        tfContact = new javax.swing.JTextField();
        jlPasswd = new javax.swing.JLabel();
        jlRePasswd = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jlName = new javax.swing.JLabel();
        jlContact = new javax.swing.JLabel();
        jlDelivery = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        tfUser = new javax.swing.JTextField();
        tfPass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfAddress = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");

        tfpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpass1ActionPerformed(evt);
            }
        });

        jlSignUp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlSignUp.setText("Sign Up");

        jlUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlUser.setText("User ID");

        tfContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfContactKeyTyped(evt);
            }
        });

        jlPasswd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPasswd.setText("Password");

        jlRePasswd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlRePasswd.setText("Re-Password");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jlName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlName.setText("Real Name");

        jlContact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlContact.setText("Contact Number");

        jlDelivery.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDelivery.setText("Delivery Address");

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });

        tfAddress.setColumns(20);
        tfAddress.setRows(5);
        jScrollPane1.setViewportView(tfAddress);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlUser)
                            .addComponent(jlRePasswd)
                            .addComponent(jlPasswd)
                            .addComponent(jlName)
                            .addComponent(jlContact)
                            .addComponent(jlDelivery))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSignUp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReturn))
                            .addComponent(tfUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfpass1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfContact, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnSubmit)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnReturn)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlSignUp)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUser)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPasswd)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRePasswd)
                    .addComponent(tfpass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlContact)
                    .addComponent(tfContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDelivery)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpass1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if(tfUser.getText().isEmpty()||tfPass.getText().isEmpty()||tfpass1.getText().isEmpty()||
            tfName.getText().isEmpty()||tfContact.getText().isEmpty()||tfAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please key in all detail.");
        }
        else if(!tfPass.getText().equals(tfpass1.getText()))
        {
            JOptionPane.showMessageDialog(null, "Please Enter the same password.");
            tfPass.setText("");
            tfpass1.setText("");
        }
       
        else
        {
             String User = tfUser.getText().toLowerCase();
             String Password = tfPass.getText();
             String Name = tfName.getText().toUpperCase();
             String Contact = tfContact.getText();
             String Address = tfAddress.getText().toUpperCase();
            
             Member mem = new Member(User,Password,Name,Contact,Address);
            
             LSystem.acc[LSystem.c] = mem;
            String msg = LSystem.acc[LSystem.c].toString();

            JOptionPane.showMessageDialog(null, msg);
            JOptionPane.showMessageDialog(null, "We will go to the login page.");
            this.setVisible(false);
            jfLogin login = new jfLogin();
            login.setVisible(true);
            
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        jfWelcome welcome = new jfWelcome();
        this.setVisible(false);
        welcome.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassActionPerformed

    private void tfContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContactKeyTyped
       char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber)) 
         ||  (iNumber == KeyEvent.VK_BACK_SPACE ) 
         || (iNumber == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }            
    }//GEN-LAST:event_tfContactKeyTyped

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
            java.util.logging.Logger.getLogger(jfSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlContact;
    private javax.swing.JLabel jlDelivery;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPasswd;
    private javax.swing.JLabel jlRePasswd;
    private javax.swing.JLabel jlSignUp;
    private javax.swing.JLabel jlUser;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfContact;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUser;
    private javax.swing.JPasswordField tfpass1;
    // End of variables declaration//GEN-END:variables
}
