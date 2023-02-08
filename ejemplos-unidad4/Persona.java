public class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected Integer edad;
    
    // Constructor de la clase Persona
    public Persona(String ci, String nombre, String apellido, int edad) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void caminar() {
        System.out.println("Caminando...");
    }
    
    public void mostrarDatos() {
        String datos = "CI: " + this.ci + " nombre: " + this.nombre + " apellido: " +
                       this.apellido + " edad: " + this.edad;
        System.out.println(datos);
    }
    
    
    
    
    
}
