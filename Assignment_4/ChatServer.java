import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server started. Waiting for clients...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

           
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverMessage;

            
            while (true) {
                clientMessage = in.readLine(); 
                if (clientMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + clientMessage);

                System.out.print("Server: ");
                serverMessage = serverInput.readLine(); 
                out.println(serverMessage); 
                if (serverMessage.equalsIgnoreCase("bye")) {
                    System.out.println("Server shutting down.");
                    break;
                }
            }

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

