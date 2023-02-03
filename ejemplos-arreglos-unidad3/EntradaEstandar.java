import java.util.Scanner;

public class EntradaEstandar {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el numero de elementos del arreglo");
        n = s.nextInt();
        int[] arreglo = new int[n];
        System.out.println("Introduzca los elementos del arreglo");
        
        for (int i = 0; i < n; i++) {
            int elemento = s.nextInt();
            arreglo[i] = elemento;
        }
        
        //System.out.println("Los elementos del arreglo son");
        
        for (int j = 0; j < n; j++) {
            //System.out.print(arreglo[j] + "\t");
            if (arreglo[j] % 2 != 0) {
                sum = sum + arreglo[j];
            }
        }
        
        System.out.println("La suma de los elementos impares es " + sum);
    }
}
