import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class SentenciaSwitch {
    public void usoSwitchInt() {

        int valor = 5;
        //1,5,7, resto
        String nombre = "Carlos";
        switch (valor) {//dependiendo de lo que valga un valor det€rminado, voy a ejecutar una cosa u otra(case)
            //valor obtenido por el usuario o por parametros
            case 1:
                nombre = "Juan";
                System.out.println("toma valor de 1");
                //cuerpo cuando la variable tokma el valor 1
                break;
            case 5:
                //cuerpo cuando la variable tokma el valor 5
                nombre = "Carlos";

                System.out.println("toma valor de 5");

                break;
            case 7:
                System.out.println("toma valor de 7");
                //cuerpo cuando la variable tokma el valor 7
                nombre = "Pepe";


                break;

            default:
                System.out.println("valor no contemplado");

        }
        System.out.println("El nombre resultanter es " + nombre);
        System.out.println("terminado el bloque switch");
    }

    public void usoSwitchString() {
        String nombre = "Carlos";
        switch (nombre.toLowerCase()) {
            case "carlos":
                System.out.println("El nombre es Carlos");
                break;
            case "maria":
                System.out.println("El nombre es maria");

                break;
            case "Juan":
                System.out.println("El nombre es Juan");

                break;

            default:
                System.out.println("El nombre no contemplado");
        }
    }

    public void usoSwitchChar() {
        char letra = 'A';
        switch (letra) {
            case 'A':
                break;
            case 'B':
                break;
            case 'a':
                break;
            case 'C':
                break;
            case 'd':
                break;
            case 68://lo reconoce porque interpreeta 68 como el numerop 68 de los codigos de letras ASCI
                //0-255 -> 1bytes -> 8 bits -> 1111111101 -> leta
                break;
        }
    }

    public void usoSwitchLambda() {
        int nota = 7;
        switch (nota) {
            case 1 -> {
                    System.out.println("Seleccionado el caso 1");
            }
            case 2 -> {
                System.out.println("Seleccionado el caso 2");
            }
            case 3 -> {
                System.out.println("Seleccionado el caso 3");
            }
            case 4|5|6|7|8|9 -> {
                System.out.println("Seleccionado el caso 4");
            }
default-> {
            System.out.println("No contemplado");
        }

        }
    }

    public void menuOpciones() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("MEnu operaciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar" );
        System.out.println("3. Multiplicar");
        System.out.println("4 Dividir");
        System.out.println("5. Modulo");
        System.out.println("Que operacion quieres hacer?");
        int opcion = scanner.nextInt();
        System.out.println("Dime el primer operando");
        int op1 = scanner.nextInt();//declaro la variable y la leo por teclado
        System.out.println("Dime el segundo operando");
        int op2 = scanner.nextInt();
        double resultado = 0;//lo guardo como double para que se pueda hacer la division etc
        switch (opcion) {
            case 1->{
                //int op1 = scanner.nextInt();
                //int op1 = scanner.nextInt();

            System.out.println("Sumar");
            resultado = op1+op2;
            }

            case 2->{
                System.out.println("Restar");
                resultado = op1-op2;
            }

            case 3-> {
                System.out.println("Multiplicar");
                resultado = op1*op2;
            }

            case 4->{
                System.out.println("Dividir");
                resultado = op1/op2;
            }

            case 5->{
                System.out.println("Modulo");
                resultado = op1%op2;

            }

            default -> {}
    }
    System.out.println("El resultado de la operacion es " + resultado);
}
}