/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoempleados;

import controlador.controlador;
import modelo.ListaEmpleados;
import vista.AgregarEmpleado;

/**
 *
 * @author Administrador
 */
public class ListadoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AgregarEmpleado ae = new AgregarEmpleado();
        ListaEmpleados model = new ListaEmpleados();
        controlador controles = new controlador(model,ae);
        
        
        ae.setLocationRelativeTo(null);
        ae.setSize(600,420);
        ae.setResizable(false);
        ae.setVisible(true);
    }
    
}
