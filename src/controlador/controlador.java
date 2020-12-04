/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Consultas;
import vista.AgregarEmpleado;
import modelo.ListaEmpleados;

/**
 *
 * @author Administrador
 */
public class controlador implements ActionListener{
    private AgregarEmpleado ae;
    private ListaEmpleados model;
    
        
    
    public controlador(ListaEmpleados model, AgregarEmpleado ae){
        this.ae=ae;
        this.model=model;
        this.ae.guardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //guardarDatos();
        //guardarDB();
        actualizarDB();
    }
    private void guardarDatos(){
        this.model.crearEmpleado(this.ae.nombre.getText(), this.ae.apellido.getText(), this.ae.correo.getText(), this.ae.celular.getText(), this.ae.esProveedor.isSelected(),Integer.parseInt(this.ae.salario.getText()), this.ae.cargo.getText());
        JOptionPane.showMessageDialog(null, "Empleado Creado");
        mostrarEmpleados();
    }
    private void mostrarEmpleados(){
        //int i=0;
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < this.model.getEmp().size(); i++) {
            modelo.addElement(this.model.getEmp().get(i).getId()+" "+this.model.getEmp().get(i).getNombre()+" "+this.model.getEmp().get(i).getCargo());
        }
        this.ae.lista.setModel(modelo);
    }

    private void guardarDB() {
        Consultas cs = new Consultas();
        cs.crearEmpleado(this.ae.nombre.getText(), this.ae.apellido.getText(), this.ae.correo.getText(), this.ae.celular.getText(), this.ae.esProveedor.isSelected(),Integer.parseInt(this.ae.salario.getText()), this.ae.cargo.getText());
    }
    private void actualizarDB() {
        Consultas cs = new Consultas();
        cs.actualizarEmpleado(this.ae.nombre.getText(), this.ae.apellido.getText(), this.ae.correo.getText(), this.ae.celular.getText(), this.ae.esProveedor.isSelected(),Integer.parseInt(this.ae.salario.getText()), this.ae.cargo.getText());
    }
}
