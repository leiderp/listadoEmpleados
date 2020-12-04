/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class ListaEmpleados {
    private ArrayList<Empleado> emp=new ArrayList<Empleado>();
    
    public void crearEmpleado(String nombre, String apellido, String correo, String celular, boolean esProveedor, int salario, String cargo){
        Empleado em = new Empleado(nombre,apellido, correo, celular,esProveedor,salario, cargo);
        emp.add(em);
    }

    public ArrayList<Empleado> getEmp() {
        return emp;
    }
    
}
