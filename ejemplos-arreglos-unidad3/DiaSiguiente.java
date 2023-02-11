
public class DiaSiguiente {
    public static void main(String[] args) {
      int dia = 29;
      int mes = 2;
      int anio = 2004;
      int sigDia, sigMes, sigAnio;
      
      int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
      int maxDia = dias[mes - 1];
      if (mes == 2 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
          maxDia = 29;
      }
      
      if (dia == maxDia) {
          sigDia = 1;
          if (mes == 12) {
              sigMes = 1;
              sigAnio = anio + 1;
          } else {
              sigMes = mes + 1;
              sigAnio = anio;
          }
      } else {
          sigDia = dia + 1;
          sigMes = mes;
          sigAnio = anio;
      }
      
      System.out.println(sigDia + "/" + sigMes + "/" + sigAnio);
    }
}
