package colegio;

import java.util.GregorianCalendar;


public class ProfesorESO extends Profesor {

    private static int numProfesoresESO = 0;
    
    public ProfesorESO() {
        super();
        this.numProfesoresESO ++;        
    }

    public ProfesorESO(String nombre, String apellidos, GregorianCalendar nacimiento, 
                       String[] asignaturas, boolean jefatura, Escolarizable.Curso tutoria) {
        super(nombre, apellidos, nacimiento, asignaturas, jefatura, tutoria);
        this.numProfesoresESO ++;  
    }

    public static int getNumProfesoresESO() {
        return numProfesoresESO;
    }

    public static void setNumProfesoresESO(int numProfesoresESO) {
        ProfesorESO.numProfesoresESO = numProfesoresESO;
    }

    
    @Override
    protected void finalize() throws Throwable {
        numProfesoresESO--;
        super.finalize();        
    }

    
    
    
    
}
