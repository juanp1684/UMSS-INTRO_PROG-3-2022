package clasesabstractas;

import java.util.Scanner;

public class ClasePrincipal {
    // EJERCICIO: Enviar nombre, apellido y semestre via args del metodo main
    // procesar los argumentos
    public static void main(String... args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre del estudiante:");
        String nombre = scanner.next();
        System.out.println("Introduzca el apellido del estudiante");
        String apellido = scanner.next();
        System.out.println("Introduzca el semestre");
        int semestre = scanner.nextInt();*/
        
        // Procesar los datos a partir de args
        String nombre = args[0];
        String apellido = args[1];
        int semestre = Integer.parseInt(args[2]);
        
        Estudiante estudiante = new Estudiante(nombre, apellido, semestre);
        estudiante.mostrarDatos();
        
        Profesor profesor = new Profesor("Jorge", "Lopez", 8);
        profesor.mostrarDatos();
    }
}
