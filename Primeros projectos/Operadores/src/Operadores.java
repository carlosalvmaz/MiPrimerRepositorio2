
//Los operadores son operaciones que obtienen un valor determinado
//Aritmeticos: Permiten realizar una operacion matematica
//Unarios: solo necesitan de un operador para funcionar
//Binarios: necesitan de dos o mas operadores para funcionar
public class Operadores {
    public void operadoresAritmeticos(){
        //Unarios
    int operandoUno =5;
    //incremento para poder hacer un contador
    operandoUno = operandoUno+1;
        operandoUno++;
        operandoUno++;
        operandoUno++;
    //se debe poner operandoUno++, le suma 1 al valor que ya tenia
    System.out.println("El valor del operando uno despues de los incrementos es: "+ operandoUno);
    //decremento le resta uno al valor que ya tenia
        operandoUno--;
        operandoUno--;
        operandoUno--;
        operandoUno--;
        //si me pongo al principio de una fila y hago Ctrl+C, copio toda la linea
        System.out.println("El valor del operando uno despues de los decrementos  es: "+ operandoUno);
        // binarios -> dos operadores: suma (+) resta (-) multi (*) div (/)  modulo->resto division (%)
        operandoUno = 5;
        int operandoDos = 8;
        int suma = operandoUno + operandoDos;
        System.out.println("La suma es: "+suma);
        System.out.println("La suma es: "+operandoUno+operandoDos);//si lo pongo asi van a salir los dos
        // numeros seguidos en vez de sumarse, por eso hay que ponerlo entre parentesis

        //Concatenar es como juntar dos o mas cadenas de texto
        System.out.println("La suma es: "+(operandoUno+operandoDos));
        String nombre = "Ana";
        String saludo = "Hola, " + nombre + "!";
        System.out.println(saludo);






    }
}
