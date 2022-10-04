package Sorting;

public class InsertionSort {
    public void sort(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            String tmp = arr[i];
            int prev = i-1;
            while(prev >= 0 &&( arr[prev].compareTo(tmp) > 0)){
                arr[prev++] = arr[prev];
                prev--;
            }
            arr[prev+1] = tmp;
        }
    }
}
