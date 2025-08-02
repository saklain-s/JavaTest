package com.OOPS;

class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    
    public Product(String itemno)
    {
        itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    
    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.name=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.name=name;
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

public class SCoops2 {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("P001", "Ice Cream");
        product1.setPrice(3.99);
        product1.setQuantity((short) 10);

        Product product2 = new Product("P002", "Milkshake", 4.49, (short) 8);

        // Creating customers
        Customer customer1 = new Customer("C001", "John Doe", "123 Main St", "555-1234");

        Customer customer2 = new Customer("C002", "Jane Smith");
        customer2.setAddress("456 Elm St");
        customer2.setPhno("555-5678");

        // Displaying product and customer details
        System.out.println("Product 1 Details:");
        System.out.println("Item No: " + product1.getItemNo());
        System.out.println("Name: " + product1.getName());
        System.out.println("Price: $" + product1.getPrice());
        System.out.println("Quantity: " + product1.getQuantity());

        System.out.println("\nProduct 2 Details:");
        System.out.println("Item No: " + product2.getItemNo());
        System.out.println("Name: " + product2.getName());
        System.out.println("Price: $" + product2.getPrice());
        System.out.println("Quantity: " + product2.getQuantity());

        System.out.println("\nCustomer 1 Details:");
        System.out.println("Customer ID: " + customer1.getCustId());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Address: " + customer1.getAddress());
        System.out.println("Phone Number: " + customer1.getPhno());

        System.out.println("\nCustomer 2 Details:");
        System.out.println("Customer ID: " + customer2.getCustId());
        System.out.println("Name: " + customer2.getName());
        System.out.println("Address: " + customer2.getAddress());
        System.out.println("Phone Number: " + customer2.getPhno());
    }
}
