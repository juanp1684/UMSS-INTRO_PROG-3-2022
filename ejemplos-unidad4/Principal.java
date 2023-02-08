import ejemplos.Marcador;

public class Principal {
    public static void main(String[] args) {
        /*Marcador monami = new Marcador("azul", 2, "monami", 3);
        monami.setMarca("Faber Castell");
        monami.mostrarDatos();
        System.out.println(monami); // Llamar al metodo toString()
        */
       
       Persona persona = new Persona("1234", "Juan", "Perez", 30);
       persona.mostrarDatos();
       
       Estudiante marco = new Estudiante("1357", "Marco", "Gomez", 19, 5, 20109232);
       marco.caminar();
       marco.mostrarDatos();
    }
    
    
    
    
    
    
    
    
    
    
    
}
