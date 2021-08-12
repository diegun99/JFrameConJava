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
import reto4.modelo.Semoviente;


public class CSemoviente {
    
    
    static DefaultListModel modelo = new DefaultListModel();
    public static Map<Integer, Semoviente> semovientes= new LinkedHashMap<>();

    
    
        public static void registrarSemoviente(Semoviente semoviente,JList lista){
        
        semovientes.put(semoviente.getId(),semoviente);
        modelo.addElement(semoviente);
        JOptionPane.showMessageDialog(null, "Semoviente Registrado");
        lista.setModel(modelo);
        
        
    }
        
        public static void eliminarSemoviente(int id,JList lista){
            
            if (semovientes.containsKey(id)) {
                modelo.removeElement(semovientes.get(id));
                semovientes.remove(id);
                lista.setModel(modelo);
                JOptionPane.showMessageDialog(null, "Semoviente Eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "Semoviente no existe");
            }
          
  
        
    }
        
        public static void consultarSemoviente(int id,JList lista){
            
         if (semovientes.containsKey(id)) {
                modelo.addElement(semovientes.get(id));
                lista.setModel(modelo);
               
            }else{
                JOptionPane.showMessageDialog(null, "Semoviente no existe");
            }
          

        
    }
                
    public static void modificarSemoviente(int documento,JList lista,Semoviente nuevo){
        
             if (semovientes.containsKey(documento)) {
                 semovientes.remove(documento);
                semovientes.put(nuevo.getId(), nuevo);
                modelo.addElement(semovientes.get(nuevo.getId()));
                lista.setModel(modelo);
               
                
            }else{
                JOptionPane.showMessageDialog(null, " no existe");

        
    }
        
        
    
}
    
}
