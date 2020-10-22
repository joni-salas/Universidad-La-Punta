
package universidad.materia.vistas;

import java.util.*;
import javax.swing.JOptionPane;
import universidad.modelo.*;
import universidad.entidades.*;


public class MateriaGuardarVistas extends javax.swing.JFrame {

    Conexion c = new Conexion();
    MateriaData md = new MateriaData(c);
    Materia m = new Materia();
    
    public MateriaGuardarVistas() {
        initComponents();
        this.setLocationRelativeTo(null);
        List<Materia> ml = new ArrayList<>();
        ml = md.obtenerMaterias();
        for(int i=0;i< ml.size();i++){
            Materia m=ml.get(i);
            String Nombre = String.valueOf(m.getNombreMateria()); 
            CBMateria.addItem(Nombre);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBMateria = new javax.swing.JComboBox<>();
        TXTNombreMateria = new javax.swing.JTextField();
        LBNoombreM = new javax.swing.JLabel();
        LBidMateria = new javax.swing.JLabel();
        TXTidMateria = new javax.swing.JTextField();
        BAgregar = new javax.swing.JButton();
        Brefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CBMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Materia" }));
        CBMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBMateriaActionPerformed(evt);
            }
        });

        TXTNombreMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreMateriaActionPerformed(evt);
            }
        });
        TXTNombreMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNombreMateriaKeyTyped(evt);
            }
        });

        LBNoombreM.setText("Nombre Materia: ");

        LBidMateria.setText("ID Materia: ");

        TXTidMateria.setEditable(false);
        TXTidMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTidMateriaActionPerformed(evt);
            }
        });

        BAgregar.setText("Agregar");
        BAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarActionPerformed(evt);
            }
        });

        Brefresh.setBackground(new java.awt.Color(255, 255, 255));
        Brefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad/imagenes/refresh bueno.png"))); // NOI18N
        Brefresh.setText("Refresh");
        Brefresh.setMargin(new java.awt.Insets(5, 15, 5, 0));
        Brefresh.setMaximumSize(new java.awt.Dimension(20, 20));
        Brefresh.setMinimumSize(new java.awt.Dimension(60, 55));
        Brefresh.setPreferredSize(new java.awt.Dimension(20, 20));
        Brefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CBMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Brefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LBNoombreM))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBidMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTidMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXTNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LBidMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TXTidMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBNoombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAgregar)
                    .addComponent(Brefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMateriaActionPerformed
        String nombre = CBMateria.getSelectedItem().toString();
        List<Materia> ml = new ArrayList<>();
        ml = md.obtenerMaterias();
        for(int i=0;i< ml.size();i++){
            Materia m=ml.get(i);
            if(nombre.equals(m.getNombreMateria())){
                TXTidMateria.setText(String.valueOf(m.getIdMateria()));
            }
        }       

    }//GEN-LAST:event_CBMateriaActionPerformed

    private void TXTNombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreMateriaActionPerformed
        
 
    }//GEN-LAST:event_TXTNombreMateriaActionPerformed

    private void TXTidMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTidMateriaActionPerformed
        
        TXTidMateria.setText(String.valueOf(m.getIdMateria()));
        
    }//GEN-LAST:event_TXTidMateriaActionPerformed

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        List<Materia> ml = new ArrayList<>();
        ml = md.obtenerMaterias();
        boolean agregar=true;
        for(int i=0;i< ml.size();i++){
            Materia m=ml.get(i);
            if(TXTNombreMateria.getText().equalsIgnoreCase(m.getNombreMateria())|| TXTNombreMateria.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ya tenemos una materia registrada con el nombre: "+TXTNombreMateria.getText(), "ERROR!", JOptionPane.WARNING_MESSAGE);
                i=ml.size();
                agregar=false;
            } 
        }
        if(agregar){
           m.setNombreMateria(TXTNombreMateria.getText());
            md.guardarMateria(m);
            JOptionPane.showMessageDialog(null,"Materia Guardada"); 
        }
         
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrefreshActionPerformed
        this.dispose();
        MateriaGuardarVistas obj =new MateriaGuardarVistas();
        obj.setVisible(true);
    }//GEN-LAST:event_BrefreshActionPerformed

    private void TXTNombreMateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNombreMateriaKeyTyped
        char digito = evt.getKeyChar();
        if(!Character.isDigit(digito)){
            evt.consume();
        }
    }//GEN-LAST:event_TXTNombreMateriaKeyTyped

    
    
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
            java.util.logging.Logger.getLogger(MateriaGuardarVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MateriaGuardarVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MateriaGuardarVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MateriaGuardarVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MateriaGuardarVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton Brefresh;
    private javax.swing.JComboBox<String> CBMateria;
    private javax.swing.JLabel LBNoombreM;
    private javax.swing.JLabel LBidMateria;
    private javax.swing.JTextField TXTNombreMateria;
    private javax.swing.JTextField TXTidMateria;
    // End of variables declaration//GEN-END:variables
}
