package com.diego.commercialtrading.model.depot;

public class NullChecker implements Checkable {
//Depot with NullChecker will be stopped
    @Override
    public boolean checkResource(Depot depot) {
        return false;
    }

    @Override
    public boolean checkCash(Depot depot) {
        return false;
    }

    @Override
    public boolean checkNative(Depot depot) {
        return false;
    }

    @Override
    public boolean checkExternal(Depot depot) {
        return false;
    }
    
}
