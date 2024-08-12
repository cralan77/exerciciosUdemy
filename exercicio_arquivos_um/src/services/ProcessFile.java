package services;

import entities.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessFile {
    private static List lines;
    private static File file;
    private static Scanner sc = null;

    public static List readFile(String path ){
        lines = new ArrayList<>();
        file = new File(path);

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                String [] line= sc.nextLine().split(",");
                lines.add( new Product(line[0],Double.parseDouble(line[1]), Integer.parseInt(line[2])));
                            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }

        return lines;

    }

    public static void saveFile(List product, String path)  {
        file = new File(path);

        boolean sucess = new File(file.getParent()+"\\output").mkdir();

        if (sucess){
            String newFile = file.getParent()+"\\output\\summary.csv";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))){

                for(Object x : product){
                   bw.write((String)x);
                   bw.newLine();

                }
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }


    }
}
