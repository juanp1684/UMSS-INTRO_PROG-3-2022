import ejemplos.Marcador;

public class Principal {
    public static void main(String[] args) {
        Marcador monami = new Marcador("azul", 2, "monami", 3);
        monami.setMarca("Faber Castell");
        monami.mostrarDatos();
        System.out.println(monami); // Llamar al metodo toString()
    }
}
