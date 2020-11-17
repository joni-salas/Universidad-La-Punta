package universidad.materia.vistas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.entidades.Materia;
import universidad.modelo.Conexion;
import universidad.modelo.MateriaData;

/**
 *
 * @author joni
 */
public class MateriaActualizar extends javax.swing.JInternalFrame {

    Conexion c = new Conexion();
    private DefaultTableModel modelo=new DefaultTableModel();
    MateriaData md;
    Materia m;
    
    public MateriaActualizar() {
        initComponents();
        md= new MateriaData(c);
        this.setLocation(450, 100);
        Conexion c = new Conexion();
        armaCabeceraTabla();
        modelo.isCellEditable(0, 1);
        this.cargaDatosMateria();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonsalir = new javax.swing.JButton();
        jLabelbuscarm = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonbuscar = new javax.swing.JButton();
        jButtonaguardar = new javax.swing.JButton();
        jButtonCargarMaterias = new javax.swing.JButton();

        jLabelTitulo.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 0, 51));
        jLabelTitulo.setText("Actualizar Materia");

        jTable = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==1){
                    return true;}
                return false;
            }
        };
        jTable.setForeground(new java.awt.Color(255, 0, 0));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButtonsalir.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jButtonsalir.setText("Salir");
        jButtonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirActionPerformed(evt);
            }
        });

        jLabelbuscarm.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabelbuscarm.setText("ID materia:");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jButtonbuscar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jButtonbuscar.setText("Buscar");
        jButtonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarActionPerformed(evt);
            }
        });

        jButtonaguardar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jButtonaguardar.setText("Guardar Cambios");
        jButtonaguardar.setFocusTraversalPolicyProvider(true);
        jButtonaguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaguardarActionPerformed(evt);
            }
        });

        jButtonCargarMaterias.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jButtonCargarMaterias.setText("Cargar Materias");
        jButtonCargarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarMateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelbuscarm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jButtonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonCargarMaterias)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonaguardar)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombre)
                        .addComponent(jButtonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelbuscarm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCargarMaterias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonaguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarActionPerformed

    boolean esta=true;
  
        if(jTextFieldNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo Nombre esta vacio: "+jTextFieldNombre.getText(), "ERROR!", JOptionPane.WARNING_MESSAGE);
                esta=false;
        } 
        
        if(esta){
            int x= Integer.parseInt(jTextFieldNombre.getText());
            m=new Materia();
            m=md.buscarMateria(x);
            if (m != null) {
            borraFilasTabla();
            modelo.addRow(new Object[]{m.getIdMateria(),m.getNombreMateria()});
            jTextFieldNombre.setText("");    
            }else{
               JOptionPane.showMessageDialog(null, "Materia no encontrada: "+jTextFieldNombre.getText(), "ERROR!", JOptionPane.WARNING_MESSAGE); 
            }     
        }
        
    }//GEN-LAST:event_jButtonbuscarActionPerformed

    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonsalirActionPerformed

    private void jButtonaguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaguardarActionPerformed

        int filaSelec=jTable.getSelectedRow();
        if(filaSelec!=-1){
                    
            String nombre = modelo.getValueAt(filaSelec, 1).toString();
            int id = Integer.parseInt(modelo.getValueAt(filaSelec,0).toString());
            int x =JOptionPane.showConfirmDialog(this, "Desea cambiar el nombre?","ATENCION!!",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(x== JOptionPane.YES_OPTION){
                Materia m;
                m=md.buscarMateria(id);
                m.setNombreMateria(nombre);
                md.actualizarMateria(m);
                borraFilasTabla();
                cargaDatosMateria();
           }
        }
    }//GEN-LAST:event_jButtonaguardarActionPerformed

    private void jButtonCargarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarMateriasActionPerformed
        cargaDatosMateria();
    }//GEN-LAST:event_jButtonCargarMateriasActionPerformed

    private void jTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableFocusGained

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char digito = evt.getKeyChar();
        if(!Character.isDigit(digito)){
        evt.consume();
            
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void armaCabeceraTabla(){
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre Materia");
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        jTable.setModel(modelo);
  }
    private void borraFilasTabla(){

        int a =modelo.getRowCount()-1;

           for(int i=a;i>=0;i--){
   
                modelo.removeRow(i);
           }
}
    private void cargaDatosMateria(){
    
        borraFilasTabla();
           //Llenar filas
        
        List<Materia> lista = md.obtenerMaterias();
        
        for(Materia m:lista){
        
            modelo.addRow(new Object[]{m.getIdMateria(),m.getNombreMateria()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargarMaterias;
    private javax.swing.JButton jButtonaguardar;
    private javax.swing.JButton jButtonbuscar;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelbuscarm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
