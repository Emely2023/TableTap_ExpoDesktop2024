/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.mdlEmpleado1;
import Vista.jfrEmpleado;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;




/**
 *
 * @author daniel
 */
public class ctrlEmpleado implements MouseListener, KeyListener {

    // Instancias del modelo y la vista
    private mdlEmpleado1 modelo;
    private jfrEmpleado vista;

    // Constructor
    public ctrlEmpleado(mdlEmpleado1 modelo, jfrEmpleado vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Añadir los listeners a los componentes de la vista
        vista.btnGuardarEmpleado.addMouseListener(this);
        modelo.Mostrar(vista.tbEmpleados);
        vista.btnEliminarEmpleado.addMouseListener(this);
        vista.tbEmpleados.addMouseListener(this);
        vista.btnActualizarEmpleado.addMouseListener(this);
        vista.btnLimpiar.addMouseListener(this);
        vista.txtBuscar.addKeyListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.btnGuardarEmpleado) {
            modelo.setNombreEmpleado(vista.txtNombreEmpleado.getText());
            modelo.setApellidoEmpleado(vista.txtApellidoEmpleado.getText());
            modelo.setCorreoEmpleado(vista.txtCorreoEmpleado.getText());
            modelo.setTelefonoEmpleado(vista.txtTelefonoEmpleado.getText());
            modelo.setEdadEmpleado(Integer.parseInt(vista.txtEdadEmpleado.getText()));
            modelo.setDUI(vista.txtDuiEmpleado.getText());
            
            modelo.Guardar();
            modelo.Mostrar(vista.tbEmpleados);
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

    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}