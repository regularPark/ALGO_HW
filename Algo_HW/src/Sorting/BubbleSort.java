package Sorting;

public class BubbleSort {
    public void sort(String[] arr){
        for(int i = 0 ; i< arr.length; i++){
            for(int j = 0; j < arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    String tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}
