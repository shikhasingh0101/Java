import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            System.out.println("Connected to the server!");

           
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            
            BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverMessage;

            
            while (true) {
                System.out.print("Client: ");
                clientMessage = clientInput.readLine(); 
                out.println(clientMessage); 
                if (clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Disconnected from the server.");
                    break;
                }

                serverMessage = in.readLine(); 
                System.out.println("Server: " + serverMessage);
                if (serverMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Server disconnected.");
                    break;
                }
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
