
package universidad;
import java.time.LocalDate;
import java.time.Month;
import universidad.entidades.*;
import universidad.modelo.*;


public class Universidad {

    public static void main(String[] args) {


        Conexion c =new Conexion();
        MateriaData md= new MateriaData(c);
       // Alumno nahu=new Alumno(3);
        Materia mat=new Materia(2);
        Materia alg = new Materia(2,"algebra");
       // AlumnoData ad=new AlumnoData(c);
       // InscripcionData id=new InscripcionData(c);
       // System.out.println(md.obtenerMaterias()); 
        //md.actualizarMateria(alg);
        md.borrarMateria(3);
        md.obtenerMaterias();
    }
    
}
