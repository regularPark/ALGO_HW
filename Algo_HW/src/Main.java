import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        CSVReader csvReader = new CSVReader("C:\\Users\\srk99\\OneDrive\\문서\\ALGO_HW\\Alog_HW\\Sorting algorithm sample.csv");
        String[] line=null;
        while((line = csvReader.nextRead())!=null){
            for(String a : line){
                System.out.print(a +" ");
            }
            System.out.println();
        }
    }
}
