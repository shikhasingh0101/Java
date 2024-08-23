public class Employee {
   
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    
    public int getId() {
        return id;
    }

    
    public String getFirstName() {
        return firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

 
    public String getName() {
        return firstName + " " + lastName;
    }

   
    public int getSalary() {
        return salary;
    }

    
    public void setSalary(int salary) {
        this.salary = salary;
    }

   
    public int getAnnualSalary() {
        return salary * 12;
    }

   
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int userId = scanner.nextInt();

        System.out.print("Enter first name: ");
        String userFirstName = scanner.next();

        System.out.print("Enter last name: ");
        String userLastName = scanner.next();

        System.out.print("Enter salary: ");
        int userSalary = scanner.nextInt();

        Employee employee = new Employee(userId, userFirstName, userLastName, userSalary);

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());

        
        System.out.print("\nEnter percentage to raise salary: ");
        int percent = scanner.nextInt();

       
        int newSalary = employee.raiseSalary(percent);
        System.out.println("New Salary after " + percent + "% raise: " + newSalary);

        
        System.out.println("String Representation: " + employee.toString());

        
        scanner.close();
    }
}
