
package universidad.modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import universidad.entidades.Inscripcion;


public class InscripcionData {
       private Connection con;
    
    public InscripcionData(Conexion conexion){
    
        con=conexion.getConnection();
    }
    
    public void guardarInscripcion(Inscripcion inscripcion){
    
        String sql="INSERT into inscripcion (id_alumno, id_materia, calificacion) "
                + "VALUES(?, ?, ?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,inscripcion.getAlumno().getIdAlumno());
        ps.setInt(2,inscripcion.getMateria().getIdMateria());
        ps.setDouble(3,inscripcion.getNota());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        con.close();
        JOptionPane.showMessageDialog(null,"Inscripcion guardada con exito");
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar Inscripcion");
        }
       
    }   
}
