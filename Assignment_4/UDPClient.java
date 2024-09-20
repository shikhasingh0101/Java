import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        try {
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            DatagramSocket clientSocket = new DatagramSocket();

            InetAddress serverAddress = InetAddress.getByName("localhost");
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            System.out.print("Enter a number to send to the server: ");
            String numberString = userInput.readLine();
            sendData = numberString.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9876);
            clientSocket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String cubeResult = new String(receivePacket.getData(), 0, receivePacket.getLength());

            System.out.println("Received cube from server: " + cubeResult);

            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
