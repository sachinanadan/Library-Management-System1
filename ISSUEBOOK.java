/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rosha
 */
public class ISSUEBOOK extends javax.swing.JFrame {

    /**
     * Creates new form ISSUEBOOK
     */
    public ISSUEBOOK() {
        initComponents();
        connect();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsi = new javax.swing.JTextField();
        txtbn = new javax.swing.JTextField();
        txtdate1 = new com.toedter.calendar.JDateChooser();
        txtdate2 = new com.toedter.calendar.JDateChooser();
        btn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISSUE BOOK ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -10, -1, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STUDENT ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BOOK NAME:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ISSUE DATE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DUE DATE:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 100, -1));

        txtsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsiActionPerformed(evt);
            }
        });
        getContentPane().add(txtsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 141, -1));
        getContentPane().add(txtbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 140, -1));
        getContentPane().add(txtdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 148, -1));
        getContentPane().add(txtdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 148, -1));

        btn1.setText("SUBMIT");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 466, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK ID", "BOOK NAME", "AUTHOR NAME", "BOOK TYPE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 510, -1));

        btn2.setText("SEARCH");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\rosha\\Desktop\\library management\\login\\newhome.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsiActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        try {
            
             String tsi=txtsi.getText();
             String tbn=txtbn.getText();
             SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
             String issuedate=df.format(txtdate1.getDate());
             String duedate=df.format(txtdate2.getDate());
            
             
            String sql = "insert into issuebook values(?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, tsi);
            pst.setString(2, tbn);
            pst.setString(3, issuedate);
            pst.setString(4, duedate);
            
            
            Statement st = con.createStatement();
            pst.executeUpdate();
             
            JOptionPane.showMessageDialog(this, "Data insert successful..");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Id is already exists");
        }
        
        txtsi.setText("");
        txtbn.setText("");
        txtdate1.setDate(null);
        txtdate2.setDate(null);
        txtsi.requestFocus();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        
            String tbook = txtbn.getText().trim();
        try {    
             
             DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
             table.setRowCount(0);
            
            String sql = "select BOOK_ID, BOOK_NAME, AUTHOR_NAME, BOOK_TYPE  from newbook where book_name like ? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, tbook);
            
            Statement st = con.createStatement();
            rs = pst.executeQuery();
            while (rs.next()) {                
                    
                    String bid =  rs.getString("BOOK_ID");
                    String bname =  rs.getString("BOOK_NAME");
                    String author =  rs.getString("AUTHOR_NAME");
                    String btype =  rs.getString("BOOK_TYPE");
                    
                    table.addRow(new Object[]{bid,bname,author,btype});
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       HOME h = new HOME();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ISSUEBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISSUEBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISSUEBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISSUEBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISSUEBOOK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbn;
    private com.toedter.calendar.JDateChooser txtdate1;
    private com.toedter.calendar.JDateChooser txtdate2;
    private javax.swing.JTextField txtsi;
    // End of variables declaration//GEN-END:variables
}
