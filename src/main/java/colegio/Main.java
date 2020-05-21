package colegio;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void nuevoAlumno(Alumno alumno) {
        if (alumno instanceof AlumnoESO){
            AlumnoESO a;
            alumno.matricular(Escolarizable.Curso.ESO1);
            a = (AlumnoESO) alumno;
            a.setNombrePadre ("");            
        } 
        else if (alumno instanceof AlumnoCiclo){
            AlumnoCiclo a;
            alumno.matricular(Escolarizable.Curso.SMR1);
            a = (AlumnoCiclo) alumno;       
        }
    }

        
    public static void main(String[] args) {

        AlumnoESO   juan;
        AlumnoCiclo ana;
        
        juan = new AlumnoESO ("Juan Carlos", "Pérez",
                              new GregorianCalendar(1995, 0, 1).getTime(),
                              new int[] {6, 9, 7} );
        
        // El anterior alumno se pierde
        juan = new AlumnoESO("Juan José", "López",
                              new GregorianCalendar(1994, 11, 1).getTime(),
                              new int[] {2, 3, 4} );
        
        ana = new AlumnoCiclo("Ana María", "López",
                              new GregorianCalendar(1990, 0, 1).getTime(),
                              new int[] {5, 6, 8} );
        
        nuevoAlumno(juan);
        nuevoAlumno(ana);
        System.gc();
        
        if (juan.getCurso() != null) System.out.println ("Curso : " + juan.getCurso());
        else System.out.println("El alumno no está matriculado");
        
        if (ana.getCurso() != null) System.out.println ("Curso : " + ana.getCurso());
        else System.out.println("El alumno no está matriculado");
        
        System.out.println(Alumno.getNumAlumnos() + " alumnos");
        
        ProfesorESO valerio = new ProfesorESO ("Valerio", "Valiente", new GregorianCalendar(1980,07,30),               
                                             new String[]{"Lengua", "Latín"}, true, Escolarizable.Curso.ESO1);
        
        ProfesorESO anonimo = new ProfesorESO();
        
        System.out.println("El profesor " + valerio.getNombre() + " nació en el año " 
                           + valerio.getNacimiento().get(Calendar.YEAR) + ". Imparte las materias:");
        for (String materia : valerio.getAsignaturas()) {
            System.out.println("- " + materia);
        }
        
        System.out.println("El profesor " + anonimo.getNombre() + " nació en el año " 
                           + anonimo.getNacimiento().get(Calendar.YEAR) + ". Imparte las materias:");
        for (String materia : anonimo.getAsignaturas()) {
            System.out.println("- " + materia);
        }
        
        System.out.println(Profesor.getNumProfesores() + " profesores");
    }
    
}
