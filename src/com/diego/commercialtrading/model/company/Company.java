package com.diego.commercialtrading.model.company;
import java.util.ArrayList;
import java.util.List;

import com.diego.commercialtrading.model.depot.Depot;

public class Company {
    
    private static int ID;
    private int id;
    private List<Depot> depots = new ArrayList<>();

    public Company(){
        this.id = ++ID;
    }

    public int getId() {
        return this.id;
    }

    public void setDepots(List<Depot> depots) {
        this.depots = depots;
    }

    public List<Depot> getDepots() {
        return this.depots;
    }
}
