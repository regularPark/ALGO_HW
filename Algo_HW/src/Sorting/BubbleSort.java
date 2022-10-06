package Sorting;

import java.util.*;
public class BubbleSort {
    public void sort(List<String> arr){
        for(int i = 0 ; i< arr.size(); i++){
            for(int j = 0; j < arr.size()-i-1;j++){
                if(arr.get(j).compareTo(arr.get(j+1)) > 0) {
                    String tmp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, tmp);
                }
            }
        }
    }

}
