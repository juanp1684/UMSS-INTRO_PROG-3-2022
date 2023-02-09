public class Carrera {
    private String nombre;
    private Integer anioFundacion;
    
    public Carrera(String nombre, Integer anioFundacion) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
    }
    
    @Override
    public String toString() {
        return this.nombre + " " + this.anioFundacion;
    }
}
