package archivos;

import java.io.*;
import java.util.Arrays;

public class EjercicioArchivos {
    public static void main(String[] args) {
        try {
            // C:/prueba/archivo.txt
            BufferedWriter bw = new BufferedWriter(
                                     new FileWriter("/home/ocontreras/prueba/archivo.csv")
                                );
            bw.write("Oscar,Contreras");
            bw.newLine();
            bw.write("Juan,Perez");
            bw.newLine();
            bw.close();
            
            BufferedReader br = new BufferedReader(
                                   new FileReader("/home/ocontreras/prueba/archivo.csv")
                                );
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                System.out.println(Arrays.toString(datos)); // Convertir un arreglo en cadena
            }
        } catch (IOException e) {
            System.out.println("Hubo un eror " + e.getMessage());
        }
    }
    
    
    
    
}
