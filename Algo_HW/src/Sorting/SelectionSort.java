package Sorting;

import java.util.*;

public class SelectionSort {
    public void sort(List<String> arr) {
        String tmp;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).compareTo(arr.get(j)) > 0) {
                    tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }
        // 시간 측정 추가하기
        System.out.println(arr);
        System.out.println("Size of list is " + arr.size());
    }
}
