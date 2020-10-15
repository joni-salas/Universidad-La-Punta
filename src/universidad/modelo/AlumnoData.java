
package universidad.modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import universidad.entidades.Alumno;


public class AlumnoData {

    private Connection con;
    
    public AlumnoData(Conexion conexion){
    
        con=conexion.getConnection();
    }
    
    public void guardarAlumno(Alumno alumno){
    
        String sql="INSERT into alumno (nombre_alumno, fn_alumno,activo) "
                + "VALUES(?, ?, ?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,alumno.getNombreAlumno() );
        ps.setDate(2, Date.valueOf(alumno.getFnAlumno()));
        ps.setBoolean(3, alumno.isActivo());
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        con.close();
        JOptionPane.showMessageDialog(null,"Alumno guardado con exito");
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar Alumno");
        }
       
    }
    //public Alumno buscarAlumno(int id);
    //public List<Alumno> obtenerAlumnos();
    // public void actualizarAlumno(Alumno alumno);
    //public void borrarAlumno(int id);
    
    
}
