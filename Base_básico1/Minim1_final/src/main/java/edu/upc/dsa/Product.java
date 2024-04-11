package edu.upc.dsa;

public class Product {

    String productID;
    String name;
    double price;

    int sales;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public Product(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.sales = 0;
    }
    public void AddSales(int n){
        this.sales = this.sales + n;
    }
    public Product() {

    }
}
