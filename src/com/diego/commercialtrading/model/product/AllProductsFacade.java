package com.diego.commercialtrading.model.product;
import java.util.List;

import com.diego.commercialtrading.model.company.Company;
import com.diego.commercialtrading.model.depot.Depot;

public class AllProductsFacade {
    
    public void showDepotProducts(Company company, int depotNumber) {
        List<Depot> depots = company.getDepots();
        Depot depot = depots.get(depotNumber);
        List<Product> products = depot.getNative();

        for (Product product : products) {
            System.out.println(product);
        }
    }

    
}

