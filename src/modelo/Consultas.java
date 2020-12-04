/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Consultas {
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    public void crearEmpleado(String nombre, String apellido, String correo, String celular, boolean esProveedor, int salario, String cargo){
        String sql = "INSERT INTO Persona(nombre,apellido,correo,celular,esProveedor,salario,cargo)VALUES('"+nombre +"','"+apellido+"','"+correo+"','"+celular+"','"+esProveedor+"','"+salario+"','"+cargo+"')";
        try{
            cn= con.getConexion();
            st=cn.createStatement();
            st.execute(sql);
            cn.close();
            JOptionPane.showMessageDialog(null, "Registro Agregado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        
    }
    
    public void actualizarEmpleado(String nombre, String apellido, String correo, String celular, boolean esProveedor, int salario, String cargo){
        String sql = "UPDATE Persona SET nombre='"+nombre+"',apellido='"+apellido+"',correo='"+correo+"',celular='"+celular+"',esProveedor='"+esProveedor+"',salario='"+salario+"',cargo='"+cargo+"' WHERE id = 5";
        try{
            cn= con.getConexion();
            st=cn.createStatement();
            st.execute(sql);
            cn.close();
            JOptionPane.showMessageDialog(null, "Registro Actualizado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        
    }
}
