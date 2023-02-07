public class EjerciciosCadenas {
    public static void main(String[] args) {
        // EJERCICIO:
        String cadena = "INTRODUCCION A LA PROGRAMACION";
        // 1. Generar un arreglo con las palabras INTRODUCCION, A, LA, PROGRAMACION
        // 2. Mostrar los valores ascii de la palabra INTRODUCCION
        
        cadena = cadena.toLowerCase(); // Realizar la conversion a minusculas
        cadena = cadena.toUpperCase(); // Realizar la conversion a mayusculas
        System.out.println(cadena);
        String[] palabras = cadena.split(" "); // Para segmentar una cadena
        String introduccion = palabras[0];
        
        for (int i = 0; i < introduccion.length(); i++) {
            int valorAscii = introduccion.charAt(i);
            System.out.println(valorAscii);
        }
    }
}
