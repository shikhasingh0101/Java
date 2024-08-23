class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    // No-argument constructor
    public Employee() {
        this.name = "";
        this.address = "";
        this.salary = 0.0;
        this.jobTitle = "";
    }

    // Parameterized constructor
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return 0.0;
    }

    // Method to generate performance report
    public String generatePerformanceReport() {
        return "No performance report available.";
    }
}

class Manager extends Employee {
    private int numberOfSubordinates;

    // No-argument constructor
    public Manager() {
        super();
        this.numberOfSubordinates = 0;
    }

    // Parameterized constructor
    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // Getter for numberOfSubordinates
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    // Method to manage project
    public void manageProject() {
        System.out.println(getName() + " is managing a project.");
    }

    // Overridden method to calculate bonus
    @Override
    public double calculateBonus() {
        return 0.15 * getSalary();
    }

    // Overridden method to generate performance report
    @Override
    public String generatePerformanceReport() {
        return "Manager " + getName() + " has an Excellent rating.";
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    // No-argument constructor
    public Developer() {
        super();
        this.programmingLanguage = "";
    }

    // Parameterized constructor
    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Method to write code
    public void writeCode() {
        System.out.println(getName() + " is writing code in " + programmingLanguage + ".");
    }

    // Overridden method to calculate bonus
    @Override
    public double calculateBonus() {
        return 0.10 * getSalary();
    }

    // Overridden method to generate performance report
    @Override
    public String generatePerformanceReport() {
        return "Developer " + getName() + " has a Good rating.";
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Ankita", "123 Manager St", 80000, "Manager", 5);
        Developer developer = new Developer("shikha", "456 Developer Ave", 60000, "Developer", "Java");

        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Address: " + manager.getAddress());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Job Title: " + manager.getJobTitle());
        System.out.println("Number of Subordinates: " + manager.getNumberOfSubordinates());
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println("Performance Report: " + manager.generatePerformanceReport());
        manager.manageProject();

        System.out.println("\nDeveloper Details:");
        System.out.println("Name: " + developer.getName());
        System.out.println("Address: " + developer.getAddress());
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Job Title: " + developer.getJobTitle());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        System.out.println("Bonus: " + developer.calculateBonus());
        System.out.println("Performance Report: " + developer.generatePerformanceReport());
        developer.writeCode();
    }
}
