import java.net.MalformedURLException;
import java.net.URL;

public class URLExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com:80/docs/resource1.html?name=test#section1");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Ref (Anchor): " + url.getRef());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
