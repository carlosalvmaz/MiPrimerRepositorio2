import java.util.Scanner;

public class Ejercicios {
    public void Contrasena(){
/*Crea un programa que pida al usuario crear una contraseña.
La contraseña dfebe cumplir estos requisitos: tener al menos 8 caracteres de lonmgitud,
contener al menos un numero, y NO puerde ser "12345678" ni "passswoerd"
El programa debe verificar cada condiciopn pior separado usando operadores logicos y mostrar si la contraselña es valida o  ni
indicando que requisitos cunmple
Nota: para este ejercicio, asume que tienes funciones auxiliares
como logitudCadena(texto) contieneNyuumero(texto)
 */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Indica la contraselña que quieres evaluar ");
        String contrasena = scanner.nextLine();
        boolean requisitoLong = contrasena.length()<=8;
        boolean contieneNum = contrasena.contains("1")||contrasena.contains("2")||contrasena.contains("3")||contrasena.contains("4")
                ||contrasena.contains("5")||contrasena.contains("6")||contrasena.contains("7")||contrasena.contains("8")||contrasena.contains("9");
        boolean passInvalida = contrasena.equals("password")||contrasena.equals("12345678");
        System.out.println("requisito long "+requisitoLong);
        System.out.println("Requisito niomero"+contieneNum);
        System.out.println("Requisito pass invalida"+passInvalida);
        boolean passOK = requisitoLong && contieneNum && !passInvalida;
        System.out.println("La evaucaion general es"+passOK);

    }
    public void EjercicioT310(){
        /*Crea un programa que pida la altura al usuario en cm
        y determine si puede subir a la atraccion.
        La altura minima es 120 y max 200
        si esta dentro del rango muestra "Puedes subir"
        si no, indica el motivo
         */
        System.out.println("Indica tu altura");
         Scanner scanner =new Scanner(System.in);
         int altura = scanner.nextInt();
         if(altura>=120 && altura<=200){
             System.out.println("Puedes subir");

         }else if(altura>200){
             System.out.println("eres muy alto");
         }else if(altura<120){
             System.out.println("eres demasiado bajito :C");
         }
    }
    public void palabraPalindromo(){//paladra equals palindromo cuando se lee igual de principio a fin
        //String frase = "hola que tal estas";
        /*System.out.println(frase.charAt(0));
        System.out.println(frase.charAt(0));
        System.out.println(frase.charAt(0));
        System.out.println(frase.charAt(0));
        System.out.println(frase.charAt(0));*/
        /*for(int i=0;i<frase.length();i++){
            System.out.println(frase.charAt(i));
        }*/
        //hay que comprobar que todas las letras son iguales
        String frase = "alli ves sevilla";
        frase = frase.replaceAll(" ","");
        boolean esPalindromo = true;
        for(int i=0;i<frase.length()/2;i++){
            //comparar cada letra 0-> ultimo
            //comparar cada letra 1-> penueltima
            //i= 0
            //letraUno = a

            char letraUno = frase.charAt(i);
            char letraDos = frase.charAt(frase.length()-1-i);
            if(letraUno!=letraDos){
                esPalindromo = false;
                break;
            }
        }
        if(esPalindromo){
            System.out.println("Palabra esta palindromo");
            System.out.println(frase);
        }else {
            System.out.println("Palabra no esta palindromo");
        }
    }
public void calcularFactorial(){
        int num;
        System.out.println("Ingresa un numero");

        Scanner scanner =new Scanner(System.in);
num = scanner.nextInt();
int factorial = 1;
    for(int i=1;i<=num;i++){
        factorial *= i;
    }
    System.out.println(factorial);
}
public void recorreColeccion(){
    //coleccion de datos es un conjunto de valores guardados en una variable
    //Esto recibe uel nmombre de array donde puedo guardar varias cosas
        int[] numeros = {1,10,90,40};
        System.out.println(numeros);
        //UN ARMARIO DE n posiciones 1,10,90,40
    for(int i = 0; i < numeros.length; i++){
        System.out.println(numeros[i]);
    }
//Hay otra manera de escribir un for que es un for each
    // el i es la posicion y el item es el valor que hay en la posicion
    //el item recorre todas las posiciioones
    for (int item: numeros){
        System.out.println(item);
    }
}
public void 

}
