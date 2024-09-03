/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Vista.jfrSignIn;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class ctrlSignIn implements MouseListener {
      Usuario  modelo;
      jfrSignIn vista;
      
    public ctrlSignIn(Usuario Modelo, jfrSignIn Vista){
        this.modelo = Modelo;
        this.vista = Vista;
        
        vista.btnCrearCuenta.addMouseListener(this);
        vista.btnSendLogin.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        
         if(e.getSource() == vista.btnCrearCuenta){
            modelo.setNombre(vista.txtNombreUsuarioR.getText());
            modelo.setContraseña(modelo.encriptarContraseña(vista.txtContraseñaUsuarioR.getText()));
            modelo.GuardarUsuario();
            
            //Muestro una alerta que el usuario se ha guardado
            JOptionPane.showMessageDialog(vista, "Usuario Guardado");
             Vista.jfrLogin.initjfrLogin();
             vista.dispose();
        }
        
         //Clic al botón de Ir Al Login
        if(e.getSource() == vista.btnSendLogin){
            Vista.jfrLogin.initjfrLogin();
            vista.dispose();
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
