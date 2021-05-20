package com.diego.commercialtrading;
import java.util.List;

import com.diego.commercialtrading.model.trade.TradeRecord;
import com.diego.commercialtrading.model.company.Company;
import com.diego.commercialtrading.model.company.CompanyFactory;
import com.diego.commercialtrading.model.depot.Depot;
import com.diego.commercialtrading.model.drive.Printer;
import com.diego.commercialtrading.model.product.AllProductsFacade;
import com.diego.commercialtrading.model.trade.TradeCompany;
import com.diego.commercialtrading.model.trade.Traders;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Company> companies = CompanyFactory.create(3);
        Traders traders = new Traders();
        for (Company company : companies) {
            traders.addList(company.getDepots());
        }
        TradeCompany tradeCompany = new TradeCompany(traders);
        tradeCompany.startTrading();
        List<TradeRecord> records = tradeCompany.getRecords();

        System.out.println("Number Of Trades: " + records.size() + "\n");

        Printer.print(records);

        AllProductsFacade apf = new AllProductsFacade();
        apf.showAllRecords(records);

        // apf.showCompanyRecords(companies.get(0), records);
        // apf.showDepotProducts(companies.get(0));
    }


}
