package com.diego.commercialtrading.model.depot;

public interface Checkable {
    boolean checkResource(Depot depot);
    boolean checkCash(Depot depot);
    boolean checkNative(Depot depot);
    boolean checkExternal(Depot depot);
}
