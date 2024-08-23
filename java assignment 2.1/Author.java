import java.util.Scanner;

public class Author {
    
    private String name;
    private String email;
    private char gender;  
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

   
    public char getGender() {
        return gender;
    }

  
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter author's name: ");
        String name = scanner.nextLine();

    
        System.out.print("Enter author's email: ");
        String email = scanner.nextLine();

        
        System.out.print("Enter author's gender (m/f): ");
        char gender = scanner.next().charAt(0);

       
        Author author = new Author(name, email, gender);

       
        System.out.println("\nAuthor Details:");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());

        
        System.out.println("String Representation: " + author.toString());

        
        scanner.close();
    }
}
