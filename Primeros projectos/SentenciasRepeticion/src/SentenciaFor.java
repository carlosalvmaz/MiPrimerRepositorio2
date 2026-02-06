import java.util.Scanner;

public class SentenciaFor {
    //indicando un rango de elementos, repite
    //todoo el cuerpo del bloque
    //para(rango; incremento 1){repite estas lineas
    // }
    public void sentenciaFor() {
        //inicial;final;incrementa
        //
        for (int i = 0; i <= 5; i += 2) {
            System.out.println("Iniciando codigo");

        }
        for (int i = 0; i <= 5; i += 2) {
            System.out.println("2");

        }
        for (int i = 100; i >= 0; i--) {
            System.out.println("Ejecuciones" + i);

        }

    }

    public void tablaMultiplicarNumero(int numero) {
        ;
        System.out.println("Introduce el numero del que deseas saber la tabla de multiplicar");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d *%d = %d%n", i, numero, i * numero);
        }
    }
    public  void tablasTodas(int numero){


        for(int i=0; i < 11; i++){
System.out.printf("%d * %d = %d%n", i, numero, i * numero);

        }

    }
    public void tablasTodas2(){
        for(int i=1; i < 11; i++){
            System.out.println("Vamos a sacar la tabla del "+i);
            for(int j=0; j<11; j++){
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }

        }
    }
    public void cuadradoAsteriscos(){
        System.out.println("Indica el numero de asteriscos que quieres que formen el lado del cuadrado");
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        System.out.println("Iniciando el cuadrado");
        for(int i=0; i < numero; i++){

            System.out.print("*");

        }
        for(int c=0; c < (numero-2); c++) {
            System.out.println();
            System.out.print("*");
            for (int j = 0; j < (numero - 2); j++) {
                System.out.print(" ");
            }
            System.out.print("*");

        }
        System.out.println("");
        for(int i=0; i < numero; i++){

            System.out.print("*");

        }
        System.out.println();
    }
    public void cuadradoOtraForma(){
        System.out.println("Iniciando el cuadrado");
        for(int i=0; i < 5; i++){
            for(int j=0; j<5; j++){
                if(i==0||i==4){
                    System.out.print("*");
                } else if ( j==0 || j==4) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
