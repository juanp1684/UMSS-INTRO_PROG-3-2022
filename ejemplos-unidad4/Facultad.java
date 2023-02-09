import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private Integer anioFundacion;
    private ArrayList<Carrera> carreras;
    
    public Facultad(String nombre, Integer anioFundacion) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        
        this.carreras = new ArrayList<Carrera>();
        this.carreras.add(new Carrera("Ingenieria de Sistemas", 1990));
        this.carreras.add(new Carrera("Ingenieria Civil", 1950));
    }
    
    @Override
    public String toString() {
        String resultado = nombre + " " + anioFundacion + " Carreras:\n";
        StringBuilder sb = new StringBuilder();
        
        for (Carrera carrera : this.carreras) {
            sb.append(carrera.toString());
            sb.append("\n");
        }
        
        return resultado + sb.toString();
    }
}
