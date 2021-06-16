/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author yanyao
 */
public class jfWelcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public jfWelcome() {
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

        btnGrp = new javax.swing.ButtonGroup();
        btnOrder = new javax.swing.JButton();
        guest = new javax.swing.JRadioButton();
        member = new javax.swing.JRadioButton();
        jlWel = new javax.swing.JLabel();
        jlSign = new javax.swing.JButton();
        pic = new javax.swing.JPanel();
        jlpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME");

        btnOrder.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOrder.setText("ORDER NOW");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnGrp.add(guest);
        guest.setText("As a Guest");

        btnGrp.add(member);
        member.setText("Member");
        member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberActionPerformed(evt);
            }
        });

        jlWel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlWel.setText("Welcome to Our Online Ordering System");

        jlSign.setText("Sign Up");
        jlSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlSignActionPerformed(evt);
            }
        });

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pic.setForeground(new java.awt.Color(255, 102, 102));
        pic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pic.setInheritsPopupMenu(true);

        jlpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index.jpg"))); // NOI18N

        javax.swing.GroupLayout picLayout = new javax.swing.GroupLayout(pic);
        pic.setLayout(picLayout);
        picLayout.setHorizontalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlpic, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        picLayout.setVerticalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlpic, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(guest)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(member))
                                .addComponent(btnOrder))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlWel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jlSign)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jlWel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guest)
                    .addComponent(member))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSign)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pic.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        if(btnGrp.isSelected(null))
        { 
            JOptionPane.showMessageDialog(null, "Please select an choose.");
        } 
        else
        {
            if(guest.isSelected())
            {
                jfGuest guest = new jfGuest();
                guest.setVisible(true);
            }
            else if(member.isSelected())
            {
              jfLogin login = new jfLogin();
              login.setVisible(true);
            }
            this.setVisible(false);
        } 
        
          
        
    }//GEN-LAST:event_btnOrderActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberActionPerformed

    private void jlSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlSignActionPerformed
        jfSignup signup = new jfSignup();
        this.setVisible(false);
        signup.setVisible(true);
    }//GEN-LAST:event_jlSignActionPerformed

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
            java.util.logging.Logger.getLogger(jfWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfWelcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JButton btnOrder;
    private javax.swing.JRadioButton guest;
    private javax.swing.JButton jlSign;
    private javax.swing.JLabel jlWel;
    private javax.swing.JLabel jlpic;
    private javax.swing.JRadioButton member;
    private javax.swing.JPanel pic;
    // End of variables declaration//GEN-END:variables
}