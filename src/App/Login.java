/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import com.microsoft.sqlserver.jdbc.SQLServerStatementColumnEncryptionSetting;
import java.sql.Connection;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;


import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;

/**
 *
 *
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
          //Color JFrame
        
        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
        //this.getContentPane().setBackground(Color.decode("#8BCEE7"));// prueba con otro color 
          setIconImage(getIconImage());
        //Color JPanel
        
        //jPanel2.setBackground(Color.decode("#8BCEE7"));
        //jPanel2.setBackground(Color.white);
    }
    @Override
    //  codigo del logo 
    public Image getIconImage(){
        Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/imagen2.png"));
        return retValue;
        
    }
    // iniciar 
    // trae la contraseña de la base de datos 
    void iniciar(){
        try{
          
        // conexion de la  base de datos innva colombia 
        Connection con =  Conexion.getConexion();
        // parametros 
         PreparedStatement ps = con.prepareStatement("select * from  usuario where usuario = ? and contraseña = ?");
         ps.setObject(1, this.txtusuario.getText());
         ps.setObject(2, this.txtcontraseña.getText());
         ResultSet rs = ps.executeQuery();
         if(rs.next()){
            // new Registro().setVisible(true);
           dispose();
        
          Registro mul = new Registro();  //conecta la interza 1 con la segunda con el boton de siguiente
          
           mul.setVisible(true);
             
         }else{
             JOptionPane.showMessageDialog(null,"Error /usuario/contraseña");
            
         }
         
        }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e.toString());
        }
           
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        btoaceptar = new javax.swing.JButton();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Usuario ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña ");

        txtusuario.setBorder(null);

        btoaceptar.setText("Aceptar");
        btoaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoaceptarActionPerformed(evt);
            }
        });

        txtcontraseña.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("INICIAR SESION ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btoaceptar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btoaceptar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoaceptarActionPerformed
        iniciar();
    }//GEN-LAST:event_btoaceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoaceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
