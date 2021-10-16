package com.mycompany.mavsecondchild;
import org.joda.time.LocalDateTime;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class SecondChild {
    public static void main(String[] args) throws IOException {
        // проверка работы зависимости, подключенной к родительскому прооекту
        LocalDateTime dt = new LocalDateTime();
	System.out.println("Сейчас: " + dt);
         // проверка работы зависимости, подключенной к 1 дочернему прооекту
        File newFile = new File("test.txt");
        if (newFile.exists()){
            String str = FileUtils.readFileToString(newFile, StandardCharsets.UTF_8);
            System.out.println(str);
        }else 
            System.out.println("Файла не существует");
    }    
}
