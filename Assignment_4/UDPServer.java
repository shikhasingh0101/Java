import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];
            byte[] sendData;

            System.out.println("Server is running and waiting for client's message...");

            while (true) {
                
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String numberString = new String(receivePacket.getData(), 0, receivePacket.getLength());
                
                int number = Integer.parseInt(numberString);
                int cube = number * number * number;
                
                System.out.println("Received number: " + number + ". Calculating cube...");

                
                String resultString = Integer.toString(cube);
                sendData = resultString.getBytes();

                
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

               
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);

                System.out.println("Sent cube (" + cube + ") back to the client.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
