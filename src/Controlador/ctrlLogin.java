/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Vista.jfrLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class ctrlLogin  implements MouseListener {
    Usuario modelo;
    jfrLogin vista;
    
    public ctrlLogin(Usuario Modelo, jfrLogin Vista) {
        this.modelo = Modelo;
        this.vista = Vista;

        vista.btnIniciarSesion.addMouseListener(this);
        vista.btnSendSingIn.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (e.getSource() == vista.btnIniciarSesion) {
            modelo.setNombre(vista.txtNombreUsuario.getText());
            modelo.setContraseña(modelo.encriptarContraseña(vista.txtContraseñaUsuario.getText()));

            //Creo una variable llamada "comprobar" 
            //que guardará el resultado de ejecutar el metodo iniciarSesion()            
            boolean comprobar = modelo.IniciarSesion();

            //Si la variable es "true" significa que si existe el usuario ingresado    
            if (comprobar == true) {
                JOptionPane.showMessageDialog(vista,"Usuario existe, ¡Bienvenido!");
                Vista.jfrEmpleado.initjfrEmpleado();
                vista.dispose();
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario no encontrado");
            }
        }
        
        //Clic al botón de Ir Al Registro
        if(e.getSource() == vista.btnSendSingIn){
            Vista.jfrSignIn.initjfrSignIn();
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
