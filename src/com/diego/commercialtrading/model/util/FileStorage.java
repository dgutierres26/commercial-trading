package com.diego.commercialtrading.model.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileStorage {

    public static void save(File file, String content) {
        
        try(
            BufferedWriter bf = new BufferedWriter(new FileWriter(file));
        ) {
            String data = LocalDateTime.now().toString();
            data += "\n" + content;
            bf.write(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
       
    }
}
