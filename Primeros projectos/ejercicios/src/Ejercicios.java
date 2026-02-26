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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica que cointraseña quieres evaluar");
        String contrasenia = scanner.next();

        boolean requisitoLong = contrasenia.length() <= 8;
        boolean contNumero = contrasenia.contains("1")||contrasenia.contains("2")||contrasenia.contains("3")||contrasenia.contains("4")||contrasenia.contains("5")||
        contrasenia.contains("6")||contrasenia.contains("7")||contrasenia.contains("8")||contrasenia.contains("9");
        boolean passInvalida = contrasenia.equals("password")||contrasenia.equals("12345678");
      System.out.println("Requisitito long: "+requisitoLong);
        System.out.println(");
        System.out.println("Requisitito long: "+requisitoLong);
        System.out.println("Requisitito long: "+requisitoLong);

    }
}
