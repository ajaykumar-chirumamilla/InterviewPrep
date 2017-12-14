package com.application.text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yaswanth on 2/7/17.
 */
public class CustomFileReader {

    private final File file;

    public CustomFileReader(String path){
        if(path == null || path.isEmpty()){
            throw new RuntimeException("Invalid File : " + path + ". Please set -Dfile.path=<<file_path>>");
        }

        file = new File(path);
        if(!file.exists()){
            throw new RuntimeException("File doesn't exist : " + path);
        }
    }

    public List<String> readLines() {
        List<String> lines = new ArrayList<>();
        try(FileReader fRead = new FileReader(file)){
            try(BufferedReader buffRead = new BufferedReader(fRead)){
                String line = null;
                while ((line = buffRead.readLine()) != null) {
                    lines.add(line);
                }
            }
        }catch (IOException e){
            throw new RuntimeException("Unable to read file : " + file.getAbsolutePath(), e);
        }
        return lines;
    }

}