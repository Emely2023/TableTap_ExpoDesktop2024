/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.jfrEmpleado;
import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erika
 */


public class mdlEmpleado1 {
    //1- Parametros
 private String idEmpleado;
    private String NombreEmpleado;
    private String ApellidoEmpleado;
    private String CorreoEmpleado;
    private String TelefonoEmpleado;
    private int EdadEmpleado;
    private String DUI;
    private String Foto;
    private String idCargoEmpleado;
    private String idUsuario;
    
    //2- Getters y Setters
   
        
    
    

      ///3- Mètodos

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    public void setApellidoEmpleado(String ApellidoEmpleado) {
        this.ApellidoEmpleado = ApellidoEmpleado;
    }

    public String getCorreoEmpleado() {
        return CorreoEmpleado;
    }

    public void setCorreoEmpleado(String CorreoEmpleado) {
        this.CorreoEmpleado = CorreoEmpleado;
    }

    public String getTelefonoEmpleado() {
        return TelefonoEmpleado;
    }

    public void setTelefonoEmpleado(String TelefonoEmpleado) {
        this.TelefonoEmpleado = TelefonoEmpleado;
    }

    public int getEdadEmpleado() {
        return EdadEmpleado;
    }

    public void setEdadEmpleado(int EdadEmpleado) {
        this.EdadEmpleado = EdadEmpleado;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getIdCargoEmpleado() {
        return idCargoEmpleado;
    }

    public void setIdCargoEmpleado(String idCargoEmpleado) {
        this.idCargoEmpleado = idCargoEmpleado;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
  
    
    
    public void Guardar(){
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        java.sql.Connection conexion = ClaseConexion.getConexion();
        try {
            
            String idEmpleado = UUID.randomUUID().toString();
            //Creamos el PreparedStatement que ejecutará la Query
            PreparedStatement addEmpleado = conexion.prepareStatement("INSERT INTO Empleados(idEmpleado,NombreEmpleado,ApellidoEmpleado,CorreoEmpleado,TelefonoEmpleado,EdadEmpleado,DUI,Foto,idCargoEmpleado,idUsuario ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
            //Establecer valores de la consulta SQL
            addEmpleado.setString(1, idEmpleado);
            addEmpleado.setString(2, getNombreEmpleado());
            addEmpleado.setString(3, getApellidoEmpleado());
            addEmpleado.setString(4, getCorreoEmpleado());
            addEmpleado.setString(5, getTelefonoEmpleado ());
            addEmpleado.setInt(6, getEdadEmpleado());
            addEmpleado.setString(7, getDUI());
            addEmpleado.setString(8, "Foto");
            addEmpleado.setString(9, "b7202ee0-77f8-405b-96a1-a54296ce16db");
            addEmpleado.setString(10, "812bca8b-b7d7-4403-b783-9f7c604c209c");
 
            //Ejecutar la consulta
            addEmpleado.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println("este es el error en el modelo: metodo guardar " + ex);
        }
    }
    
    
    public void Mostrar(JTable tabla) {
        //Creamos una variable de la clase de conexion
        java.sql.Connection conexion = ClaseConexion.getConexion();
        //Definimos el modelo de la tabla
        DefaultTableModel modeloDeDatos = new DefaultTableModel();
        
        modeloDeDatos.setColumnIdentifiers(new Object[]{"idEmpleado","NombreEmpleado","ApellidoEmpleado","CorreoEmpleado","TelefonoEmpleado","EdadEmpleado","DUI","Foto","idCargoEmpleado","idUsuario"});
        try {
            //Creamos un Statement
            java.sql.Statement statement = conexion.createStatement();
            //Ejecutamos el Statement con la consulta y lo asignamos a una variable de tipo ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM Empleados");
            //Recorremos el ResultSet
            while (rs.next()) {
                //Llenamos el modelo por cada vez que recorremos el resultSet
                modeloDeDatos.addRow(new Object[]{rs.getString("idEmpleado"), 
                    rs.getString("NombreEmpleado"), 
                    rs.getString("ApellidoEmpleado"),
                    rs.getString("CorreoEmpleado"),
                    rs.getString("TelefonoEmpleado"),
                    rs.getInt("EdadEmpleado"), 
                    rs.getString("DUIEmpleado"),
                    rs.getString("FotoEmpleado"),
                    rs.getString("IdCargoEmpleado"),
                    rs.getString("IdUsuario")});
                    
            }
            //Asignamos el nuevo modelo lleno a la tabla
            tabla.setModel(modeloDeDatos);
        } catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo mostrar " + e);
        }
    }      
    
    
}
    

