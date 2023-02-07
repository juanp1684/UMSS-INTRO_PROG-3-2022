package ejemplos;

public class Marcador {
    private String color;
    private int grosor;
    private String marca;
    private int tamanio;
    
    public Marcador(String color, int grosor, String marca, int tamanio) {
        this.color = color;
        this.grosor = grosor;
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    // Descriptor de lectura
    public String getColor() {
        return this.color;
    }
    
    // Descriptor de escritura
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getGrosor() {
        return this.grosor;
    }
    
    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getTamanio() {
        return this.tamanio;
    }
    
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public void escribir() {
        System.out.println("Escribiendo...");
    }
    
    public void mostrarDatos() {
        System.out.println("color: " + this.color + " grosor: " + this.grosor + " marca: " +
                           this.marca + " tamanio " + this.tamanio);
    }
    
    // Sobrescribir el metodo por defecto toString()
    public String toString() {
        return "color: " + this.color + " grosor: " + this.grosor + " marca: " +
                           this.marca + " tamanio " + this.tamanio;
    }
}
