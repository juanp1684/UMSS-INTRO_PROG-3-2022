
/**
 * Generar la serie 2   -4  6   -8  10  -12 14...
 */

import java.util.Scanner;

public class Serie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cont = 1, signo = 1;
        
        while (cont <= n) {
            int termino = cont * signo * 2;
            System.out.print(termino + "\t");
            cont++;
            signo *= -1;
        }
    }
}
