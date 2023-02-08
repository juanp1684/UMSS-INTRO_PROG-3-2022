public class Materia {
    private String sigla;
    private String nombre;
    private String aula;
    
    public Materia(String sigla, String nombre, String aula) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.aula = aula;
    }
    
    @Override
    public String toString() {
        return this.sigla + " " + this.nombre + " " + this.aula;
    }
}
