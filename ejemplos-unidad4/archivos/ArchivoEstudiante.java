package archivos;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ArchivoEstudiante {
    public static void main(String[] args) throws IOException {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", "Perez", 3));
        estudiantes.add(new Estudiante("Jorge", "Lopez", 5));
        estudiantes.add(new Estudiante("Marco", "Gomez", 7));
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/ocontreras/prueba/estudiantes.csv"));
        for (Estudiante estudiante : estudiantes) {
            bw.write(estudiante.toString());
            bw.newLine();
        }
        bw.close();
    }
}
