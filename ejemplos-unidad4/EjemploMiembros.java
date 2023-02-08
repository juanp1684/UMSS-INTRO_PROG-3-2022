public class EjemploMiembros {
    int x;
    
    public int sumar(int a, int b) { // Metodo de instancia
        return a + b;
    }
    
    public int sumar(int a, int b, int c) { // Sobrecarga
        return a + b + c;
    }
    
    public int sumar(int a, int b, int c, int d) { // Sobrecarga
        return a + b + c + d;
    }
    
    public static int restar(int a, int b) {
        //this.x; // No se puede utilizar this en un metodo estatico
        return a - b;
    }
    
    // varargs
    
    public int sumarValores(int primerValor, int ... otrosValores) {
        int suma = primerValor;
        
        for (int argumento : otrosValores) {
            suma += argumento;
        }
         
        return suma;
    }
    
    // Ejercicio: Crear un metodo para visualizar nombres de estudiantes
    public void mostrarNombresDeEstudiantes(String estudiante1, String... otrosEstudiantes) {
        final String primerEstudiante = estudiante1; // Definicion de constante
        System.out.println("Primer estudiante: " + primerEstudiante);
        
        for (String estudiante : otrosEstudiantes) {
            System.out.println("Estudiante: " + estudiante);
        }
    }










}
