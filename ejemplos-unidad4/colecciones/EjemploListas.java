package colecciones;

import java.util.*;

public class EjemploListas {
    public static void main(String[] args) {
        System.out.println("ArrayList de Object:");
        ArrayList listaElementos = new ArrayList(); // Almacena elementos de tipo Object
        listaElementos.add(10);
        listaElementos.add("Hola mundo");
        listaElementos.add(true);
        
        System.out.println("El tamaño es " + listaElementos.size());
        System.out.println("El primero es " + listaElementos.get(0));
        System.out.println("El tercero es " + listaElementos.get(2)); 
        
        System.out.println("Los elementos son");
        
        for (Object elemento : listaElementos) {
            System.out.println(elemento);
        }
        
        System.out.println("Listas genericas");
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Lunes");
        listaStrings.add("Martes");
        listaStrings.add("Miercoles");
        
        System.out.println("el primer elemento es " + listaStrings.get(0));
        System.out.println("el tamaño es " + listaStrings.size());
        
        System.out.println("==== Lista de estudiantes ====");
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(new Estudiante("Juan","Perez", 51));
        estudiantes.add(new Estudiante("Roberto","Lopez", 99));
        estudiantes.add(new Estudiante("Pablo","Gomez", 30));
        
        System.out.println("El primero es " + estudiantes.get(0));
        //EJERCICIO: Crear la clase Profesor (nombre, apellido, salario)
        // Sobrescribir el toString()
        // Crear un ArrayList de Profesor
        
        System.out.println();
        System.out.println("Listas enlazadas");
        LinkedList<String> listaEnlazada = new LinkedList<>();
        listaEnlazada.add("Basketball");
        listaEnlazada.add("Voleyball");
        listaEnlazada.add("Futbol");
        
        System.out.println("El primero es " + listaEnlazada.getFirst());
        System.out.println("El ultimo es " + listaEnlazada.getLast());
        System.out.println("El segundo es " + listaEnlazada.get(1));
        
        System.out.println("=== Definicion de pilas ====");
        Stack<String> pila = new Stack<>();
        // Introducir
        pila.push("Uno");
        pila.push("Dos");
        pila.push("Tres");
        // Extraer
        System.out.println("El primer elemento es " + pila.get(0));
        System.out.println("Extrayendo elemento: " + pila.pop());
        System.out.println("Extrayendo elemento: " + pila.pop());
        System.out.println("Extrayendo elemento: " + pila.pop());
        
        // EJERCICIO: Definir una pila que almacena los dias de la semana
        // Introducir los elementos en orden
        // Extraer los elementos por medio de pop
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
