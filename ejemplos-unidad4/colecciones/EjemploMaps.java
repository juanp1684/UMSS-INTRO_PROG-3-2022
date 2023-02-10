package colecciones;

import java.util.*;

public class EjemploMaps {
    public static boolean esAnagrama(String palabra1, String palabra2) {
        Hashtable<Character, Integer> conteoPalabra1 = contarLetras(palabra1);
        Hashtable<Character, Integer> conteoPalabra2 = contarLetras(palabra2);
        return conteoPalabra1.equals(conteoPalabra2); // Proviene de Object
    }
    
    public static Hashtable<Character, Integer> contarLetras(String palabra) {
        // Retornar el numero de veces que aparece cada letra en la palabra
        // en un Hashtable (+1p)
        Hashtable<Character, Integer> conteos = new Hashtable<>();
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            // 1 punto: simplificar este bloque a una linea de codigo
            /*if (conteos.get(letra) == null) {
                conteos.put(letra, 1);
            } else {
                conteos.put(letra, conteos.get(letra) + 1);
            }*/
            conteos.put(letra, (conteos.get(letra) == null) ? 1 : conteos.get(letra) + 1);
            ///////
        }
        
        return conteos;
    }
    
    public static void main(String[] args) {
        /*System.out.println("=== Ejemplo de HashMaps");
        HashMap<String, Integer> dias = new HashMap<>();
        dias.put("Lunes", 1);
        dias.put("Martes", 2);
        dias.put("Miercoles", 3);
        dias.put("Jueves", null); // Esto no es posible con un Hashtable
        
        System.out.println("El primer valor es " + dias.get("Lunes")); // Devuelve 1
        System.out.println("El ultimo valor es " + dias.get("Miercoles")); // Devuelve 3
        System.out.println("Valor inexistente " + dias.get("Sabado"));
        
        System.out.println("Los elementos del HashMap son:");
        
        for (Map.Entry<String, Integer> elemento : dias.entrySet()) {
            System.out.println("Llave: " + elemento.getKey() + " valor: " + elemento.getValue());
        }
        
        System.out.println("==== Ejercicio de Hashtables =====");
        Hashtable<String, String> diasInglesEspanol = new Hashtable<>();
        diasInglesEspanol.put("Lunes", "Monday");
        diasInglesEspanol.put("Martes", "Tuesday");
        diasInglesEspanol.put("Miercoles", "Wednesday");
        
        String llave = "Lunes";
        System.out.println("El valor de " + llave + " es " + diasInglesEspanol.get(llave));*/
        Hashtable<Character, Integer> conteos = EjemploMaps.contarLetras("estudiante");
        
        for (Map.Entry<Character, Integer> elemento : conteos.entrySet()) {
            System.out.println(elemento.getKey() + " " + elemento.getValue());
        }
    }
    
    
    
    
    
    
    
    
    
}
