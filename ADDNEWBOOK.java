/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rosha
 */
public class ADDNEWBOOK extends javax.swing.JFrame {

    /** Creates new form ADDNEWBOOK */
    public ADDNEWBOOK() {
        initComponents();
         connect();
    }
    Connection con;
     PreparedStatement pst;

    public void connect(){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","root");
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
        System.out.println("connection done");
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXTBI = new javax.swing.JTextField();
        TXTBN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TXTAN = new javax.swing.JTextField();
        TXTBT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBIActionPerformed(evt);
            }
        });
        getContentPane().add(TXTBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 158, -1));

        TXTBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBNActionPerformed(evt);
            }
        });
        getContentPane().add(TXTBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 163, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("    ADD NEW BOOK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 268, 65));
        getContentPane().add(TXTAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 163, -1));
        getContentPane().add(TXTBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 163, -1));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("BOOK NAME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("AUTHOR NAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("BOOK TYPE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("BOOK ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\rosha\\Desktop\\library management\\login\\isssue book.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -80, 740, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TXTBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBIActionPerformed

    private void TXTBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        try {
            String tbi=TXTBI.getText();
            String tbn=TXTBN.getText();
            String tba=TXTAN.getText();
            String tbt=TXTBT.getText();
            
            String sql = "insert into newbook values(?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, tbi);
            pst.setString(2, tbn);
            pst.setString(3, tba);
            pst.setString(4, tbt);
            
            Statement st = con.createStatement();
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data insert successful..");
            
        } catch (SQLException e) {
            
             Logger.getLogger(ADDNEWBOOK.class.getName()).log(Level.SEVERE, null, e);
        }
        TXTBI.setText("");
        TXTBN.setText("");
        TXTAN.setText("");
        TXTBT.setText("");
        TXTBI.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        HOME h = new HOME();
        h.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ADDNEWBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADDNEWBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADDNEWBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADDNEWBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADDNEWBOOK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTAN;
    private javax.swing.JTextField TXTBI;
    private javax.swing.JTextField TXTBN;
    private javax.swing.JTextField TXTBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
