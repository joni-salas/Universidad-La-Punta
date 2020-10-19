
package universidad.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
       
        rs.close();
        ps.close();
        //con.close();
       // JOptionPane.showMessageDialog(null,"Materia guardada con exito");
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar Materia");
        }
       
    }
    public Materia buscarMateria(int id){
        Materia materia= null;
        String sql ="SELECT * FROM `materia` WHERE id_materia=?";
        
        try{
           PreparedStatement ps = con.prepareStatement(sql); 
           ps.setInt(1, id);
           
           ResultSet rs=ps.executeQuery();
           
           if(rs.next()){
               materia = new Materia();
               materia.setIdMateria(rs.getInt("id_materia"));
               materia.setNombreMateria(rs.getString("nombre_materia"));
               
         //      JOptionPane.showMessageDialog(null, "Materia encontrada");
           }
           
            rs.close();
            ps.close();
            //con.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Materia no encontrada ", "Error!", JOptionPane.WARNING_MESSAGE);
        }
        
        return materia;
    }
    
    public List<Materia> obtenerMaterias(){
        Materia materia=null;
        List<Materia> materias= new ArrayList<>();
        String sql = "SELECT * FROM `materia`";
        
        try{
          PreparedStatement ps= con.prepareStatement(sql);
          ResultSet rs=ps.executeQuery();
          
            while(rs.next()){
               materia= new Materia();
               materia.setIdMateria(rs.getInt(1));
               materia.setNombreMateria(rs.getString(2));
               materias.add(materia);
            }
         //   JOptionPane.showMessageDialog(null, "Materias Encontradas");
            rs.close();
            ps.close();
            //con.close();
         }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Materias no Encontradas ", "Error!", JOptionPane.WARNING_MESSAGE);
        }
        return materias;
    }
    
    public void actualizarMateria(Materia materia){
        try{
            String sql = "UPDATE `materia` SET `nombre_materia` =? WHERE id_materia=?" ;
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, materia.getNombreMateria());
            ps.setInt(2, materia.getIdMateria());
            
            ps.executeUpdate();
          //  JOptionPane.showMessageDialog(null, "Materia Actualizada");
            
            ps.close();
            //con.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Materia no Actualizada", "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void borrarMateria(int id){
        
        String sql = "DELETE FROM `materia` WHERE `id_materia`=?";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
         //   JOptionPane.showMessageDialog(null, "Materia Borrada");
            ps.close();
            //con.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo borrar la Materia", "Error!", JOptionPane.WARNING_MESSAGE);
        }
        
    }
        
    }


    //JOptionPane.showMessageDialog(null, "Hello World");
    //JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);
    //String name = JOptionPane.showInputDialog("Escribe tu nombre");
    //JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, Tipo De Mensaje (WARNING,ERROR,ETC.) );
    //String respuesta = JOptionPane.showInputDialog(null, "Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);

