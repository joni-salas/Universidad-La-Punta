
package universidad;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidad.entidades.*;
import universidad.modelo.*;


public class Universidad {

    public static void main(String[] args) {

        
        Conexion c =new Conexion();
         //('Juan Perez', '1983-4-8', '1');
        Alumno nahu=new Alumno(3);
        Materia mat=new Materia(2);
        Inscripcion ins=new Inscripcion(nahu,mat,10);
        //AlumnoData ad=new AlumnoData(c);
     //   MateriaData md=new MateriaData(c);
        InscripcionData id=new InscripcionData(c);
        id.guardarInscripcion(ins);
      //  ad.guardarAlumno(nahu);
      //   md.guardarMateria(mat);
    }
    
}
