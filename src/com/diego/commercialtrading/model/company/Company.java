package com.diego.commercialtrading.model.company;
import java.util.ArrayList;
import java.util.List;

import com.diego.commercialtrading.model.depot.Depot;

public class Company {
    
    private static int ID;
    private int id;
    private List<Depot> depots = new ArrayList<>();

    public Company(List<Depot> depots){
        this.id = ++ID;
        this.depots = depots;
    }

    public int getId() {
        return this.id;
    }

    public List<Depot> getDepots() {
        return this.depots;
    }
}
