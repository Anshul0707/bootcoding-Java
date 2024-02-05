package com.bootcoding.file_handling;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ANSHUL\\Downloads\\aa.txt");
        try{
            if(!file.exists()) {
                file.createNewFile();
                System.out.println("file created ...");
            }else {
                file.delete();
                System.out.println("file deleted ...");
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
