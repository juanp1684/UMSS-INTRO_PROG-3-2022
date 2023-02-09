package clasesabstractas;

public class Profesor extends Persona {
    private int experiencia;
    
    public Profesor(String nombre, String apellido, int experiencia) {
        super(nombre, apellido);
        this.experiencia = experiencia;
    }
    
    @Override
    public void caminar() {
        System.out.println("Profesor caminando...");
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + " apellido: " + this.apellido +
                           " experiencia: " + this.experiencia);
    }
    
    public void mostrarSalario() {
        System.out.println("El salario es 4000");
    }
    
    
    
}
