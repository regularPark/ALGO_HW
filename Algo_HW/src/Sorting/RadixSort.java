package Sorting;

import java.lang.reflect.Array;
import java.util.*;

public class RadixSort {


    public static void sort(List<String> list, int letters) {
        if (list.size() <= 1) {
            return;
        }

        List<String>[] buckets = new List[63];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
        int largestLength = -1;
        int secondLargestLength = 0;
        for (String s : list) {
            int length = s.length();
            if (length >= largestLength) {
                secondLargestLength = largestLength;
                largestLength = length;
            } else if (secondLargestLength < length) {
                secondLargestLength = length;
            }
        }

        if (largestLength > letters) {
            throw new IllegalArgumentException("one of the strings is too long");
        }

        for (int i = secondLargestLength == largestLength ? secondLargestLength-1 : secondLargestLength; i >= 0; i--) {
            for (String word : list) {
                int index = (word.length() <= i) ?
                        0 : word.charAt(i) - ('0' - 1) < 11 ? word.charAt(i) - ('0' - 1) :
                        word.charAt(i) - ('A' - 1) < 27 ?
                        word.charAt(i) - ('A' - 1) + 10 :
                        word.charAt(i) - ('a' - 1) + 36;
                buckets[index].add(word);
            }
            // 0-9 A-Z a-z의 아스키코드를 이용하여
            // 분류할 방식만 생각해내면 될 것같다.

            list.clear();

            for (List<String> lst : buckets) {
                if (lst != null) {
                    list.addAll(lst);
                    lst.clear();
                }
            }

        }
        System.out.println(list);
        System.out.println("Size of list is "+list.size());

    }

}