package com.diego.commercialtrading.model.company;
import java.util.ArrayList;
import java.util.List;

import com.diego.commercialtrading.model.depot.Depot;
import com.diego.commercialtrading.model.depot.DepotFactory;

public class CompanyFactory {
    
    public static List<Company> create(int quant) {
        List<Company> companies = new ArrayList<>();
        for (int i = 0; i < quant; i++) {
            Company company = new Company();
            int companyId = company.getId();
            List<Depot> depots = DepotFactory.create(companyId, 50);
            company.setDepots(depots);
            companies.add(company);
        }
        return companies;
    }
}
