package colegio;

import java.util.Date;


public abstract class Alumno implements Escolarizable {
    
    private String nombre;
    private String apellidos;
    private Date nacimiento;
    private int[] notas;
    private static int numAlumnos = 0;
    protected Curso curso;
    
    
    public Alumno () { numAlumnos++; }
    
    public Alumno (String nombre, String apellidos) {
        this();
        this.nombre    = nombre;
        this.apellidos = apellidos;
    }
    
    public Alumno (String nombre, String apellidos, Date nacimiento, int[] notas) {
        this (nombre, apellidos);
        this.nacimiento = nacimiento;
        this.notas = notas;
    }
     
    public String getNombre () {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public String getNotas_str() {
        StringBuffer str = new StringBuffer();
        str = str.append(notas[0]).append(" ").append(notas[1]).append(" ").append(notas[2]);
        return str.toString();
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public Curso getCurso() {
        return curso;
    }

    public static int getNumAlumnos () { return numAlumnos; }
    
    // public abstract void matricular (Curso curso);
    // public abstract void desmatricular ();

    @Override
    protected void finalize() throws Throwable {
        numAlumnos --;
        super.finalize();
    }  

}
