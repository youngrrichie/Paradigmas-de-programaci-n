import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        String hostName = "localhost"; // Dirección del servidor, localhost significa que está en la misma máquina
        int port = 5000; // El puerto debe coincidir con el que el servidor está escuchando

        try (Socket socket = new Socket(hostName, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            // Enviar mensaje al servidor
            out.println("Hola, servidor!");
            System.out.println("Mensaje enviado al servidor.");

            // Leer la respuesta del servidor
            String respuesta = in.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);

        } catch (UnknownHostException e) {
            System.out.println("No se pudo detectar el servidor en " + hostName);
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("No se pudo obtener I/O para la conexión con: " + hostName);
            System.out.println(e.getMessage());
        }
    }
}