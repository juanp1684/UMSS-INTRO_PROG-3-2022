package clasesabstractas;

public abstract class Persona { // No se puede instanciar
    protected String nombre;
    protected String apellido;
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public abstract void mostrarDatos(); // Los metodos abstractos no tienen implementacion
    public abstract void caminar();
    
    public void holaMundo() { // Metodo no abstracto
        System.out.println("HOLA A TODOS");
    }
}
