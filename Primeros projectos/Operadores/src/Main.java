import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Iniciando programa de operadores");
        Operadores operacionesVariables = new Operadores();//Crea un objeto del tipo Operadores
// y lo guarda en la variable operadores
        //Operadores es la plantilla o molde, la clase.
        //operadores es la variable( el objeto que estoy creando)
        //New operadores Crea un nuevo objeto usando el constructor de la base
        //Una vez tienes el objeto, puedes usar sus metodos
        //operadores es el objeto creado, mientras que,
        // operadores.aritmeticos es el metodo dentro de la clase
        //significa: llama al metodo operadores.aritmeticos del objeto ooperadioresç
        //Scanner lectorTeclado = new Scanner(System.in);//new crea variables complejas, que siempre van en mayusculas
        //System.out.println("Que salario quieres ganar");
        //String nombre = lectorTeclado.next();//Para poder usart espacios se usa nextline
        //String nombres = lectorTeclado.nextLine();//Para poder usart espacios se usa nextline

        //double salarioEntrada = lectorTeclado.nextDouble();
        //System.out.println("Que edad tienes ");
        //int edad = lectorTeclado.nextInt();

        //System.out.println("Tienes carnet de conducir");
        //boolean conducir = lectorTeclado.nextBoolean();
/*Para ejecutar un metodo que no este en la clase del main, hay que crear un objeto
 Operadores operacionesVariables = new Operadores a aprtir de ahi desde el main
 poniendo el nombre del metodo y un punto accedo a los datos de ese metodo
 */
        operacionesVariables.cambioTipos();

        //Ahora, para no ensuciar el metodo main voy a crear otra clase
        // que voy a llamar operadores, en esta clase creare los metodos
    }
}
