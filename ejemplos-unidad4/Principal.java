import ejemplos.Marcador;
import java.util.ArrayList;

public class Principal {
    public static void main(String... args) {
       for (String argumento : args) {
           System.out.println("Argumento: " + argumento);
       }
        
        /*Marcador monami = new Marcador("azul", 2, "monami", 3);
        monami.setMarca("Faber Castell");
        monami.mostrarDatos();
        System.out.println(monami); // Llamar al metodo toString()
        
       
       Persona persona = new Persona("1234", "Juan", "Perez", 30);
       persona.mostrarDatos();
       
       Estudiante marco = new Estudiante("1357", "Marco", "Gomez", 19, 5, 20109232);
       marco.caminar();
       marco.mostrarDatos();
       
       Profesor jorge = new Profesor("33344", "Jorge", "Lopez", 35, 4, 4000);
       jorge.enseniar();
       jorge.mostrarDatos();*/
       
       /*EjemploMiembros objeto = new EjemploMiembros();
       int resultadoSuma = objeto.sumar(3, 4, 5); // Obligatorio: crear una instancia
       System.out.println("Llamando al metodo sumar " + resultadoSuma);
       
       int resultadoResta = EjemploMiembros.restar(10, 7);
       System.out.println("Llamando al metodo restar " + resultadoResta);
       
       System.out.println("Probando metodo con varargs");
       int suma = objeto.sumarValores(10, 5, 7, 10);
       System.out.println("El resultado de llamar a sumarValores es " + suma);
       
       objeto.mostrarNombresDeEstudiantes("Roberto", "Juan", "Marco", "Elmer");*/
       
       
       ArrayList<Materia> materias = new ArrayList<Materia>();
       materias.add(new Materia("SIS-100", "PROGRAMACION 1", "600"));
       materias.add(new Materia("SIS-101", "PROGRAMACION 2", "700"));
       materias.add(new Materia("SIS-102", "PROGRAMACION 3", "800"));
       
       Facultad humanidades = new Facultad("Humanidades", 1970);
       
       Estudiante jorge = new Estudiante("123", "Jorge", "Lopez", 19, 5, 2001010, 
                                         materias, humanidades);
                                         
        System.out.println(humanidades);
       jorge.mostrarDatos();
    }
    
    
    
    
    
    
    
    
    
    
    
}
