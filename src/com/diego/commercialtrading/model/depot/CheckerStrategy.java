package com.diego.commercialtrading.model.depot;

public class CheckerStrategy implements Checkable {

    @Override
    public boolean checkCash(Depot depot) {
        return depot.getCash() >= 1;
    }

    @Override
    public boolean checkNative(Depot depot) {
        return depot.nativeSize() >= 15 && depot.nativeSize() <= 50;
    }

    @Override
    public boolean checkExternal(Depot depot) {
        return depot.externalSize() <= 40;
    }

    @Override
    public boolean checkResource(Depot depot) {
        return checkCash(depot) && checkNative(depot) && checkExternal(depot);
    }
    
}
