package com.diego.commercialtrading.model.trade;

import com.diego.commercialtrading.model.depot.Depot;
import com.diego.commercialtrading.model.product.Product;

public class TradeRecord {
    private Depot buyer;
    private Depot seller;
    private Product product;

    public TradeRecord(Depot buyer, Depot seller, Product product) {
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
    }

    public Depot getBuyer() {
        return this.buyer;
    }

    public Depot getSeller() {
        return this.seller;
    }
    

    public Product getProduct() {
        return this.product;
    }

    @Override
    public String toString() {
        return "{" +
            " buyerId='" + buyer.getId() + "'" +
            ", sellerId='" + seller.getId() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }

    
}
