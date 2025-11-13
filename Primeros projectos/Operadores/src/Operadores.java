
//Los operadores son operaciones que obtienen un valor determinado
//Aritmeticos: Permiten realizar una operacion matematica
//Unarios: solo necesitan de un operador para funcionar
//Binarios: necesitan de dos o mas operadores para funcionar
public class Operadores {
    public void operadoresAritmeticos() {

        //Concatenar es como juntar dos o mas cadenas de textio
        String nombre = "Ana";
        String saludo = "Hola, " + nombre + "!";
        System.out.println(saludo);


        //Unarios
        int operandoUno = 5;
        //incremento para poder hacer un contador
        operandoUno = operandoUno + 1;
        operandoUno++;
        operandoUno++;
        operandoUno++;
        //se debe poner operandoUno++, le suma 1 al valor que ya tenia
        System.out.println("El valor del operando uno despues de los incrementos es: " + operandoUno);
        //decremento le resta uno al valor que ya tenia
        operandoUno--;
        operandoUno--;
        operandoUno--;
        operandoUno--;
        //si me pongo al principio de una fila y hago Ctrl+C, copio toda la linea
        System.out.println("El valor del operando uno despues de los decrementos  es: " + operandoUno);
        // binarios -> dos operadores: suma (+) resta (-) multi (*) div (/)  modulo->resto division (%)
        operandoUno = 5;
        int operandoDos = 8;
        int suma = operandoUno + operandoDos;
        System.out.println("La suma es: " + suma);
        System.out.println("La suma es: " + (operandoUno + operandoDos));//si lo pongo asi van a salir los dos
        // numeros seguidos en vez de sumarse, por eso hay que ponerlo entre parentesis
        System.out.println("La resta es: " + (operandoUno - operandoDos));
        System.out.println("La division es: " + (operandoUno / operandoDos));
        double division = (double) operandoUno / operandoDos; //se puede pasar a double momentaneamente una vgariable
        // poniendo (double) antes de la variable,lo cual seria necesario para haccer la division real,
        // esto recibe el nombre de cast
        System.out.println("La division es: " + division);

//7 -> 7.0 cast
        //7.5 -> 7 cast

        //modulo es el resto de la division
        int modulo = operandoUno % operandoDos;
        System.out.println("La modulo es: " + modulo);
//me vale para saber si un numero es par o no, para que sea par el modulo tiene que ser 0
    }
public void operadoresAsignacion(){
int operadorUno = 10;
int operadorDos = 20;
//operadorUno = operadorUno+ 5
    operadorUno += 5;//guarda la suma de lo que valia operadorUno+5
    operadorUno += 15;
    operadorUno += operadorDos;
    operadorUno /= operadorDos;
    operadorUno *= operadorDos;
    System.out.println("El resultado es: " + operadorUno);
    }
    public void operadoresComparacion() {
        //Obtienen el resultado de la comparacion de dos valores.El resultado de la comparacion simepre es true o false
        //Op1>Op2. El resultado es true si el op1 es mayor que el op2
        //Op1>=Op2. EL resultado es true si el op1 es mayor o igual que el op2
        //Op1==Op2 El resultado es true si el op1 es identico a op2
        //Op1!=Op2. El resukltado es true si el op1 es diferente al op2
        int operadorUno = 10;
        int operadorDos = 20;

        boolean resultado = operadorUno > operadorDos;
        System.out.println("El resultado es: " + resultado);
        resultado = operadorUno <= operadorDos;
        System.out.println("El resultado es: " + resultado);
        resultado = operadorUno != operadorDos;
System.out.println("El resultado es: " + resultado);
    }
    /*Comparadores logicos:
    Logicos:AND-OR-NOT
    AND -> El resultado de una comparacion es true si todas las comparacioens son true
    C1 true C2 true -> resultado true
    OR -> El resultado de una comparacion es true si una de las comparaciones es true

     */
    public void operadoresLogicos() {
        int sueldo = 20000;
        int edad = 45;
        boolean conducir = true;

        // cuando quiere cobrar menos de 30000 y tienes menos de 40 y puedes conducir
        boolean candidatoValido = sueldo < 30000 && edad < 40 && conducir; //AND
        System.out.println("El candidato valido es: " + candidatoValido);
        candidatoValido = sueldo < 30000 || edad < 25 || conducir;
        //                   F              T          T -> true

        System.out.println("El candidato valido es: " + candidatoValido);
        candidatoValido = sueldo < 20000 || edad < 25 || conducir && sueldo > 25000 && edad > 60;// se hacen primero
        //los && siempre, tienen prioridad y luego se van haciendo los or

        System.out.println("El candidato valido es: " + candidatoValido);
        candidatoValido = sueldo < 20000 || edad < 25 ||( conducir && sueldo > 25000 && edad > 60);
        System.out.println("El candidato valido es: " + candidatoValido);
        //Si lo ponemos entre parentesis el resultado puede cambiar
    }

public void evaluarCandidato(int sueldo, int edad, boolean conducir) {
        boolean resultado = sueldo<=20000 && edad<40 && conducir;
        System.out.println("El candidato valido es: " +resultado);
}
}
