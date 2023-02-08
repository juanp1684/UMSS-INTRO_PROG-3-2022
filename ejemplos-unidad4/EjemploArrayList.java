import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> coleccionEnteros = new ArrayList<Integer>(); // Definimos la bolsa
        // Introducir elementos
        coleccionEnteros.add(10);
        coleccionEnteros.add(20);
        coleccionEnteros.add(30);
        
        for (Integer elemento : coleccionEnteros) {
            System.out.println("Elemento: " + elemento);
        }
        
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(new Estudiante("123", "Juan", "Perez", 20, 3, 40000));
        estudiantes.add(new Estudiante("321", "Jorge", "Lopez", 19, 5, 434000));
        estudiantes.add(new Estudiante("100", "Marco", "Gomez", 50, 7, 111111));
        
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarDatos();
        }
        
    }
}
