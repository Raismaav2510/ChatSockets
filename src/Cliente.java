import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static final int PUERTO = 8080;
    public static String HOST = "localhost";

    public Cliente() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la dirección IP del servidor: ");
        HOST = scanner.nextLine();
        System.out.println("La address es: " + HOST);
        Socket socket = new Socket(HOST,PUERTO);

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter salida = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            salida.println("El usuario dice: " + "Hola servidor soy tu cliente");
            String mensaje = entrada.readLine();
            System.out.println(mensaje);
            salida.println("FIN");
        } finally {
            System.out.println("Cerrando Cliente");
            socket.close();
        }
    }
}
