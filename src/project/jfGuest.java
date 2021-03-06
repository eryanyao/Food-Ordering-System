/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author yanyao
 */
public class jfGuest extends javax.swing.JFrame {

    /**
     * Creates new form jfGuest
     */
    public jfGuest() {
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

        jlIns = new javax.swing.JLabel();
        jlGuest = new javax.swing.JLabel();
        jlName = new javax.swing.JLabel();
        jlCont = new javax.swing.JLabel();
        jlDelivery = new javax.swing.JLabel();
        jfName = new javax.swing.JTextField();
        jfCont = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JToggleButton();
        btnReturn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jfAdd = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUEST INFORMATION");

        jlIns.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlIns.setText("#Please Provide the Information we need.");

        jlGuest.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlGuest.setText("Guest Information");

        jlName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlName.setText("Name");

        jlCont.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlCont.setText("Contact Number");

        jlDelivery.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jlDelivery.setText("Delivery Address");

        jfName.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jfCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfContActionPerformed(evt);
            }
        });
        jfCont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jfContKeyTyped(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jfAdd.setColumns(20);
        jfAdd.setRows(5);
        jScrollPane1.setViewportView(jfAdd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlIns))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlName)
                            .addComponent(jlCont)
                            .addComponent(jlDelivery))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubmit)
                            .addComponent(jfName, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jfCont)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jlGuest)
                        .addGap(33, 33, 33)
                        .addComponent(btnReturn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlIns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGuest)
                    .addComponent(btnReturn))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlName)
                    .addComponent(jfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCont)
                    .addComponent(jfCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDelivery)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jfContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfContActionPerformed
        
    }//GEN-LAST:event_jfContActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        jfWelcome welcome = new jfWelcome();
        this.setVisible(false);
        welcome.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        if(jfName.getText().isEmpty()||jfCont.getText().isEmpty()||jfAdd.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please key in all information.");
        }
        else
        {
            String Name = jfName.getText().toUpperCase();
            String Contact = jfCont.getText();
            String Address = jfAdd.getText().toUpperCase();
            Guest guest = new Guest(Name,Contact,Address);
            LSystem.acc[LSystem.c] = guest;
            
            JOptionPane.showMessageDialog(null, LSystem.acc[LSystem.c].toString());
            JOptionPane.showMessageDialog(null, "Welcome, " + LSystem.acc[LSystem.c].getName() + ".");
            JOptionPane.showMessageDialog(null, "You got a change to earn a discount voucher.");
            this.setVisible(false);
            jfDiscount discount = new jfDiscount();
            discount.setVisible(true);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jfContKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfContKeyTyped
       char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber)) 
         ||  (iNumber == KeyEvent.VK_BACK_SPACE ) 
         || (iNumber == KeyEvent.VK_DELETE))
       {
           evt.consume();
       }            
    }//GEN-LAST:event_jfContKeyTyped

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
            java.util.logging.Logger.getLogger(jfGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfGuest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JToggleButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jfAdd;
    private javax.swing.JTextField jfCont;
    private javax.swing.JTextField jfName;
    private javax.swing.JLabel jlCont;
    private javax.swing.JLabel jlDelivery;
    private javax.swing.JLabel jlGuest;
    private javax.swing.JLabel jlIns;
    private javax.swing.JLabel jlName;
    // End of variables declaration//GEN-END:variables
}
