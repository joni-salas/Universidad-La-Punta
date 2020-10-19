
package universidad.modelo;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import universidad.entidades.*;
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
       rs.close();
       ps.close();
       // con.close();
       // JOptionPane.showMessageDialog(null,"Inscripcion guardada con exito");
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar inscripcion");
        }
       
    }
    public Inscripcion buscarInscripcion(int id){
        Inscripcion ins=null;
        String sql="SELECT * FROM inscripcion WHERE inscripcion.id_inscripcion=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                ins=new Inscripcion(new Alumno(),new Materia());
                ins.setIdInscripcion(rs.getInt(1));
                ins.getAlumno().setIdAlumno(rs.getInt(2));
                ins.getMateria().setIdMateria(rs.getInt(3));
                ins.setNota(rs.getDouble(4));
            //    JOptionPane.showMessageDialog(null, "Inscripcion encontrada");
            }
            rs.close();
            ps.close();
           // con.close();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se puedo encontrar la inscripcion", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return ins;
    }
    public List<Inscripcion> obtenerInscripcion(){
        List<Inscripcion> ins=new ArrayList<>();
        Inscripcion inscri;
         String sql="SELECT * FROM inscripcion";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                inscri=new Inscripcion(new Alumno(),new Materia());
                inscri.setIdInscripcion(rs.getInt(1));
                inscri.getAlumno().setIdAlumno(rs.getInt(2));
                inscri.getMateria().setIdMateria(rs.getInt(3));
                inscri.setNota(rs.getDouble(4));
                ins.add(inscri);
            }
               rs.close();
               ps.close();
          //  con.close();
          //  JOptionPane.showMessageDialog(null, "Inscripciones encontradas");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se puedo encontrar la inscripcion", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return ins;
    }
    public void actualizarInscripcion(Inscripcion inscripcion){
        String sql="UPDATE inscripcion SET calificacion=? WHERE inscripcion.id_inscripcion=?";
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1,inscripcion.getNota());
        ps.setInt(2,inscripcion.getIdInscripcion());
        ps.executeUpdate();
        //JOptionPane.showMessageDialog(null, "Inscripciones actualizada");
        ps.close();
       // con.close();
        }catch(HeadlessException | SQLException e){
             JOptionPane.showMessageDialog(null, "No se pudo actulizar inscripcion", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void borrarInscripcion(int id){
        String sql="DELETE FROM inscripcion WHERE inscripcion.id_inscripcion=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
           // JOptionPane.showMessageDialog(null, "Inscripciones Eliminada");  
            ps.close();
        }catch(HeadlessException | SQLException e){
             JOptionPane.showMessageDialog(null, "No se pudo eliminar inscripcion", "Error", JOptionPane.WARNING_MESSAGE);
        }
    
    }

    
}
