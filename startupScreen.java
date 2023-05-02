/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

/**
 *
 * @author YESHASVI
 */
public class startupScreen extends javax.swing.JFrame {

    /**
     * Creates new form startupScreen
     */
    public startupScreen() {
        setUndecorated(true);
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        TITLELBL = new javax.swing.JLabel();
        clickme = new javax.swing.JLabel();
        desclbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placement/symbi.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 34, -1, -1));

        TITLELBL.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
        TITLELBL.setText(" PLACEMENT CELL SOFTWARE");
        jPanel1.add(TITLELBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 155, -1, -1));

        clickme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placement/fellowshi.png"))); // NOI18N
        clickme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clickme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickmeMouseClicked(evt);
            }
        });
        jPanel1.add(clickme, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        desclbl.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        desclbl.setText("Designed and Developed by students of Symbiosis Institute of Technology");
        jPanel1.add(desclbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 20));

        jLabel2.setText("Click logo to start Application");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clickmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickmeMouseClicked
        chooseForLogin cf = new chooseForLogin();
        cf.setLocationRelativeTo(null);
        cf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clickmeMouseClicked

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
            java.util.logging.Logger.getLogger(startupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startupScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITLELBL;
    private javax.swing.JLabel clickme;
    private javax.swing.JLabel desclbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
