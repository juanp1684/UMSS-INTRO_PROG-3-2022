import java.util.Scanner;

public class EjerciciosArreglos {
    public int[] procesarEntrada() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el numero de elementos");
        int n = s.nextInt();
        int [] arreglo = new int[n];
        System.out.println("Introduzca los elementos del arreglo:");
        
        for (int c = 0; c < n; c++) {
            arreglo[c] = s.nextInt();
        }
        
        return arreglo;
    }
    
    public boolean esPalindrome(int[] arreglo) {
        // El arreglo solamente es visible dentro del metodo
        boolean palindrome = true; // Unicamente es visible dentro del metodo
        int n = arreglo.length;
        
        for (int i = 0; i < n / 2; i++) {
            int izq = i;
            int der = n - i - 1;
            
            if (arreglo[izq] != arreglo[der]) {
                palindrome = false;
                break;
            }
        }
        
        return palindrome;
    }
    
    public void mostrarArreglo(int[] arreglo) {
        int n = arreglo.length;
        
        System.out.println("Los elementos del arreglo son:");
        
        /*for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + "\t");
        }*/
        
        for (int elemento : arreglo) {
            System.out.print(elemento + "\t");
        }
    }
    
    public static void main(String[] args) {
        EjerciciosArreglos ejercicios = new EjerciciosArreglos();
        int [] arreglo = ejercicios.procesarEntrada();
        ejercicios.mostrarArreglo(arreglo);
        boolean palindrome = ejercicios.esPalindrome(arreglo);
        
        // EJERCICIO: Crear un metodo "mostrarArreglo" para visualizar
        // en pantalla los elementos de un arreglo enviado como parametro
        
        if (palindrome) {
            System.out.println("Es palindrome");
        } else {
            System.out.println("No es palindrome");
        }
    }
}
