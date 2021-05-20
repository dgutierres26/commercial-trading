package com.diego.commercialtrading.model.drive;

import java.io.File;
import java.util.List;

import com.diego.commercialtrading.model.trade.TradeRecord;
import com.diego.commercialtrading.model.util.FileStorage;

public class Printer {

    public static void print(List<TradeRecord> records) {
        StringBuilder sb = new StringBuilder();
        sb.append("Number Of Records: " + records.size() + "\n");
        for (TradeRecord record : records) {
            sb.append(record + "\n");          
        }
        File file = new File("records.txt");
        FileStorage.save(file, sb.toString());
    }
    
}
