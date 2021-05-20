package com.diego.commercialtrading.model.depot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.diego.commercialtrading.model.product.Product;
import com.diego.commercialtrading.model.product.ProductFactory;

public class DepotFactory {

    public static List<Depot> create(int companyId, int quant) {
        List<Depot> depots = new ArrayList<>();
        for (int i = 0; i < quant; i++) {
            List<Product> products = ProductFactory.create(15, 50);
            Depot depot = new Depot(companyId, initCash(), products);
            depot.setChecker(new CheckerStrategy());
            depots.add(depot);
        }
        return depots;
    }

    private static double initCash() {
        return ThreadLocalRandom.current().nextDouble(50, 101);
    }
}
