package com.diego.commercialtrading.model.trade;

import java.util.ArrayList;
import java.util.List;

import com.diego.commercialtrading.model.depot.Depot;

public class Traders {
    private List<Depot> depots = new ArrayList<>();

    public void addList(List<Depot> depots) {
        this.depots.addAll(depots);
    }

    public void leave(Depot depot) {
        this.depots.remove(depot);
    }

    public List<Depot> getTraders() {
        return depots;
    }
}
