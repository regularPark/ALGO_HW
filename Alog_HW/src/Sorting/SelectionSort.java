package Sorting;

public class SelectionSort {
    public void sort(String[] arr) {
        String tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        // 시간 측정 추가하기
    }
}
