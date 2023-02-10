package archivos;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int semestre;
    
    public Estudiante(String nombre, String apellido, int semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
    }
    
    @Override
    public String toString() {
        return this.nombre + "," + this.apellido + "," + this.semestre;
    }
}
