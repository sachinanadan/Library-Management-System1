/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author rosha
 */
public class NEWSTUDENT extends javax.swing.JFrame {

    /**
     * Creates new form NEWSTUDENT
     */
    public NEWSTUDENT() {
        initComponents();
        connect();
    }
    Connection con;
    PreparedStatement pst;
    
    public void connect() 
    {
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

        jLabel6 = new javax.swing.JLabel();
        TXTLN = new javax.swing.JTextField();
        TXTSI = new javax.swing.JTextField();
        TXTC = new javax.swing.JTextField();
        TXTN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TXTE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("STUDENT ID:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));
        getContentPane().add(TXTLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 231, -1));
        getContentPane().add(TXTSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 231, -1));
        getContentPane().add(TXTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 231, -1));
        getContentPane().add(TXTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 231, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("                      NEW STUDENT REGISTERATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 730, 95));
        getContentPane().add(TXTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 231, -1));

        jLabel2.setText("FIRST NAME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel3.setText("LAST NAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        jLabel4.setText("EMAIL ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        jLabel5.setText("CONTACT NO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 80, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\rosha\\Desktop\\library management\\login\\retuenbook.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
         try {
            String tfn=TXTN.getText();
            String tln=TXTLN.getText();
            String tsi=TXTSI.getText();
            String tcn=TXTC.getText();
            String te=TXTE.getText();
                        
            String sql = "insert into newstudent values(?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, tfn);
            pst.setString(2, tln);
            pst.setString(3, tsi);
            pst.setString(4, tcn);
            pst.setString(5, te);
            
             Statement st = con.createStatement();
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data insert successful..");
        } catch (SQLException ex) {
            Logger.getLogger(NEWSTUDENT.class.getName()).log(Level.SEVERE, null, ex);
        } 
        TXTN.setText("");
         TXTLN.setText("");
         TXTSI.setText("");
         TXTC.setText("");
         TXTE.setText("");
         TXTN.requestFocus();
         
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
            java.util.logging.Logger.getLogger(NEWSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NEWSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NEWSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NEWSTUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NEWSTUDENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTC;
    private javax.swing.JTextField TXTE;
    private javax.swing.JTextField TXTLN;
    private javax.swing.JTextField TXTN;
    private javax.swing.JTextField TXTSI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
