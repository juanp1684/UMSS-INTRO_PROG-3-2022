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
    
    public static void main(String[] args) {
        EjerciciosBasicos ejercicios = new EjerciciosBasicos();
        int [][] matriz = ejercicios.ingresarMatriz(3, 4);
        int [][] transpuesta = ejercicios.transpuesta(matriz);
        ejercicios.visualizarMatriz(transpuesta);
        /*int[][] matriz1 = ejercicios.ingresarMatriz(3, 4);
        int[][] matriz2 = ejercicios.ingresarMatriz(3, 4);
        int[][] resultado = ejercicios.sumar(matriz1, matriz2);
        ejercicios.visualizarMatriz(resultado);*/
    }
}
