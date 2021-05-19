package com.diego.commercialtrading.model.depot;
import java.util.ArrayList;
import java.util.List;

import com.diego.commercialtrading.model.product.Product;
import com.diego.commercialtrading.model.product.ProductFactory;

public class DepotFactory {

    public static List<Depot> create(int quant) {
        List<Depot> depots = new ArrayList<>();
        for (int i = 0; i < quant; i++) {
            List<Product> products = ProductFactory.create(15, 50);
            depots.add(new Depot(products));
        }
        return depots;
    }
}
