public class OperacionesAritmeticas {
    // EJERCICIO: Completar los metodos restar, multiplicar y dividir
    public int sumar(int a, int b) {
        int c = a + b;
        return c;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public double dividir(double a, double b) {
        double resultado = -1;
        if (b == 0) {
            System.out.println("b no puede ser cero");
        } else {
            resultado = a / b;
        }
        return resultado;
    }
    // EJERCICIO: Crear el metodo factorial para calcular el factorial por sumas    
    public int multiplicarSumas(int a, int b) {
        int cont = 1, mul = 0;
        
        while (cont <= b) {
            mul += a;  // Es lo mismo que mul = mul + a;
            cont++;
        }
        
        return mul;
    }

    public int factorial(int n) {
        int mul = 1;
        int cont = 2;
        
        while (cont <= n) {
            mul = multiplicarSumas(mul, cont);
            cont++;
        }
        
        return mul;
    }
    
    public static void main(String[] args) {
        OperacionesAritmeticas objeto = new OperacionesAritmeticas();
        int resultadoSuma = objeto.sumar(3, 5);
        System.out.println("El resultado de la suma es " + resultadoSuma);
        // Ejercicio: Llamar a los metodos restar, multiplicar y dividir
        int resultadoResta = objeto.restar(10, 5);
        System.out.println("El resultado de la resta es " + resultadoResta);
        int resultadoMultiplicacion = objeto.multiplicarSumas(10, 5);
        System.out.println("El resultado de la multiplicacion es " + resultadoMultiplicacion);
        double resultadoDivision = objeto.dividir(10, 5);
        System.out.println("El resultado de la division es " + resultadoDivision);
        int fact = objeto.factorial(5);
        System.out.println("El factorial es " + fact);
    }
    
}
