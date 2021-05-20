package com.diego.commercialtrading.model.product;
import java.util.List;

import com.diego.commercialtrading.model.trade.TradeRecord;
import com.diego.commercialtrading.model.company.Company;
import com.diego.commercialtrading.model.depot.Depot;

public class AllProductsFacade {
    
    public void showDepotProducts(Company company) {
        List<Depot> depots = company.getDepots();

        for (Depot depot : depots) {
            System.out.println(depot);
        }
    }

    public void showAllRecords(List<TradeRecord> records) {
        for (TradeRecord record : records) {
            System.out.println(record);
        }
    }

    public void showCompanyRecords(Company company, List<TradeRecord> records) {
        int companyId = company.getId();
        for (TradeRecord record : records) {
            if (record.getBuyer().getCompanyId() == companyId 
                            || record.getSeller().getCompanyId() == companyId) {
                System.out.println(record);
            }
        }

    }
    
}

