import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el nombre de la persona");
                String nombre = scanner.nextLine();
        System.out.println("Dime el apellido de la persona");
        String apellido = scanner.nextLine();
        System.out.println("Dime el correo de la persona");
        String correo = scanner.nextLine();
        System.out.println("Dime el numero de la persona");
        int numero = scanner.nextLine();
Object[] persona1 = new Object[]{nombre,apellido,correo,numero};
for{Object item : persona1}
//nomobre, apellido, correo, telefono
        /*persona[0] = "Borja";
        persona[1] = "Martin";
        persona[2] = "borja.martin@gmail.com";
        persona[3] = "1234";*/
    }
}
