/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4.controlador;

import reto4.vista.VEmpleado;
import reto4.vista.VOpciones;
import reto4.vista.VSemoviente;

/**
 *
 * @author hp
 */
public class ControladorPantallas {
    public static VEmpleado pantallaEmpleado;
    public static VSemoviente pantallaSemoviente;
    public static VOpciones pantallaOpciones;
    
   
    // metodos empleado
    public static void abrirPantallaEmpleado(){
        pantallaEmpleado = new VEmpleado();
        pantallaEmpleado.setVisible(true);
        pantallaEmpleado.setLocationRelativeTo(null);
    }
    
    public static void cerrarPantallaEmpleado(){
        pantallaEmpleado.setVisible(false);
        pantallaEmpleado = null;
    }
    
        // metodos Semoviente
    public static void abrirPantallaSemoviente(){
        pantallaSemoviente = new VSemoviente();
        pantallaSemoviente.setVisible(true);
        pantallaSemoviente.setLocationRelativeTo(null);
    }
    
    public static void cerrarPantallaSemoviente(){
        pantallaSemoviente.setVisible(false);
        pantallaSemoviente = null;
    }
    
        // metodos principal
    public static void abrirPantallaOpciones(){
        pantallaOpciones = new VOpciones();
        pantallaOpciones.setVisible(true);
        pantallaOpciones.setLocationRelativeTo(null);
    }
    
    public static void cerrarPantallaOpciones(){
        pantallaOpciones.setVisible(false);
        pantallaOpciones = null;
    }
    
    
}
