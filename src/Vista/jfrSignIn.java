/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ctrlSignIn;
import Modelo.Usuario;

/**
 *
 * @author daniel
 */
public class jfrSignIn extends javax.swing.JFrame {

    /**
     * Creates new form jfrSignIn
     */
    public jfrSignIn() {
        initComponents();
        this.setLocationRelativeTo(this);

    }
    
    public static void initjfrSignIn(){
        Usuario modelo = new Usuario();
        jfrSignIn vista = new jfrSignIn();
        ctrlSignIn c = new ctrlSignIn(modelo, vista);
        vista.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreUsuarioR = new javax.swing.JTextField();
        txtContraseñaUsuarioR = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSendLogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Crea tu Cuenta");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre de Usuario:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 150, 20));

        txtNombreUsuarioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioRActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreUsuarioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 210, 40));

        txtContraseñaUsuarioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaUsuarioRActionPerformed(evt);
            }
        });
        getContentPane().add(txtContraseñaUsuarioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 210, 40));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contaseña:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 100, 20));

        btnCrearCuenta.setBackground(new java.awt.Color(102, 51, 255));
        btnCrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector.png"))); // NOI18N
        btnCrearCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 204), null, null));
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 60, 30));

        jLabel10.setText("¿Ya tienes una cuenta?");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        btnSendLogin.setText("Iniciar Sesión");
        btnSendLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnSendLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Entrar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 70, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBoton.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 170, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Rectangle 31328.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 300, 440));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logotbtp (2).png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 370, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 630, 720));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector 3.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 560, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vector 2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 840, 550));

        jlabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoRojo.jpg"))); // NOI18N
        getContentPane().add(jlabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioRActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void txtContraseñaUsuarioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaUsuarioRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaUsuarioRActionPerformed

    private void btnSendLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendLoginActionPerformed

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
            java.util.logging.Logger.getLogger(jfrSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initjfrSignIn();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrearCuenta;
    public javax.swing.JButton btnSendLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlabelFondo;
    public javax.swing.JLabel lblContraseña;
    public javax.swing.JTextField txtContraseñaUsuarioR;
    public javax.swing.JTextField txtNombreUsuarioR;
    // End of variables declaration//GEN-END:variables
}
