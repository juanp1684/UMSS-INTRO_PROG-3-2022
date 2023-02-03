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
        
        System.out.println();
        System.out.println("Los elementos del arreglo son:");
        
        /*for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + "\t");
        }*/
        
        for (int elemento : arreglo) {
            System.out.print(elemento + "\t");
        }
    }
    
    public void bubblesort(int[] arreglo) {
        int n = arreglo.length;
        
        for (int c = 1; c <= n; c++) {
            for (int i = 0; i <= n - 2; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = aux;
                }
            }
        }
    }
    
    public int[] fibonacci(int n) {
        int[] arreglo = new int[n];
        arreglo[0] = 0;
        arreglo[1] = 1;
        
        for (int i = 2; i < n; i++) {
            arreglo[i] = arreglo[i - 2] + arreglo[i - 1];
        }
        
        return arreglo;
    }
    
    public void rotar(int[] arreglo, int nrot) {
        int n = arreglo.length;
        for (int c = 1; c <= nrot; c++) {
            int ultimo = arreglo[n - 1];
            
            for (int i = n - 1; i >= 1; i--) {
                arreglo[i] = arreglo[i - 1];
            }
            
            arreglo[0] = ultimo;
            
            mostrarArreglo(arreglo);
        }
    }
    
    public static void main(String[] args) {
        EjerciciosArreglos ejercicios = new EjerciciosArreglos();
        /*int [] arreglo = ejercicios.procesarEntrada();
        ejercicios.mostrarArreglo(arreglo);
        boolean palindrome = ejercicios.esPalindrome(arreglo);
        
        if (palindrome) {
            System.out.println("Es palindrome");
        } else {
            System.out.println("No es palindrome");
        }*/
        
        //int[] arregloFibonacci = ejercicios.fibonacci(10);
        //ejercicios.mostrarArreglo(arregloFibonacci);
        
        //int[] arregloRotacion = ejercicios.procesarEntrada();
        //ejercicios.rotar(arregloRotacion, 2);
        
        int[] arreglo = ejercicios.procesarEntrada();
        ejercicios.bubblesort(arreglo);
        ejercicios.mostrarArreglo(arreglo);
    }
}
