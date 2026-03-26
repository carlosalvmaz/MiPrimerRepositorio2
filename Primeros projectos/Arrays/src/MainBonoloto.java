import java.util.Scanner;

public class MainBonoloto {
    public static void main(String[] args) {
        Bonoloto bonoloto = new Bonoloto();
        Scanner scanner =new Scanner(System.in);
        boolean jugar = false;
        do {
            bonoloto.iniciarJuego();
            System.out.println("Los numeros del sistema son: ");
            bonoloto.listarNumerosSistema();
            System.out.println("Los numeros del usuario son: ");
            bonoloto.listarNumerosUsuario();
            System.out.println();

            System.out.println("Quieres jnugar otra vez");
            jugar = scanner.nextBoolean();
        }while(jugar);
    }

}
