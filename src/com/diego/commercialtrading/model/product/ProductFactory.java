package com.diego.commercialtrading.model.product;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProductFactory {
    
    public static List<Product> create(int min, int max) {
        List<Product> products = new ArrayList<>();

        int stop = ThreadLocalRandom.current().nextInt(min, max + 1);
        for (int i = 0; i < stop; i++) {
            double price = createPrice();
            double delivery = createPrice();
            products.add(new Product(price, delivery));
        }
        return products;
    }

    private static double createPrice() {
        return ThreadLocalRandom.current().nextDouble(1, 11);
    }
}

