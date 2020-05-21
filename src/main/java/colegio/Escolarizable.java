package colegio;

public interface Escolarizable {

    public enum Curso { ESO1, ESO2, ESO3, ESO4, BAC1, BAC2, SMR1, SMR2, ASIR1, ASIR2 }

    public void matricular (Curso curso);
    public void desmatricular ();    
}
