package com.ngunguyen.distinctvalue.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader("/Users/ngunguyen/Documents/JavaProjects/DistinctValue/src/com/ngunguyen/distinctvalue/resources/ReadFile"));
            while((line = br.readLine()) != null){
                removeDuplicates(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void removeDuplicates(String line) {
        String[] arr = line.split(" ");
        List<String> result = Arrays.stream(arr)
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList());
        result.forEach(value -> System.out.print(value + " "));
    }
}
