package com.diego.commercialtrading.model.depot;


import java.util.ArrayList;
import java.util.List;

import com.diego.commercialtrading.model.product.Product;

public class Depot {
    
	private double cash;
    private List<Product> nativeProduct;
    private List<Product> externalProduct = new ArrayList<>();

    public Depot(List<Product> products) {
        this.nativeProduct = products;
    }

    public List<Product> getNative() {
        return this.nativeProduct;
    }

    public List<Product> getExternal() {
        return this.externalProduct;
    }
    
    public double getCash() {
    	return cash;
    }
    
    public void lodgement(double cash) {
    	this.cash += cash;
    }
    
    public boolean withdraw(double cash) {
    	if(cash <= this.cash) {
    		this.cash -= cash;
    		return true;
    	}
    	return false;
    }
    
    public int nativeSize() {
    	return 0;
    }
    
    public void externalSize() {
    	
    }
}
