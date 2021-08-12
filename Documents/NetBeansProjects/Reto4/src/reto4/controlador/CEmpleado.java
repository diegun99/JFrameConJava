/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4.controlador;


import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import reto4.modelo.Empleado;


/**
 *
 * @author martha
 */
public class CEmpleado {

   static DefaultListModel modelo = new DefaultListModel();
   public static Map<Integer, Empleado> empleados= new LinkedHashMap<>();
    
    
        public static void registrarEmpleado(Empleado empleado,JList lista){
        
        empleados.put(empleado.getNumDocumento(), empleado);
        modelo.addElement(empleado);
        JOptionPane.showMessageDialog(null, "Empleado Registrado");
        lista.setModel(modelo);
        
        
    }
        
        public static void eliminarEmpleado(int documento,JList lista){
            
            if (empleados.containsKey(documento)) {
                modelo.removeElement(empleados.get(documento));
                empleados.remove(documento);
                lista.setModel(modelo);
                JOptionPane.showMessageDialog(null, "Empleado Eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "Empleado no existe");
            }
          
  
        
    }
        
        public static void consultarEmpleado(int documento,JList lista){
            
         if (empleados.containsKey(documento)) {
                modelo.removeAllElements();
                modelo.addElement(empleados.get(documento));
                lista.setModel(modelo);
               
            }else{
                JOptionPane.showMessageDialog(null, "Empleado no existe");
            }
          

        
    }
                
    public static void modificarEmpleado(int documento,JList lista,Empleado nuevo){
        
             if (empleados.containsKey(documento)) {
                empleados.put(nuevo.getNumDocumento(), nuevo);
                modelo.addElement(empleados.get(documento));
                lista.setModel(modelo);
               
                
            }else{
                JOptionPane.showMessageDialog(null, "Empleado no existe");

        
    }
        
        
    
}

}