/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Administrador
 */
public class Empleado {
    private int id;
    private static AtomicInteger vid= new AtomicInteger(0);
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private boolean esProveedor;
    private int salario;
    private String cargo;

    public Empleado(String nombre, String correo, String celular, int salario) {
        this.id=this.vid.incrementAndGet();
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.salario = salario;
    }

    public Empleado(String nombre, String apellido, String correo, String celular, boolean esProveedor, int salario, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.esProveedor = esProveedor;
        this.salario = salario;
        this.cargo = cargo;
        this.id=this.vid.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean getEsProveedor() {
        return esProveedor;
    }

    public void setEsProveedor(boolean esProveedor) {
        this.esProveedor = esProveedor;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
