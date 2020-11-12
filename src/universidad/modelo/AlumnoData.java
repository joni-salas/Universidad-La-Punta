package universidad.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad.entidades.Alumno;

public class AlumnoData {

    private Connection con;

    public AlumnoData(Conexion conexion) {

        con = conexion.getConnection();
    }

    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT into alumno (nombre_alumno, fn_alumno,activo) " + "VALUES(?, ?, ?);";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombreAlumno());
            ps.setDate(2, Date.valueOf(alumno.getFnAlumno()));
            ps.setBoolean(3, alumno.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));//aqui guardo la clave que estaba en base de datos pero en java no
            } else {
                JOptionPane.showMessageDialog(null, "No puedo obtener id");
            }
            rs.close();
            //con.close();
           // JOptionPane.showMessageDialog(null, "Alumno guardado con exito");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al guardar Alumno");
        }
    }

    public Alumno buscarAlumno(int id) {//operacion inversa al guardar
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE id_alumno=?";//si saco el where me devuelve una tabla con muchos, en este caso me devuelvo 1 solo
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("id_alumno"));
                alumno.setNombreAlumno(rs.getString("nombre_alumno"));
                alumno.setFnAlumno(rs.getDate("fn_alumno").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
                //JOptionPane.showMessageDialog(null, "Alumno encontrado");
            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Alumno no encontrado ", "Error!", JOptionPane.WARNING_MESSAGE);
        }
        return alumno;
    }

    public List<Alumno> obtenerAlumnos() {

        Alumno alumno;
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumno ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("id_alumno"));
                alumno.setNombreAlumno(rs.getString("nombre_alumno"));
                alumno.setFnAlumno(rs.getDate("fn_alumno").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
                System.out.println(alumno.getNombreAlumno());
                alumnos.add(alumno);
              // JOptionPane.showMessageDialog(null, "Alumnos encontrados");
            }
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Alumnos no encontrados ", "Error!", JOptionPane.WARNING_MESSAGE);
        }
        return alumnos;
    }

    public void actualizarAlumno(Alumno alumno) {

        try {
            String sql = "UPDATE alumno SET nombre_alumno=?, fn_alumno=?, activo=? WHERE id_alumno=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, alumno.getNombreAlumno());
            ps.setDate(2, Date.valueOf(alumno.getFnAlumno()));
            ps.setBoolean(3, alumno.isActivo());
            ps.setInt(4, alumno.getIdAlumno());

            ps.executeUpdate();
            ps.close();
            //con.close();
           //JOptionPane.showMessageDialog(null, "Alumno actualizado con exito");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al actualizar Alumno");
        }
    }
    
    public void borrarAlumno(int id){
    
        String sql="DELETE FROM alumno WHERE id_alumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.executeUpdate();
            
            ps.close();
           // JOptionPane.showMessageDialog(null, "Alumno borrado con exito");
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al borrar Alumno");
        }
        
    }

    //public Alumno buscarAlumno(int id);LISTO
    //public List<Alumno> obtenerAlumnos();LISTO
    //public void actualizarAlumno(Alumno alumno);LISTO
    //public void borrarAlumno(int id);LISTO
}
