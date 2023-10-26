import java.util.Scanner;

public class App {
  public static int obtenerEntrada(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese un Valor: ");
      int valor = scanner.nextInt();
      return valor;
  }
  public static void generarValores(){
      int n = obtenerEntrada();
      for (int i = 1; i <= n; i++) {
          System.out.println(i);
      }

  }
  public static void generarValoresPares() {
        int n = obtenerEntrada();
        int conteo = 0;
        while (conteo < n) {
            if (conteo % 2 == 0){
                System.out.println(conteo);
            }

            conteo++;
        }
        }
        public static void generarRandom(){
      int n = (int) (Math.random() * 3500);
            int conteo = 0;
            while (conteo < n) {
                System.out.println(conteo);
                conteo = conteo + 5;
            }
        }

    public static void main(String[] args) {
        generarRandom();
    }
    }