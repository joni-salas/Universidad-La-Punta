
package universidad.entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author joni
 */
public class Alumno {
    private int idAlumno;
    private String nombreAlumno;
    private LocalDate fnAlumno;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(String nombreAlumno, LocalDate fnAlumno, boolean activo) {
        this.nombreAlumno = nombreAlumno;
        this.fnAlumno = fnAlumno;
        this.activo = activo;
    }
    public Alumno(int idInscripcion){
        this.idAlumno = idInscripcion;
    }
    public Alumno(int idInscripcion, String nombreAlumno, LocalDate fnAlumno, boolean activo) {
        this.idAlumno = idInscripcion;
        this.nombreAlumno = nombreAlumno;
        this.fnAlumno = fnAlumno;
        this.activo = activo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public LocalDate getFnAlumno() {
        return fnAlumno;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdAlumno(int idInscripcion) {
        this.idAlumno = idInscripcion;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setFnAlumno(LocalDate fnAlumno) {
        this.fnAlumno = fnAlumno;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
