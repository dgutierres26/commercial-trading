package com.diego.commercialtrading.model.product;
import java.text.DecimalFormat;

public class Product {
    
    private double price;
    private double delivery;
    private DecimalFormat df = new DecimalFormat("#.##");

    Product(double price, double delivery) {
        this.price = price;
        this.delivery = delivery;
    }

    public double getPrice() {
        return this.price;
    }

    public double getDelivery() {
        return this.delivery;
    }
    
    public double getCost() {
    	return price + delivery;    	
    }  
    
    @Override
    public String toString() {
        return "Product [price="+df.format(price)+", delivery="+df.format(delivery)+"]";
    }
}
