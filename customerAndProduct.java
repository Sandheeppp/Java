package courseUd;

class Product{
	private String itemNo;
	private String name;
	private double price;
	private short qty;
	
	public Product(String itemNumber) {
		itemNo = itemNumber;
	}
	
	public Product(String itemNumber, String Name) {
		name = Name;
		itemNo = itemNumber;
	}
    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
	
	public void setQuantity(short qty2) {
		this.qty = qty2;
	}

	private void setPrice(double price2) {
		this.price = price2;
	}

	public String getItemNo() {return itemNo;}
	public String getName() {return name;}
	public double getPrice() {return price;}
	public short getQty() {return qty;}
}

class Customer{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

public class customerAndProduct {

	public static void main(String[] args) {
        Product p1 = new Product("P101");
        Product p2 = new Product("P102", "Laptop");
        Product p3 = new Product("P103", "Mouse", 499.99, (short) 10);

        // Printing Product details
        System.out.println("----- Product Details -----");
        System.out.println("Item No: " + p1.getItemNo());

        System.out.println("\nItem No: " + p2.getItemNo());
        System.out.println("Name   : " + p2.getName());

        System.out.println("\nItem No: " + p3.getItemNo());
        System.out.println("Name   : " + p3.getName());
        System.out.println("Price  : " + p3.getPrice());
        System.out.println("Qty    : " + p3.getQty());

        // Creating Customer objects
        Customer c1 = new Customer("C1001", "Arjun");
        Customer c2 = new Customer("C1002", "Rahul", "Bangalore", "9876543210");

        // Printing Customer details
        System.out.println("\n----- Customer Details -----");
        System.out.println("Customer ID: " + c1.getCustId());
        System.out.println("Name       : " + c1.getName());

        System.out.println("\nCustomer ID: " + c2.getCustId());
        System.out.println("Name       : " + c2.getName());
        System.out.println("Address    : " + c2.getAddress());
        System.out.println("Phone No   : " + c2.getPhno());
	}

}
