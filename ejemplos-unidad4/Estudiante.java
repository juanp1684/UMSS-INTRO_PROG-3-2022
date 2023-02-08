public class Estudiante extends Persona {
    private int semestre;
    private int codigoSis;
    
    public Estudiante(String ci, String nombre, String apellido, 
                      int edad, int semestre, int codigoSis) {
        super(ci, nombre, apellido, edad); // Llamar al constructor de la clase padre
        this.semestre = semestre;
        this.codigoSis = codigoSis;
    }
    
    public void inscribirse() {
        System.out.println("Inscribiendo...");
    }
    
    public void estudiar() {
        System.out.println("Estudiando...");
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Los datos del estudiante son:\n " +
            "CI: " + this.ci + "\n" +
            "Nombre: " + this.nombre + "\n" +
            "Apellido: " + this.apellido + "\n" +
            "Edad: " + this.edad + "\n" +
            "Semestre: " + this.semestre + "\n" +
            "Codigo SIS: " + this.codigoSis + "\n");
    }
    
    
    
    
    
    
}
