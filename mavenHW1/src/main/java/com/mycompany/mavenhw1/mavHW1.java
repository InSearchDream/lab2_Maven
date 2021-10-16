package com.mycompany.mavenhw1;
import org.joda.time.LocalDateTime;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class mavHW1 {
    public static void main(String[] args) throws IOException {
	LocalDateTime dt = new LocalDateTime();
	System.out.println("Сейчас: " + dt);
        
        File newFile = new File("test.txt");
        if (newFile.exists()){
            String str = FileUtils.readFileToString(newFile, StandardCharsets.UTF_8);
            System.out.println(str);
        }else 
            System.out.println("Файла не существует");
    } 
}
