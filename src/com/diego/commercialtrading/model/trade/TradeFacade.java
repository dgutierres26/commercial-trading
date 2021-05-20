package com.diego.commercialtrading.model.trade;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.diego.commercialtrading.model.trade.TradeRecord;
import com.diego.commercialtrading.model.depot.Depot;
import com.diego.commercialtrading.model.product.Product;

public class TradeFacade {

    private Traders traders = new Traders();
    private List<TradeRecord> records = new ArrayList<>();

    public TradeFacade(Traders traders) {
        this.traders = traders;
    }

    public List<TradeRecord> getRecords() {
        return this.records;
    }

    public boolean trade() {

        List<Depot> depots = traders.getTraders();
        Depot buyer = getTrader(depots);
        Depot seller = getTrader(depots);

        // System.out.println("==================================");
        // System.out.println("Id: " + buyer.getId() + " cash: " + buyer.getCash() 
        // + " Native: " + buyer.nativeSize() + " External: " + buyer.externalSize());

        // System.out.println("Id: " + seller.getId() + " cash: " + seller.getCash() 
        // + " Native: " + seller.nativeSize() + " External: " + seller.externalSize());

        if(buyer.getId() == seller.getId()) {
            return false;
        }

        if(!checkTrade(buyer) || !checkTrade(seller)) {
            return false;
        }

        int index = ThreadLocalRandom.current().nextInt(0, seller.nativeSize());
        Product product = seller.get(index);

        double price = product.getCost();
        if(!buyer.withdraw(price)) {
            return false;
        }

        seller.lodgement(price);
        buyer.buy(seller.sell(index));
        records.add(new TradeRecord(buyer, seller, product));
        return true;
    }

    private Depot getTrader(List<Depot> depots) {
        int index = ThreadLocalRandom.current().nextInt(0, depots.size());
        return depots.get(index);
    }

    private boolean checkTrade(Depot depot) {

        if(!depot.checkResource()) {
            traders.leave(depot);
            return false;
        }
        return true;
    }
    
}
