package Sorting;

import java.util.*;

public class InsertionSort {
    public void sort(List<String> arr) {
        for(int i = 0; i < arr.size(); i++) {
            String tmp = arr.get(i);
            int prev = i-1;
            while(prev >= 0 &&( arr.get(prev).compareTo(tmp) > 0)){
                arr.set(prev+1, arr.get(prev));
                prev--;
            }
            arr.set(prev+1, tmp);
        }
//        System.out.println(arr);
    }
}
