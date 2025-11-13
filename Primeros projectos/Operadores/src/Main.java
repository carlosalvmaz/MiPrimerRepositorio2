public class Main {
    public static void main(String args[]) {
        System.out.println("Iniciando programa de operadores");
        Operadores operadores = new Operadores();//Crea un objeto del tipo Operadores
// y lo guarda en la variable operadores
        //Operadores es la plantilla o molde, la clase.
        //operadores es la variable( el objeto que estoy creando)
        //New operadores Crea un nuevo objeto usando el constructor de la base
        //Una vez tienes el objeto, puedes usar sus metodos
        //operadores es el objeto creado, mientras que,
        // operadores.aritmeticos es el metodo dentro de la clase
        //significa: llama al metodo operadores.aritmeticos del objeto ooperadioresç
        operadores.evaluarCandidato();
    }
    //Ahora, para no ensuciar el metodo main voy a crear otra clase
    // que voy a llamar operadores, en esta clase creare los metodos

}
