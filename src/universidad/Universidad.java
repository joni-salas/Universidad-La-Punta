
package universidad;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidad.entidades.Alumno;
import universidad.modelo.*;

/**
 *
 * @author joni
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Conexion c =new Conexion();
        Connection con=c.getConnection(); 
         //('Juan Perez', '1983-4-8', '1');
        Alumno juan=new Alumno("Gaston",LocalDate.of(1995, Month.APRIL, 8),true);
        AlumnoData ad=new AlumnoData(c);
        ad.guardarAlumno(juan);
    }
    
}
