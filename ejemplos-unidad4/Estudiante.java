import java.util.ArrayList;

public class Estudiante extends Persona {
    private int semestre;
    private int codigoSis;
    private ArrayList<Materia> materias; // Implementando agregacion
    private Facultad facultad;
    
    public Estudiante(String ci, 
                      String nombre, 
                      String apellido, 
                      int edad, 
                      int semestre, 
                      int codigoSis, 
                      ArrayList<Materia> materias,
                      Facultad facultad) {
        super(ci, nombre, apellido, edad); // Llamar al constructor de la clase padre
        this.semestre = semestre;
        this.codigoSis = codigoSis;
        this.materias = materias;
        this.facultad = facultad;
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
            
        System.out.println("Materias:");
        for (Materia materia: this.materias) {
            System.out.println(materia);
        }
        
        System.out.println("Facultad:");
        System.out.println(this.facultad);
    }
    
    
    
    
    
    
}
