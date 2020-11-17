/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.inscripcion.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.entidades.Alumno;
import universidad.entidades.Inscripcion;
import universidad.entidades.Materia;
import universidad.modelo.AlumnoData;
import universidad.modelo.Conexion;
import universidad.modelo.InscripcionData;

/**
 *
 * @author Hyouka
 */
public class InscripcionCalificacion extends javax.swing.JInternalFrame {

     AlumnoData ad;
    InscripcionData id;
    private DefaultTableModel modelo=new DefaultTableModel();
    
    public InscripcionCalificacion() {
        initComponents();
        this.setLocation(450, 100);
        Conexion c = new Conexion();
        ad=new AlumnoData(c);
        id =new InscripcionData(c);
        armaCabeceraTabla();
        cargaAlumnos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jtabla = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==2){
                    return true;}
                return false;
            }
        };
        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtabla.getTableHeader().setReorderingAllowed(false);
        jtabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtablaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtabla);

        jbGuardar.setText("Guardar Cambios");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Alumnos");

        jbSalir.setText("Cancelar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addGap(26, 26, 26)
                        .addComponent(jbSalir)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int filaSeleccionada=jtabla.getSelectedRow();
        if(filaSeleccionada!=-1){
                    
            Alumno a=(Alumno)jcbAlumnos.getSelectedItem();
            int idInscripcion=(Integer) modelo.getValueAt(filaSeleccionada, 0);
            Materia m=(Materia) modelo.getValueAt(filaSeleccionada, 1);
            double nota=Double.valueOf(modelo.getValueAt(filaSeleccionada, 2).toString());
            if(nota<=10 && nota>0){
               int x =JOptionPane.showConfirmDialog(this, "Desea cambiar la nota?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                    if(x== JOptionPane.YES_OPTION){
                    Inscripcion i;
                    i = id.buscarInscripcion(idInscripcion);
                    i.setNota(nota);
                    id.actualizarInscripcion(i);
                    borraFilasTabla();
                    cargaDatos();
                    } 
            }else{
                JOptionPane.showMessageDialog(this, "La nota debe ser 10 o menor");
            }
            
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
        cargaDatos();
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtablaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtablaKeyTyped
        char digito = evt.getKeyChar();
        if(!Character.isDigit(digito)){
        evt.consume();
            
        }
    }//GEN-LAST:event_jtablaKeyTyped
public void armaCabeceraTabla(){
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("Id");
        columnas.add("Materia");
        columnas.add("Nota");
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        jtabla.setModel(modelo);
  }
public void cargaAlumnos(){
    //Carga las materias al ComboBox
    List<Alumno> lista=ad.obtenerAlumnos();
    
     for(Alumno item:lista){
            jcbAlumnos.addItem(item);
    }

}
public void borraFilasTabla(){

        int a =modelo.getRowCount()-1;

           for(int i=a;i>=0;i--){
   
                modelo.removeRow(i );
           }
}
public void cargaDatos(){
    
        borraFilasTabla();
           //Llenar filas
           
        Alumno seleccionado=(Alumno)jcbAlumnos.getSelectedItem();
        
        List<Inscripcion> lista = id.buscarInscripcionXAlumno(seleccionado.getIdAlumno());
        
        for(Inscripcion i:lista){
        
            modelo.addRow(new Object[]{i.getIdInscripcion(),i.getMateria(),i.getNota()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JTable jtabla;
    // End of variables declaration//GEN-END:variables
}
