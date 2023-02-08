import java.util.ArrayList;

public class Edificio {
    private String nombre;
    private String direccion;
    private int numeroPisos;
    private ArrayList<Habitacion> habitaciones;
    
    public Edificio(String nombre, String direccion, int numeroPisos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroPisos = numeroPisos;
        
        this.habitaciones = new ArrayList<Habitacion>(); // Implementamos la composicion
        this.habitaciones.add(new Habitacion(40, "1C"));
        this.habitaciones.add(new Habitacion(100, "2D"));
    }
}
