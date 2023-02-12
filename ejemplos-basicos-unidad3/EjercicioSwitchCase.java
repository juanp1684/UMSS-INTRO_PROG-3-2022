
public class EjercicioSwitchCase {
    public static void main(String[] args) {
        String literal = "jueves";
        
        switch (literal) {
            default:
                System.out.println("Otro dia");
                break;
            case "lunes":
                System.out.println(1);
                break;
            case "martes":
                System.out.println(2);
                break;
            case "miercoles":
                System.out.println(3);
                break;
        }
    }
}
