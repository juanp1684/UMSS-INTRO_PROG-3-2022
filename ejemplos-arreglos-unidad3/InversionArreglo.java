
public class InversionArreglo {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50, 60};
        int n = arreglo.length;
        
        for (int i = 0; i <= n / 2 - 1; i++) {
            int j = n - i - 1;
            int aux = arreglo[i];
            arreglo[i] = arreglo[j];
            arreglo[j] = aux;
        }
        
        System.out.println("Los elementos del arreglo son");
        
        for (int k = 0; k < n; k++) {
            System.out.print(arreglo[k] + "\t");
        }
    }
}
