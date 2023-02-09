package clasesabstractas;

public class ClasePrincipal {
    public static void main(String... args) {
        Estudiante estudiante = new Estudiante("Juan", "Perez", 3);
        estudiante.mostrarDatos();
        
        Profesor profesor = new Profesor("Jorge", "Lopez", 8);
        profesor.mostrarDatos();
    }
}
