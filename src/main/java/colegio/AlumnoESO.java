package colegio;

import java.util.Date;

public final class AlumnoESO extends Alumno {

    public AlumnoESO() {
        super();
    }

    public AlumnoESO(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    public AlumnoESO(String nombre, String apellidos, Date nacimiento, int[] notas) {
        super(nombre, apellidos, nacimiento, notas);
    }

       
    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    private String nombrePadre;
    private String nombreMadre;
    
    
    @Override
    public void matricular(Curso curso) {
        if ( curso == Curso.ESO1 || curso == Curso.ESO2 || curso == Curso.ESO3 || curso == Curso.ESO4)
            this.curso = curso;
    }

    @Override
    public void desmatricular() {
        if (curso != null)
            this.curso = null;
    }

  
}
