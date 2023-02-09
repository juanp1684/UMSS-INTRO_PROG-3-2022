package colecciones;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int nota;
    
    public Estudiante(String nombre, String apellido, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "Estudiante: " + this.nombre + " " + this.apellido + " nota: " + this.nota;
    }
}
