package com.diego.commercialtrading.model.trade;

import java.util.List;

public class TradeCompany {

    private Traders traders;
    private TradeFacade facade;

    public TradeCompany(Traders traders) {
        this.traders = traders;
        facade = new TradeFacade(traders);
    }

    public void startTrading() {
        
        while(traders.getTraders().size() > 1) {    
            // System.out.println("size: " + traders.getTraders().size());      
            facade.trade();
        }
    }

    public List<TradeRecord> getRecords() {
        return facade.getRecords();
    }
}
