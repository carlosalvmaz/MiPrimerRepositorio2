import java.util.Scanner;

public class While {
    public void evaluacionNumero(){
        Scanner scanner=new Scanner(System.in);
        //Math.random() crea un numero aleatorio
        int aleatorio = (int)(Math.random() *11);// casteo hecho
        int intentos = 1;
         System.out.println("Introduce un numero a ver si es el correcto");
         int numero = scanner.nextInt();
         intentos++;

         while(aleatorio!=numero){
System.out.println("Intento fallido, volver a intentar");
numero = scanner.nextInt();
intentos++;
         }

         System.out.printf("Numero acertado en %d intentos",intentos);
    }

    public void imprimirMenu(){
        Scanner scanner =  new Scanner(System.in);
        int opcion;
        do{

            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Division");
            System.out.println("5-Salir");
            System.out.println("Selecciona una opcion");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1->{
                    System.out.println("opcion seleccionadA suma");
                }case 2->{
                    System.out.println("opcion selecuionada resta");
                }case 3->{
                    System.out.println("opcion seleccionada multiplicasci9on");
                }case 4->{
                    System.out.println("opcion selecionada division ");
                }
                case 5->{
                    System.out.println("opcion seleccionada Salir");
                }
            }



        }while(opcion  !=5);
    }
}
