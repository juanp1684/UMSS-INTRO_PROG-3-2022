public class EjemplosBasicos
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" ");
        sb.append("mundo");
        System.out.println(sb.toString());
        
        // Alternativa menos civilizada:
        String hola = "Hola";
        hola += " "; // ya no es el mismo que el original
        hola += "mundo"; // ya no el lo mismo que el original
        System.out.println(hola);
        
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        
        // Crear un StringBuilder que concatena los dias de la semana
        // para iterar los dias, utilizar un for ( : )
        StringBuilder sbDias = new StringBuilder();    
        
        for (String dia : dias) {
            sbDias.append(dia);
            sbDias.append(" ");
        }
        
        System.out.println(sbDias.toString());
        
        String holaATodos = "Hola a todos";
        System.out.println(holaATodos.charAt(0));
        System.out.println(holaATodos.charAt(3));
        System.out.println(holaATodos.charAt(11));
        
        System.out.println("El numero de caracteres es " + holaATodos.length());
        
        // Ejercicio. Mostrar todos los caracteres de holaATodos en pantalla
        
        for (int i = 0; i < holaATodos.length(); i++) {
            System.out.println(holaATodos.charAt(i));
        }
        
        char[] arreglo = holaATodos.toCharArray(); // convertimos la cadena en un arreglo de caracteres
        System.out.println("Iteracion de caracteres");
        
        for (char caracter : arreglo) {
            int valor = caracter;
            System.out.println(valor);
        }
    }
    
    
    
    
    
    
    
    
}
