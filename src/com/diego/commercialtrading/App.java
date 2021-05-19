package com.diego.commercialtrading;
import java.util.List;

import com.diego.commercialtrading.model.company.Company;
import com.diego.commercialtrading.model.company.CompanyFactory;
import com.diego.commercialtrading.model.product.AllProductsFacade;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Company> companies = CompanyFactory.create(3);

        System.out.println("We have " + companies.size() + " companies");

        System.out.println("We have " + companies.get(0).getDepots().size() + " depots");

        System.out.println("We have " + companies.get(0).getDepots().get(0).getNative().size() + " products");

        AllProductsFacade apf = new AllProductsFacade();
        apf.showDepotProducts(companies.get(0), 0);
    }
}
