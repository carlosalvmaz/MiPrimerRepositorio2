import java.util.Scanner;

public class Bonoloto {
    private int[]numerosSistema = new int[5];// [0.0.0.0.0]
   private int[]numerosUsuario = new int[5];// [0.0.0.0.0]
int aciertos = 0;
    private Scanner scanner = new Scanner(System.in);
    public void iniciarJuego(){
        //al iniciar el juegvpo pasan dos cosas
        //1-saler de la maquina 5 numeros que seran los numeros del sistema del 0 al 20
        for(int i=0;i<5;i++){
            numerosSistema[i]=(int)(Math.random()*21);//generamos numeros aleatorios del 1 al 20
        }
        //2.- Se le piden 5 numeros al usuario
        System.out.println("Procedemos a sellar tu boleto");
        for(int i=0;i<5;i++){
            System.out.println("introduce un numero: ");
            numerosUsuario[i]=scanner.nextInt();
        }
    System.out.println("Procedemos a ver las condiciones del sistema ");
        for (int item: numerosUsuario){
            buscarNumero(item);
        }
    }
    public void buscarNumero(int numero) {
         //buscar un numero deltro del array numeros sistema
        //numerosSistema -> variable clase
        //numero-> parametro
        //3
        //4,5,12,20,3

        for(int item:numerosSistema){
            if(item==numero){
                aciertos++;
                break;
            }
        }


    }
public void listarNumerosSistema(){
    for(int item:numerosSistema){
        System.out.println(item);
    }

}
    public void listarNumerosUsuario(){
for(int item:numerosUsuario){
    System.out.println(item);

}
        System.out.println("Has acertado: "+aciertos+"numeros");
    }
}
