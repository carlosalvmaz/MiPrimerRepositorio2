  public class Main {
      public static void main(String[] args) {

          ejercicio3();

      }

      public static void ejercicio1() {
          String nombre = "Ana";
          int edad = 12;
          String ciudad = "Madrid";

          System.out.println(nombre);
          System.out.println(edad);
          System.out.println(ciudad);

      }

      public static void ejercicio2() {
          int puntuacion = 0;
          System.out.println("Puntuacion inicial: " + puntuacion);
          puntuacion = puntuacion + 1;
          System.out.println("Despues de la primera modificacion: " + puntuacion);
          puntuacion = puntuacion + 2;
          System.out.println("Despues de la segunda modificacion: " + puntuacion);
          puntuacion = puntuacion + 3;
          System.out.println("Puntuacion final: " + puntuacion);
//Se puede ir modificando y despues volviendo a mostrar por pantalla porque
// el codigo se ejecuta de arriba a abajo pudiendo mostgrar el valor de una
// variable y despues modificarlo para volver a mostrarlo por pantalla
      }

      public static void ejercicio3() {
          String orientacionSexual = "Prefiero no decirlo";
          int tamañoVerga = 28;
          double pesoGorda = 130.4234234;
          boolean gay = true;
          char letra = 'a';

          System.out.println("Cual es tu orientacion sexual? "+orientacionSexual + " Tipo - String");
          System.out.println("Cuanto te mide el pilin? "+tamañoVerga + " Tipo - int");
          System.out.println("Cuanto pesa esa gorda?"+pesoGorda + " Tipo - double");
          System.out.println("Eres Gay?"+gay + " Tipo - boolean");
          System.out.println("LEtra"+letra + " Tipo - char");
      }
      public static void ejercicio4() {
final String nombreAplicacion = "Miapp";
        final float numeroPI = "3,14";
        System.out.println("Aplicacion: "nombreAplicacion);
          System.out.println(": "nombreAplicacion);
      }
  }

