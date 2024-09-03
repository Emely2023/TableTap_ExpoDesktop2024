/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.jfrPrimerUso;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



/**
 *
 * @author erika
 */
public class ctrlPrimerUso implements MouseListener{
    
    private jfrPrimerUso vista;
    
    public ctrlPrimerUso(jfrPrimerUso vista) {
        this.vista = vista;
        
        vista.btnIniciarSistema.addMouseListener(this);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.btnIniciarSistema){
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
