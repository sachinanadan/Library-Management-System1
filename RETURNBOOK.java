/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rosha
 */
public class RETURNBOOK extends javax.swing.JFrame {

    /**
     * Creates new form RETURNBOOK
     */
    public RETURNBOOK() {
        initComponents();
        connect();
        table_view();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
  
    
    public void connect() 
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","root");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        System.out.println("connection done");

    }
   
    public void table_view()
     {
         try {
              pst = con.prepareStatement("select * from returnbook");
              rs = pst.executeQuery();
              
              ResultSetMetaData rsd = rs.getMetaData();
              int c = rsd.getColumnCount(); 
              DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
              d.setRowCount(0);
              
              while (rs.next())
              {
                  Vector v = new Vector();
                  for (int i = 0; i < c ; i++) {
                      v.add(rs.getString("student_id"));
                      v.add(rs.getString("book_name"));
                      v.add(rs.getString("issue_date"));
                      v.add(rs.getString("return_date"));
                      v.add(rs.getString("day"));
                      v.add(rs.getString("fine"));
                  }
                  d.addRow(v);
              }
              
         } catch (Exception e) {
             JOptionPane.showMessageDialog(this, e);
         }
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtbook = new javax.swing.JTextField();
        jdateissue = new com.toedter.calendar.JDateChooser();
        jdateretrun = new com.toedter.calendar.JDateChooser();
        txtday = new javax.swing.JTextField();
        txtfine = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("RETURN BOOK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, -10, -1, 75));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("STUDENT ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("BOOK NAME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ISSUE DATE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("RETURN DATE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DAY:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("FINE:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 200, -1));
        getContentPane().add(txtbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 200, -1));
        getContentPane().add(jdateissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 200, -1));
        getContentPane().add(jdateretrun, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 200, -1));

        txtday.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdayKeyPressed(evt);
            }
        });
        getContentPane().add(txtday, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 200, -1));
        getContentPane().add(txtfine, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 200, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("RETURN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 93, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STUDENT ID", "BOOK NAME", "ISSUE DATE", "RETURN DATE", "DAY", "FINE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 570, 280));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\rosha\\Desktop\\library management\\login\\ram.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\rosha\\Desktop\\library management\\login\\viewbooks.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           
     
            String stuid = txtid.getText();
            String bookname = txtbook.getText();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String issuedate = df.format(jdateissue.getDate());
            String returndate = df.format(jdateretrun.getDate());
            String day = txtday.getText();
            String fine = txtfine.getText();
            
            
            String str = "insert into returnbook values(?,?,?,?,?,?)";
            pst = con.prepareStatement(str);
            
            pst.setString(1, stuid);
            pst.setString(2, bookname);
            pst.setString(3, issuedate);
            pst.setString(4, returndate);
            pst.setString(5, day);
            pst.setString(6, fine);
            
            Statement st = con.createStatement();
            pst.executeUpdate();  
            JOptionPane.showMessageDialog(this, "Data insert successful..");
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        
        table_view();
        txtid.setText("");
        txtbook.setText("");
        jdateissue.setDate(null);
        jdateretrun.setDate(null);
        txtday.setText("");
        txtfine.setText("");
        txtid.requestFocus();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdayKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String tday = txtday.getText();
            
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String issuedate = df.format(jdateissue.getDate());
            String returndate = df.format(jdateretrun.getDate());
        try {
            Date date1 = df.parse(issuedate);
            Date date2 = df.parse(returndate);
            long time_diff = date2.getTime() - date1.getTime();
            long total = time_diff / (1000*60*60*24)% 364;
            
            txtday.setText(String.valueOf(total));
            for (int i = 1; i < 5; i++) {
                
            }
            if (total <= 5 ) {
                
                int fine = 0;
                txtfine.setText(String.valueOf(fine));
            } else {
                JOptionPane.showMessageDialog(this, "Fine will be imposed for delay submition");
                int fine = 100;
                txtfine.setText(String.valueOf(fine));
            }
        } catch (ParseException e) {
//            JOptionPane.showMessageDialog(this, e);
              System.out.println(e);
        }
      }
            
    }//GEN-LAST:event_txtdayKeyPressed

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
            java.util.logging.Logger.getLogger(RETURNBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RETURNBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RETURNBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RETURNBOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RETURNBOOK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdateissue;
    private com.toedter.calendar.JDateChooser jdateretrun;
    private javax.swing.JTextField txtbook;
    private javax.swing.JTextField txtday;
    private javax.swing.JTextField txtfine;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
