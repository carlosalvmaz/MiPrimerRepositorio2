
//ESto es un comentario de una sola linea
//SHift alt y flecha para bajar una linea
/*
Comentario mas largo
 */

import java.util.Locale;

/**
 *
 */

public class Main {

    public static void  main(String[] args) {

        String nombreCompleto = "Borja"; /* Los string son palabras y
         van entrecomillaods dobles*/
        //A una clase compleja se le pueden dar funcionalidades como pasarla a mayusculas
        nombreCompleto = nombreCompleto.toUpperCase();
        //O a minusculas y sacarlo por pantalla
        System.out.println(nombreCompleto.toLowerCase());


        int edad = 19; //numero entero
        int edadmental = edad+1;
        //Si creo una variable compleja puedo hacer mas cosas con ella, con una primitiva solo se almacena el dato
        Integer edadCompleja = 23;
        edadCompleja.byteValue();
        //final es para variables constantes que no cambian
        final String numeroDNI = "123456789";
         float altura = 1.71f; //numeros con decimales
        double peso = 1.7111123;
        char letraCarnet = 'E';
        boolean experiencia = true;
        Object cosa = true;
        cosa = 2;
        cosa = "dato";

System.out.println("El valor minimo de un numero entero es "+Integer.MIN_VALUE);
System.out.println("El valor maximo de un numero entero es "+Integer.MAX_VALUE);
 System.out.println("Esta es mi segunda linea");
 System.out.println("Tengo experiencia "+experiencia);
 System.out.println("mi edad mental son "+edadmental);
System.out.println("mi peso es  "+peso+"kg");
 System.out.println("Mi edad son "+edad);
 System.out.println("Hola, este es mi primer programa en Java");
 System.out.print("Mi nombre es "+nombreCompleto);

}

public void metodoCarton()

    {
        //TODO pendiente crear el carton con numeros aleatorios sin repetir
    }
}