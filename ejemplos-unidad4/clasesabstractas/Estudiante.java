package clasesabstractas;

public class Estudiante extends Persona {
    private int semestre;
    
    public Estudiante(String nombre, String apellido, int semestre) {
        super(nombre, apellido);
        this.semestre = semestre;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Datos: " + this.nombre + " " + this.apellido + " " + this.semestre);
    }
    
    @Override
    public void caminar() {
        System.out.println("Estudiante caminando...");
    }
}
