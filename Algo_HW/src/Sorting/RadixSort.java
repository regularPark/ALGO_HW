package Sorting;

import java.util.*;

public class RadixSort {


    public static void radixSortForStringByIndexCount(String [] original, String [] sorted, int index) {
        int [] buckets = new int[256];
        Arrays.fill(buckets,  0);

        for (int i = 0; i < original.length; i++) {
            buckets[(int)original[i].charAt(index)]++;
        }
        for (int i = 1; i < buckets.length; i++) {
            buckets[i] += buckets[i-1];
        }
        for (int i = original.length-1 ; i >= 0; i--) {
            sorted[--buckets[(int)original[i].charAt(index)]] = original[i];
        }
    }
    public static void radixSortForStringByIndex(String [] original, String [] sorted, int maxStringLength) {
        for (int index = maxStringLength-1; index >= 0; index--) {
            radixSortForStringByIndexCount(original, sorted, index);
            for (int i = 0; i < original.length; i++) {
                original[i] = sorted[i];
            }
        }
    }

    public static int getMaxStringLength(String [] original) {
        int maxStringLength = 0;

        for (String str: original) {
            if (str.length() > maxStringLength)
                maxStringLength = str.length();
        }
        return maxStringLength;
    }

    public static void convertStrings(String [] original, int maxStringLength) {
        for (int i = 0; i < original.length; i++) {
            while (original[i].length() < maxStringLength) {
                original[i] += " ";
            }
        }
    }
    public static String [] radixSortForStrings(String [] original) {
        String [] sorted = new String[original.length];
        int maxStringLength = getMaxStringLength(original);
        convertStrings(original, maxStringLength);
        radixSortForStringByIndex(original, sorted, maxStringLength);

        return sorted;
    }


    public static void sort(String [] original) {
        String [] sorted = radixSortForStrings(original);

//        System.out.println(sorted);

    }

}