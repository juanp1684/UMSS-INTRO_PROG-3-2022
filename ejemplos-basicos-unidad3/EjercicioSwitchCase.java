
public class EjercicioSwitchCase {
    public static void main(String[] args) {
        String literal = "jueves";
        
        switch (literal) {
            default:
                System.out.println("Otro dia");
            case "lunes":
                System.out.println(1);
            case "martes":
                System.out.println(2);
            case "miercoles":
                System.out.println(3);
                break;
        }
    }
}
