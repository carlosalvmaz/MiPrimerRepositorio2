import java.util.Scanner;

public class SentenciaSwitch {
    public void usoSwitchInt(){
        int valor = 7;//obtenido por el usuario o por oparametros
        switch(valor){
            case 1:
                //se ejecuta cuando la variable toma valor 1;
                String nombre = "Juan";
                System.out.println("Toma valor de 1");
                break;
            case 5:
                //se ejecuta cuando lavariable toma valor 5;
                System.out.println("Toma valor de 5");
                break;
            case 7:
                //se ejecuta cuando lavariable toma valor 7;
                System.out.println("Toma valor de 7");
                break;
            default:
                System.out.println("No se puede usar valor incorrecto");
        }
System.out.println("Terminando el bloque switch");
    }
    public void usoSwitchString(){
        String nombre = "Borja";
        //las minuscyulas o mayusculas influyen
        switch(nombre.toLowerCase()){
            case "borja":
                System.out.println("");
                break;
            case"maria":
                System.out.println("El nombre es maria");
                break;
            case"Juan":
                    System.out.println("El nombre es juan ");
                    break;
            default: System.out.println("noombre no contemplado");

        }
    }
    public void usoswitchChar(){
        char letra = 'a';
        switch(letra){
            case 'A':
                break;
            case 'B':
                break;
            case 'a':
                break;
            case 'c':
                break;
            case 'd':
                break;
        }
    }//1 byte = 8 bits 00000000
    public void usoswitchLambda(){//el mas sencillo
        int nota = 0;
        switch(nota){
            //con esta forma los bloques son independientes por lo que por ejemplo podriamos
            //nombrar una misma variable en bloqwes distintos
            case 1->{
                System.out.println("Seleccionando el caso 1");
            }
            case 2->{
                System.out.println("Seleccionando el caso 2");
            }
            case 3->{
                System.out.println("Seleccionando el caso 3");
            }
            default -> System.out.println("No se selecciono el caso ");
        }

    }
    public void menuOpciones(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Operaciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Modulo");
        int opcion = sc.nextInt();
        System.out.println("Dime el primer operando");
        int op1 = sc.nextInt();
        System.out.println("Dime el segundo operando");
        int op2 = sc.nextInt();
        int resultado = 0;
        switch(opcion){
            case 1->{
                System.out.println("Vas a sumar");
                resultado = op1+op2;
            }
            case 2->{
                System.out.println("Vas a restar");
                resultado = op1-op2;
            }
            case 3->{
                System.out.println("Vas a multiplicar");
                resultado = op1*op2;
            }
            case 4->{
                System.out.println("Vas a dividir");
                resultado = op1-op2;
            }
            case 5->{
                System.out.println("Vas a hacer el modulo");
                resultado = op1%op2;
            }
            default-> {
             System.out.println("Valor incorrecto");
            }

        }
}}
