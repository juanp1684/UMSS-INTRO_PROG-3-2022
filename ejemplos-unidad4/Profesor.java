public class Profesor extends Persona {
    private int aniosServicio;
    private int salario;
    
    public Profesor(String ci, String nombre, String apellido,
                    int edad, int aniosServicio, int salario) {
    
        super(ci, nombre, apellido, edad);
        this.aniosServicio = aniosServicio;
        this.salario = salario;
    }
    
    public void enseniar() {
        System.out.println("Enseñando...");
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Los datos del profesor son:\n " +
            "CI: " + this.ci + "\n" +
            "Nombre: " + this.nombre + "\n" +
            "Apellido: " + this.apellido + "\n" +
            "Edad: " + this.edad + "\n" +
            "Años de servicio: " + this.aniosServicio + "\n" +
            "Salario: " + this.salario + "\n");
    }
    
    
    
    
}
