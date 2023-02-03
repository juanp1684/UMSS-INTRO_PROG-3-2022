import java.util.Scanner;

public class Intercambio {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el numero de elementos del arreglo");
        n = s.nextInt();
        int[] arreglo = new int[n];
        System.out.println("Introduzca los elementos del arreglo");
        
        for (int i = 0; i < n; i++) {
            int elemento = s.nextInt();
            arreglo[i] = elemento;
        }
        
        System.out.println("Introduzca los indices i y j para el intercambio");
        int i = s.nextInt();
        int j = s.nextInt();
        
        int aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
        
        System.out.println("Los elementos del arreglo son");
        
        for (int k = 0; k < n; k++) {
            System.out.print(arreglo[k] + "\t");
        }
    }
}
