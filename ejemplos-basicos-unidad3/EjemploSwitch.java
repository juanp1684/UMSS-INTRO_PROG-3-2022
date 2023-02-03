import java.util.Scanner;

public class EjemploSwitch
{
    public static void main(String[] args) {
        int dia;
        Scanner s = new Scanner(System.in); // Definimos un nuevo objeto scanner
        System.out.println("Introduzca el dia de la semana:"); // Mostrar un mensaje en la pantalla
        dia = s.nextInt(); // Leer el valor del dia
        
        // Evaluar los casos
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor fuera de rango");
                break;
        }
    }
}
