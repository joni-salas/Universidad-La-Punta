
package universidad;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import universidad.entidades.*;
import universidad.modelo.*;


public class Universidad {

    public static void main(String[] args) {
        Conexion c = new Conexion();
        
        
        

        //Pruebas materia
        MateriaData md = new MateriaData(c);
        Materia mat = new Materia();
        //Materia alg = new Materia ("algebra");
        //md.guardarMateria(mat);
        //md.actualizarMateria(alg);
        //md.borrarMateria(9);
        //System.out.println(md.obtenerMaterias());
        //System.out.println(md.buscarMateria(11));

        //Pruebas Alumno
        AlumnoData ad = new AlumnoData(c);
        Alumno nahuel=new Alumno();
        //ad.guardarAlumno(nahuel);
        //System.out.println(ad.buscarAlumno(17));
        //ad.obtenerAlumnos();
        //Alumno nahu = ad.buscarAlumno(15);
        //nahu.setFnAlumno(LocalDate.of(2020, 10, 22));
        //ad.actualizarAlumno(nahu);
        //ad.borrarAlumno(15);
        

        //Pruebas Inscripcion
        InscripcionData id = new InscripcionData(c);
        //nahuel = ad.buscarAlumno(1);
        //mat= md.buscarMateria(2);
        //Inscripcion ins = new Inscripcion(nahuel,mat);
        Inscripcion ins=new Inscripcion();
       // ins=id.buscarInscripcion(5);
    //id.guardarInscripcion(ins);
       // ins.setNota(10);
        //id.actualizarInscripcion(ins);
        //ins=id.buscarInscripcion(3);
        id.borrarInscripcion(3);
            //                List<Inscripcion> arr = new ArrayList<>();
//                arr = id.obtenerInscripcion();
//                for (int x = 0; x < arr.size(); x++) {
//                    ins = arr.get(x);
//                    System.out.println(ins.getAlumno().getNombreAlumno());
//                }

   /*     Conexion c =new Conexion();
        MateriaData md= new MateriaData(c);
        //Materia mat=new Materia(2);
        //Materia alg = new Materia(2,"algebra");
        //md.actualizarMateria(alg);
        //md.borrarMateria(3);
        //md.obtenerMaterias();
        // System.out.println(md.obtenerMaterias());
        InscripcionData id=new InscripcionData(c);
         AlumnoData ad=new AlumnoData(c);
       // Materia mat=new Materia("quimica");
       // md.guardarMateria(mat);
         //Alumno alum = ad.buscarAlumno(3);
        // Materia mat = md.buscarMateria(2);
         Inscripcion ins= new Inscripcion();
         //id.guardarInscripcion(ins);
         List<Inscripcion> arr = new ArrayList<>();
         arr= id.obtenerInscripcion();
         for(int x=0;x<arr.size();x++){
             ins=arr.get(x);
         System.out.println(ins.getAlumno().getNombreAlumno());
         }

        //Pruebas Nahuel
        //Alumno nahuel=new Alumno("Nahuel Vargas",LocalDate.of(1998, 6, 13),false);
        //Alumno gaston=new Alumno("Gaston Sosa",LocalDate.of(1995, Month.JUNE, 19),true);
       
       // ad.guardarAlumno(gaston);
        
        //ad.guardarAlumno(nahuel);
        
                //Alumno nahu = ad.buscarAlumno(11);
        //nahu.setFnAlumno(LocalDate.of(1998, 8, 13));
        //ad.actualizarAlumno(nahu);
       // ad.borrarAlumno(11);*/
    }
   
}
