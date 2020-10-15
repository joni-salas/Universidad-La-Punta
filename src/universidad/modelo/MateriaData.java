
package universidad.modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import universidad.entidades.Materia;


public class MateriaData {
      private Connection con;
    
    public MateriaData(Conexion conexion){
    
        con=conexion.getConnection();
    }
    
    public void guardarMateria(Materia materia){
    
        String sql="INSERT into materia (nombre_materia) "
                + "VALUES(?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,materia.getNombreMateria() );
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        con.close();
        JOptionPane.showMessageDialog(null,"Materia guardada con exito");
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar Materia");
        }
       
    }
     //public Materia buscarMateria(int id);
    //public List<Materia> obtenerMaterias();
    // public void actualizarMateria(Materia materia);
    //public void borrarMarteria(int id);
}
