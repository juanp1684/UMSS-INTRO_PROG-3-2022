package colecciones;

import java.util.*;

public class EjemploSets {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo HashSet === ");
        HashSet<Integer> enteros = new HashSet<>();
        enteros.add(15);
        enteros.add(15);
        enteros.add(5);
        enteros.add(20);
        enteros.add(2);
        enteros.add(20);
        
        for (Integer elemento : enteros) {
            System.out.println(elemento);
        }
        
        System.out.println("==== Ejemplo TreeSet ====");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(15);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(25);
        treeSet.add(20);
        
        for (Integer elemento : treeSet) {
            System.out.println(elemento);
        }
    }
    
}
