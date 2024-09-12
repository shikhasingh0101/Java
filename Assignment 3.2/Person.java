import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L; 
    private int id;
    private String name;
    private Address addr; 

  
    public Person(int id, String name, Address addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", addr=" + addr + "]";
    }
}
