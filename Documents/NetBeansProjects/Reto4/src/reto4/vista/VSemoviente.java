/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4.vista;

import javax.swing.JOptionPane;
import reto4.controlador.CEmpleado;
import reto4.controlador.CSemoviente;
import reto4.modelo.Empleado;
import reto4.modelo.Semoviente;

/**
 *
 * @author hp
 */
public class VSemoviente extends javax.swing.JFrame {

    /**
     * Creates new form VSemoviente
     */
    public VSemoviente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdSemoviente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRazaSemoviente = new javax.swing.JTextField();
        txtEncargadoSemoviente = new javax.swing.JTextField();
        spnPropositoSemoviente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSemoviente = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        txtColorSemoviente = new javax.swing.JTextField();
        btnRegSemoviente = new javax.swing.JButton();
        btnConsultarSemoviente = new javax.swing.JButton();
        btnModificarSemoviente = new javax.swing.JButton();
        btnEliminarSemoviente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Gestión Semoviente");

        jLabel2.setText("Identificación:");

        txtIdSemoviente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSemovienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Raza:");

        jLabel4.setText("Propósito:");

        jLabel5.setText("Encargado:");

        spnPropositoSemoviente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "carne", "leche" }));

        jScrollPane1.setViewportView(lstSemoviente);

        jLabel6.setText("Color:");

        btnRegSemoviente.setText("Registrar");
        btnRegSemoviente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSemovienteActionPerformed(evt);
            }
        });

        btnConsultarSemoviente.setText("Consultar");
        btnConsultarSemoviente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarSemovienteActionPerformed(evt);
            }
        });

        btnModificarSemoviente.setText("Modificar");
        btnModificarSemoviente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarSemovienteActionPerformed(evt);
            }
        });

        btnEliminarSemoviente.setText("Eliminar");
        btnEliminarSemoviente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSemovienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(btnModificarSemoviente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegSemoviente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnPropositoSemoviente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdSemoviente)
                                .addComponent(txtRazaSemoviente)
                                .addComponent(txtColorSemoviente, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addComponent(txtEncargadoSemoviente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnEliminarSemoviente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsultarSemoviente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdSemoviente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRazaSemoviente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColorSemoviente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(spnPropositoSemoviente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEncargadoSemoviente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegSemoviente)
                            .addComponent(btnConsultarSemoviente))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarSemoviente)
                            .addComponent(btnEliminarSemoviente)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdSemovienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSemovienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSemovienteActionPerformed

    private void btnRegSemovienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSemovienteActionPerformed
     int id = Integer.parseInt(txtIdSemoviente.getText());
     int idEncargado = Integer.parseInt(txtEncargadoSemoviente.getText());
       
        
        Semoviente semoviente = new Semoviente(
                id, 
                txtRazaSemoviente.getText(),
                txtColorSemoviente.getText(),
                spnPropositoSemoviente.getSelectedItem().toString(),
                idEncargado);
        
        
        
        if (CEmpleado.empleados.containsKey(semoviente.getEncargado())) {// verifica que documento empleado exista
            CSemoviente.registrarSemoviente(semoviente, lstSemoviente);
            
        }else{
            JOptionPane.showMessageDialog(null,"Documento Encargado No existe,Registrar Encargado en Gestion Empleado");
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_btnRegSemovienteActionPerformed

    private void btnConsultarSemovienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarSemovienteActionPerformed
        
        int id = Integer.parseInt(txtIdSemoviente.getText());
        CSemoviente.consultarSemoviente(id, lstSemoviente);// TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarSemovienteActionPerformed

    private void btnModificarSemovienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSemovienteActionPerformed
     Integer id = Integer.parseInt(txtIdSemoviente.getText());
     Integer idEncargado = Integer.parseInt(txtEncargadoSemoviente.getText());
       
        
        Semoviente semoviente = new Semoviente(
                id, 
                txtRazaSemoviente.getText(),
                txtColorSemoviente.getText(),
                spnPropositoSemoviente.getSelectedItem().toString(),
                idEncargado);
        
        
        
        if (CEmpleado.empleados.containsKey(semoviente.getEncargado())) {// verifica que documento empleado exista
        CSemoviente.modificarSemoviente(semoviente.getId(), lstSemoviente, semoviente);
            
        }else{
            JOptionPane.showMessageDialog(null,"Documento Encargado No existe,Registrar Encargado en Gestion Empleado");
        }
        
 // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarSemovienteActionPerformed

    private void btnEliminarSemovienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSemovienteActionPerformed
         int id = Integer.parseInt(txtIdSemoviente.getText());
        CSemoviente.eliminarSemoviente(id, lstSemoviente); // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarSemovienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VSemoviente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VSemoviente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VSemoviente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VSemoviente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VSemoviente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarSemoviente;
    private javax.swing.JButton btnEliminarSemoviente;
    private javax.swing.JButton btnModificarSemoviente;
    private javax.swing.JButton btnRegSemoviente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstSemoviente;
    private javax.swing.JComboBox<String> spnPropositoSemoviente;
    private javax.swing.JTextField txtColorSemoviente;
    private javax.swing.JTextField txtEncargadoSemoviente;
    private javax.swing.JTextField txtIdSemoviente;
    private javax.swing.JTextField txtRazaSemoviente;
    // End of variables declaration//GEN-END:variables
}
