import java.util.Scanner;

public class EjerciciosBasicos {
    int[][] ingresarMatriz(int m, int n) {
        int[][] matriz = new int[m][n];
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca los elementos de la matriz");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Fila: " + i + " columna: " + j);
                matriz[i][j] = s.nextInt();
            }
        }
        return matriz;
    }
    
    public int[][] transpuesta(int[][] matriz) {
        int m = matriz.length;
        int n = matriz[0].length;
        int [][] transpuesta = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        
        return transpuesta;
    }
    
    public void visualizarMatriz(int[][] matriz) {
        int m = matriz.length;
        int n = matriz[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public int[][] sumar(int[][] matriz1, int[][] matriz2) {
        int m = matriz1.length; // nro filas
        int n = matriz1[0].length; // nro columnas
        int[][] suma = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        return suma;
    }
    
    public int[][] multiplicar(int[][] matriz1, int[][] matriz2) {
        int m = matriz1.length; // Nro de filas de la primera matriz
        int n = matriz2[0].length; // Nro de columnas de la segunda matriz
        int p = matriz1[0].length; // Nro de columnas de la primera matriz
        int[][] resultado = new int[m][n]; // Definir el resultado
        
        for (int i = 0; i < m; i++) { // Itera las filas del resultado
            for (int j = 0; j < n; j++) { // Itera las columnas del resultado
                for (int k = 0; k < p; k++) { // Visita los elementos que se deben multiplicar
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        
        return resultado;
    }
    
    public int[][] generarMatrizFibonacci(int n) {
        int[][] matriz = new int[n][n];
        int a = 0, b = 1, c;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = a;
                c = a + b;
                a = b;
                b = c;
            }
        }
        
        return matriz;
    }
    
    public void rotar(int[][] matriz) {
        // Transponer
        int m = 3, n = 3;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        
        //Intercambiar la primera y ultima columna
        for (int i = 0; i < m; i++) {
            int aux = matriz[i][0];
            matriz[i][0] = matriz[i][n - 1];
            matriz[i][n - 1] = aux;
        }
    }
    
    public static void main(String[] args) {
        EjerciciosBasicos ejercicios = new EjerciciosBasicos();
        /*int [][] matriz = ejercicios.ingresarMatriz(3, 4);
        int [][] transpuesta = ejercicios.transpuesta(matriz);
        ejercicios.visualizarMatriz(transpuesta);
        /*int[][] matriz1 = ejercicios.ingresarMatriz(3, 4);
        int[][] matriz2 = ejercicios.ingresarMatriz(3, 4);
        int[][] resultado = ejercicios.sumar(matriz1, matriz2);
        ejercicios.visualizarMatriz(resultado);
        int[][] matrizFibonacci = ejercicios.generarMatrizFibonacci(3);
        ejercicios.visualizarMatriz(matrizFibonacci);*/
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ejercicios.rotar(matriz);
        ejercicios.visualizarMatriz(matriz);
    }
}
