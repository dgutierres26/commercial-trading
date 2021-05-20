package com.diego.commercialtrading.model.depot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.diego.commercialtrading.model.product.Product;

public class Depot {
    // All depots can see the ID value
    private static int ID;

    private final int id;
    private final int companyId;
    private Checkable checker;
    private double cash;
    private List<Product> nativeProduct;
    private List<Product> externalProduct = new ArrayList<>();
    
    public Depot(int companyId, double cash, List<Product> products) {
        this.nativeProduct = products;
        this.cash = cash;
        this.companyId = companyId;
        id = ++ID;
    }

    public int getId() {
        return this.id;
    }

    public int getCompanyId() {
        return this.companyId;
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

    public Checkable getChecker() {
        return this.checker;
    }

    public void setChecker(Checkable checker) {
        this.checker = checker;
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
    	return nativeProduct.size();
    }
    
    public int externalSize() {
    	return externalProduct.size();
    }

    public Product sell(int index) {
        return nativeProduct.remove(index);
    }

    public void buy(Product product) {
        nativeProduct.add(product);
    }

    public Product get(int index) {
        return nativeProduct.get(index);
    }
    //It is going to check if the class is Null
    public boolean checkResource() {
        Optional<Checkable> optional = Optional.ofNullable(checker);
        return (optional.orElse(new NullChecker())).checkResource(this);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", companyId='" + companyId + "'" +
            ", cash='" + cash + "'" +
            ", nativeProduct='" + nativeProduct + "'" +
            ", externalProduct='" + externalProduct + "'" +
            "}";
    }

}

