import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array
        // mediante "huecos"
        // mediante elementos
        //[x,x,x,x,x]
        System.out.println("Cuantos numeros quieres guardar");
        int tamanoNumeros = sc.nextInt();
        int[]listaNumeros = new int[tamanoNumeros];
        // [false,false,false]
        boolean[] listaAciertos = new boolean[3];
        //[0.0,0.0,0.0,0.0,0.0,0.0]
        double[]listaNotas = new double[6];
        //[nuell,null,null,null]
        String []listaNombres = new String[4];
int[]listaTamaño = new int[]{4,5,6,7,8,};

        //saber cual es el tamaño del array-> cuantos elementos hay en el array
        System.out.println("El tamaño de array es de "+listaTamaño.length);
        //modificar uno de los eleementos del array
        listaTamaño[listaNumeros.length-1] = 34;
        listaTamaño[0] = 1;
        System.out.println(listaTamaño[0]);

        //rellenar los elementos con aleatorios
for(int i=0;i<listaNumeros.length;i++){
    listaNumeros[i] = (int)(Math.random()*50 );}
//imprimiewndo los nuemros del array
        int sumatorio=0;
        for(int i =0;i<listaNumeros.length;i++){
            System.out.println(listaNumeros[i]);
            sumatorio += listaNumeros[i];//esto va sumando todoo el rato los nunmeros
        }
//for each -> recorrer una coleccion de datos
        for(int item:listaNumeros){
            System.out.println("ejecutando valor: "+item);

        }
    }
}
