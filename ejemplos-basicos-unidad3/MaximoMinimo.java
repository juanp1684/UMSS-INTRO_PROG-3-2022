// javac -version
// java -version

import java.util.*;

public class MaximoMinimo {
    public static void main(String[] args) {
        int max, min, num, dif;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un valor");
        num = s.nextInt();
        max = num;
        min = num;
        
        for (int c = 2; c <= 5; c++) {
            System.out.println("Introduzca un valor");
            num = s.nextInt();
            
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        
        dif = max - min;
        System.out.println("La diferencia es " + dif);
    }
}
