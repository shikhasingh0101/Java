public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

   
    public String getId() {
        return id;
    }

 
    public String getDesc() {
        return desc;
    }

    
    public int getQty() {
        return qty;
    }

  
    public void setQty(int qty) {
        this.qty = qty;
    }

   
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    
    public double getTotal() {
        return unitPrice * qty;
    }

   
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }

    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.print("Enter item ID: ");
        String userId = scanner.nextLine();

        System.out.print("Enter item description: ");
        String userDesc = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int userQty = scanner.nextInt();

        System.out.print("Enter unit price: ");
        double userUnitPrice = scanner.nextDouble();

        
        InvoiceItem item = new InvoiceItem(userId, userDesc, userQty, userUnitPrice);

       
        System.out.println("\nInvoice Item Details:");
        System.out.println("ID: " + item.getId());
        System.out.println("Description: " + item.getDesc());
        System.out.println("Quantity: " + item.getQty());
        System.out.println("Unit Price: " + item.getUnitPrice());
        System.out.println("Total Price: " + item.getTotal());

        
        System.out.println("String Representation: " + item.toString());

        scanner.close();
    }
}
