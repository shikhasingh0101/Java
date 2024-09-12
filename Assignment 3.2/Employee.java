import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private static final long serialVersionUID = 1L; // Ensure version compatibility
    private String empId;
    private String dept;
    private String designation;

    // Constructor
    public Employee(int id, String name, Address addr, String empId, String dept, String designation) {
        super(id, name, addr); // Call superclass constructor
        this.empId = empId;
        this.dept = dept;
        this.designation = designation;
    }

    // Getters and Setters
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", dept=" + dept + ", designation=" + designation + ", " + super.toString() + "]";
    }
}
