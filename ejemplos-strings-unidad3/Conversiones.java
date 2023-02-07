public class Conversiones {
    public static void main(String[] args) {
        String valor = "123";
        int numero = Integer.parseInt(valor); // Para realizar la conversion de cadena a int
        System.out.println("el numero es " + numero);
        
        double numeroConDecimales = Double.parseDouble("100.3");
        System.out.println("el numero double es " + numeroConDecimales);
        
        float floatNumber = Float.parseFloat("50.5");
        System.out.println("el numero float es " + floatNumber);
        
        String cadena = "1223.6";
        // Realizar la conversion de la variable cadena a float y a double
        int conversion = (int)numeroConDecimales; // Casting o conversion explicita
        System.out.println("el valor de conversion es " + conversion);
        
        short conversion2 = (short)conversion;
        
        // Conversion implicita
        int variable1;
        short variable2 = 15;
        variable1 = variable2;
        System.out.println("El valor de variable1 es " + variable1);
    }
    
    
    
    
    
    
    
    
}
