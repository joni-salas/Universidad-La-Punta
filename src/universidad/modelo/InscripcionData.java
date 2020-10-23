
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
        int n=0;
        
       /* try{
            String bus="SELECT * FROM inscripcion where inscripcion.id_alumno=?, inscripcion.id_materia=?";
        PreparedStatement prs = con.prepareStatement(bus);
        prs.setInt(1, inscripcion.getAlumno().getIdAlumno());
        prs.setInt(2, inscripcion.getMateria().getIdMateria());
        prs.executeQuery();
        ResultSet res = prs.getResultSet();
        if(res.next()==false){n++;}
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"alumno y materia ya inscripto anteriormente"); }
        if(n>0){*/
       List<Inscripcion> insA =new ArrayList<>();
       insA =obtenerInscripcion();
        try{

            for(int x=0;x<insA.size();x++){

                Inscripcion inscri=insA.get(x);
                if(inscri.getAlumno().getIdAlumno()==inscripcion.getAlumno().getIdAlumno() && 
                        inscri.getMateria().getIdMateria()==inscripcion.getMateria().getIdMateria()){
                    n++;
                }
            }
            if(n==0){
        String sql="INSERT into inscripcion (id_alumno, id_materia, calificacion) "
                + "VALUES(?, ?, ?);";
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
       JOptionPane.showMessageDialog(null,"Inscripcion guardada con exito");
        }else{ JOptionPane.showMessageDialog(null,"alumno y materia ya inscripto anteriormente"); }
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
                ins=new Inscripcion();
                ins.setIdInscripcion(rs.getInt(1));
                Alumno a=buscarAlumno(rs.getInt(2));
                Materia m=buscarMateria(rs.getInt(3));
                ins.setAlumno(a);
                ins.setMateria(m);
                ins.setNota(rs.getDouble(4));
                JOptionPane.showMessageDialog(null, "Inscripcion encontrada");
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
                Alumno a=buscarAlumno(rs.getInt(2));
                Materia m=buscarMateria(rs.getInt(3));
                inscri.setAlumno(a);
                inscri.setMateria(m);
                inscri.setNota(rs.getDouble(4));
                ins.add(inscri);
            }
               rs.close();
               ps.close();
          //  con.close();
            JOptionPane.showMessageDialog(null, "Inscripciones encontradas");
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
        JOptionPane.showMessageDialog(null, "Inscripciones actualizada");
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
            JOptionPane.showMessageDialog(null, "Inscripciones Eliminada");  
            ps.close();
        }catch(HeadlessException | SQLException e){
             JOptionPane.showMessageDialog(null, "No se pudo eliminar inscripcion", "Error", JOptionPane.WARNING_MESSAGE);
        }
    
    }
        public Alumno buscarAlumno(int id){
            Conexion c =new Conexion();
            AlumnoData ad = new AlumnoData(c);
            return ad.buscarAlumno(id);
            
    }
            public Materia buscarMateria(int id){
            Conexion c =new Conexion();
            MateriaData md = new MateriaData(c);
            return md.buscarMateria(id);
            
    }
             public List<Inscripcion> buscarInscripcionXAlumno(int id){
        Inscripcion ins=null;
        ArrayList<Inscripcion> insL=new ArrayList<>();
        String sql="SELECT * FROM inscripcion WHERE inscripcion.id_alumno=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                ins=new Inscripcion();
                ins.setIdInscripcion(rs.getInt(1));
                Alumno a=buscarAlumno(rs.getInt(2));
                Materia m=buscarMateria(rs.getInt(3));
                ins.setAlumno(a);
                ins.setMateria(m);
                ins.setNota(rs.getDouble(4));
                JOptionPane.showMessageDialog(null, "Inscripcion encontrada");
                insL.add(ins);//lo agrego ala lista
            }
            rs.close();
            ps.close();
           // con.close();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se puedo encontrar la inscripcion", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return insL;//devuelvo la lista
    }
             
   public List<Inscripcion> buscarInscripcionXMateria(int id){
        Inscripcion ins=null;
        ArrayList<Inscripcion> insL=new ArrayList<>();
        String sql="SELECT * FROM inscripcion WHERE inscripcion.id_materia=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                ins=new Inscripcion();
                ins.setIdInscripcion(rs.getInt(1));
                Alumno a=buscarAlumno(rs.getInt(2));
                Materia m=buscarMateria(rs.getInt(3));
                ins.setAlumno(a);
                ins.setMateria(m);
                ins.setNota(rs.getDouble(4));
                JOptionPane.showMessageDialog(null, "Inscripcion encontrada");
                insL.add(ins);//lo agrego ala lista
            }
            rs.close();
            ps.close();
           // con.close();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se puedo encontrar la inscripcion", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return insL;//devuelvo la lista
    }

    
}
