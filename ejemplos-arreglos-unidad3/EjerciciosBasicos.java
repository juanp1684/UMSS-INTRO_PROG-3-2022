import java.util.Scanner;
public class EjerciciosBasicos {
    public static void main(String[] args) {
        int elemento = 1;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arreglo = new int[n];
        
        // arreglo.length es el numero de elementos del arreglo
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = elemento;
            elemento += 2;
        }
        
        for (int j = 0; j <= n - 1; j++) {
            System.out.print(arreglo[j] + "\t");
        }
    }
}
