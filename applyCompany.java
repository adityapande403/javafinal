/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class applyCompany extends javax.swing.JFrame {

    /**
     * Creates new form applyCompany
     */
    String username;
    public applyCompany() {
        setUndecorated(true);
        initComponents();
        displayTable();
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT loginID FROM `login` WHERE sr=1";
        try{
            ps = myconnection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                username=rs.getString(1);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void displayTable(){
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT Name, Registration FROM `company`";
        try{
            ps = myconnection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            t1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comp1 = new javax.swing.JLabel();
        comp2 = new javax.swing.JLabel();
        comp3 = new javax.swing.JLabel();
        comp4 = new javax.swing.JLabel();
        comp5 = new javax.swing.JLabel();
        comp1n = new javax.swing.JTextField();
        comp2n = new javax.swing.JTextField();
        comp3n = new javax.swing.JTextField();
        comp4n = new javax.swing.JTextField();
        comp5n = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("APPLY COMPANY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 20, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 700, 138));

        comp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comp1.setText("Choice 1");
        jPanel1.add(comp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        comp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comp2.setText("Choice 2");
        jPanel1.add(comp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        comp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comp3.setText("Choice 3");
        jPanel1.add(comp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        comp4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comp4.setText("Choice 4");
        jPanel1.add(comp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        comp5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comp5.setText("Choice 5");
        jPanel1.add(comp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        comp1n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comp1nActionPerformed(evt);
            }
        });
        jPanel1.add(comp1n, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 160, -1));
        jPanel1.add(comp2n, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 160, -1));
        jPanel1.add(comp3n, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 160, -1));
        jPanel1.add(comp4n, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 160, -1));
        jPanel1.add(comp5n, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 160, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(t1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 250, 340));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("APPLY COMPANY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("APPLY COMPANY");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Enter the Registration Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 340, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 546));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comp1nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comp1nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comp1nActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Statement stmt= myconnection.getConnection().createStatement();
            int reg1= Integer.parseInt(comp1n.getText());
            int reg2= Integer.parseInt(comp2n.getText());
            int reg3= Integer.parseInt(comp3n.getText());
            int reg4= Integer.parseInt(comp4n.getText());
            int reg5= Integer.parseInt(comp5n.getText());
            String query = "update studentlogin set Reg1="+reg1+",Reg2="+reg2+",Reg3="+reg3+",Reg4="+reg4+",Reg5="+reg5+" WHERE username='"+username+"'";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Applied Successfully!!");
            WelcomeStudent lgf=new WelcomeStudent();
            lgf.setVisible(true);
            lgf.setLocationRelativeTo(null);
            this.dispose();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(applyCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(applyCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(applyCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(applyCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new applyCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel comp1;
    private javax.swing.JTextField comp1n;
    private javax.swing.JLabel comp2;
    private javax.swing.JTextField comp2n;
    private javax.swing.JLabel comp3;
    private javax.swing.JTextField comp3n;
    private javax.swing.JLabel comp4;
    private javax.swing.JTextField comp4n;
    private javax.swing.JLabel comp5;
    private javax.swing.JTextField comp5n;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}