
package universidad;
import java.time.LocalDate;
import java.time.Month;
import universidad.entidades.*;
import universidad.modelo.*;


public class Universidad {

    public static void main(String[] args) {


        Conexion c =new Conexion();
        //MateriaData md= new MateriaData(c);
        //Materia mat=new Materia(2);
        //Materia alg = new Materia(2,"algebra");
        //md.actualizarMateria(alg);
        //md.borrarMateria(3);
        //md.obtenerMaterias();
        // System.out.println(md.obtenerMaterias());
        //InscripcionData id=new InscripcionData(c);
         
        
        
        
        //Pruebas Nahuel
        //Alumno nahuel=new Alumno("Nahuel Vargas",LocalDate.of(1998, 6, 13),false);
        //Alumno gaston=new Alumno("Gaston Sosa",LocalDate.of(1995, Month.JUNE, 19),true);
        AlumnoData ad=new AlumnoData(c);
       // ad.guardarAlumno(gaston);
        
        //ad.guardarAlumno(nahuel);
        //ad.obtenerAlumnos();
        //Alumno nahu = ad.buscarAlumno(11);
        //nahu.setFnAlumno(LocalDate.of(1998, 8, 13));
        //ad.actualizarAlumno(nahu);
        ad.borrarAlumno(11);
    }
    
}
