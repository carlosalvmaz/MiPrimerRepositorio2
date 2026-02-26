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
         Scanner sc = new Scanner(System.in);
         System.out.println("Indica la contraselña que quieres evaluar ");
         String contrasena = sc.nextLine();
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
        public int longCadena(String cadena){
            return cadena.length();
        }
    }

