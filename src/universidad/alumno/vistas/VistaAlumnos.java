/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.alumno.vistas;

import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

import universidad.entidades.Alumno;
import universidad.modelo.AlumnoData;
import universidad.modelo.Conexion;

public class VistaAlumnos extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData;
    private Conexion conexion;

    /**
     * Creates new form VistaAlumnos
     */
    public VistaAlumnos() {
        initComponents();
        
        this.setLocation(310, 50);
        conexion = new Conexion();
        alumnoData = new AlumnoData(conexion);
        jdcFecha.getDateEditor().setEnabled(false);
//        jbGuardar.setEnabled(false);
//        jbBorrar.setEnabled(false);
//        jbActualizar.setEnabled(false);
//        jbLimpiar.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jlTitulo = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlFecha = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jlEstado = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JCheckBox();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jlId = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jlTitulo.setFont(new java.awt.Font("SF Movie Poster", 0, 48)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(51, 51, 255));
        jlTitulo.setText("~Alumno~");

        jlNombre.setText("Nombre Completo:");

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jlFecha.setText("Fecha Nacimiento");

        jlEstado.setText("Estado del Alumno");

        jcbEstado.setText("Activo");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jlId.setText("ID");

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });
        jtfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdKeyTyped(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbEstado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlFecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbActualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jbGuardar)
                                        .addGap(78, 78, 78)
                                        .addComponent(jbBorrar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlId)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                            .addComponent(jlNombre))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jbBuscar)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(jbLimpiar)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFecha)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(jcbEstado))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbBorrar)
                    .addComponent(jbActualizar)
                    .addComponent(jbLimpiar))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        boolean esta=true;
  
        if(jtfNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo Nombre esta vacio "+jtfNombre.getText(), "ERROR!", JOptionPane.WARNING_MESSAGE);
                esta=false;
        } 
        if(esta){
        int x=JOptionPane.showConfirmDialog(this, "Esta seguro que desea GUARDAR el alumno?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(x==JOptionPane.YES_OPTION){
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            String nombre = jtfNombre.getText();
            String fecha = formato.format(jdcFecha.getDate());
            LocalDate fecNac = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            boolean activo = jcbEstado.isSelected();
            Alumno alumno = new Alumno(nombre, fecNac, activo);
            alumnoData.guardarAlumno(alumno);
            jtfId.setText(alumno.getIdAlumno() + " ");
                if(jtfNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No puede dejar el campo nombre vacio");
                }
        limpiar();}
        }
    }//GEN-LAST:event_jbGuardarActionPerformed
  
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        boolean esta=true;
  
        if(jtfId.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo ID esta vacio "+jtfNombre.getText(), "ERROR!", JOptionPane.WARNING_MESSAGE);
                esta=false;
        }
        if(esta){
            int x=JOptionPane.showConfirmDialog(this, "Esta seguro que desea BORRAR el alumno?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(x==JOptionPane.YES_OPTION){
                    int id = Integer.parseInt(jtfId.getText());
                    alumnoData.borrarAlumno(id);
                    limpiar();}
        }
        
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        boolean esta=true;
  
        if(jtfId.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo esta vacio : "+jtfId.getText(), "ERROR!", JOptionPane.WARNING_MESSAGE);
                esta=false;
        }
        if(esta){
            int id = Integer.parseInt(jtfId.getText());
            Alumno alumno = alumnoData.buscarAlumno(id);
            if (alumno != null) {
            
            jtfId.setText(alumno.getIdAlumno() + "");
            jtfNombre.setText(alumno.getNombreAlumno());
            jdcFecha.setDate(Date.valueOf(alumno.getFnAlumno()));
            jcbEstado.setSelected(alumno.isActivo());
        } 
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        boolean esta=true;
        if(jtfNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo esta vacio ID esta vacio "+jtfNombre.getText(), "ERROR!", JOptionPane.WARNING_MESSAGE);
                esta=false;
        }
        if(esta){
            int x=JOptionPane.showConfirmDialog(this, "Esta seguro que desea ACTUALIZAR el alumno?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(x==JOptionPane.YES_OPTION){
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                if(jtfId.getText()!=null){
                String nombre = jtfNombre.getText();
                String fecha = formato.format(jdcFecha.getDate());
                LocalDate fecNac = LocalDate.parse(fecha,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                boolean activo = jcbEstado.isSelected();

                Alumno alumno = new Alumno(Integer.parseInt(jtfId.getText()),nombre, fecNac, activo);
                alumnoData.actualizarAlumno(alumno);
                jtfId.setText(alumno.getIdAlumno()+"");
                limpiar();} 
            }
        
        
        }          
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        
        if(!(evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)&&!Character.isLetter(evt.getKeyChar())&&!(evt.getKeyChar()==KeyEvent.VK_SPACE)){//isLetter comprueba si es una letra devuelve true o false
        evt.consume();
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdKeyTyped
        char digito = evt.getKeyChar();
        if(!Character.isDigit(digito)){
        evt.consume();//consume el evento no me deja ingresar
        }
    }//GEN-LAST:event_jtfIdKeyTyped

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    public void limpiar() {
        jtfId.setText("");
        jtfNombre.setText("");
        jcbEstado.setSelected(false);
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JCheckBox jcbEstado;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
