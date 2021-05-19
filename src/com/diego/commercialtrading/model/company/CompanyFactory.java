package com.diego.commercialtrading.model.company;
import java.util.ArrayList;
import java.util.List;

import com.diego.commercialtrading.model.depot.Depot;
import com.diego.commercialtrading.model.depot.DepotFactory;

public class CompanyFactory {
    
    public static List<Company> create(int quant) {
        List<Company> companies = new ArrayList<>();
        for (int i = 0; i < quant; i++) {
            List<Depot> depots = DepotFactory.create(50);
            companies.add(new Company(depots));
        }
        return companies;
    }
}
