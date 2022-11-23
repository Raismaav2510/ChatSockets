import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        System.out.println("¿Qué deseas ejecutar? ");
        System.out.println("1.-Cliente ");
        System.out.println("2.-Servidor");
        opc = scanner.nextInt();

        switch (opc) {
            case 1:
                new Cliente();
                break;

            case 2:
                new Servidor();
                break;

            default:
                System.out.println("La opción que seleccionaste era incorrecta");
        }
    }
}