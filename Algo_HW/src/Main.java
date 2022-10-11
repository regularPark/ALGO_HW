import Sorting.*;

import java.io.*;
import java.util.*;


public class Main {

    public static int getMax(List<String> arr) {
        int max = -1 ;
        for(int i = 0; i < arr.size(); i++){
            max = Math.max(max, arr.get(i).length());
        }

        return max;
    }
    public static void main(String[] args) throws IOException {
        List<String> selectionList = new ArrayList<String>();
        List<String> insertionList = new ArrayList<String>();
        List<String> bubbleList = new ArrayList<String>();
        List<String> quickList = new ArrayList<String>();
        List<String> mergeList = new ArrayList<String>();
        List<String> heapList = new ArrayList<String>();
        List<String> radixList = new ArrayList<String>();



        CSVReader csvReader = new CSVReader("C:\\Users\\srk99\\OneDrive\\문서\\ALGO_HW\\Algo_HW\\Sorting algorithm sample.csv");

        String[] line=null;
        String[] tmp;


        boolean isData = false;
//         클래스화 한 후 7개의 배열 만들기

        while((line = csvReader.nextRead())!=null) {
            int i = 0;
            int cnt = 0;
            for(String a : line){
                if(cnt > 0) {
                    insertionList.add(a);
                    selectionList.add(a);
                    bubbleList.add(a);
                    radixList.add(a);
                    quickList.add(a);
                    mergeList.add(a);
                    heapList.add(a);
                }
                cnt ++;
                i++;
            }
        }

        selectionList.remove(0);
        radixList.remove(0);
        insertionList.remove(0);
        bubbleList.remove(0);
        mergeList.remove(0);
        quickList.remove(0);
        heapList.remove(0);

        Timer timer = new Timer();

//        // 선택정렬 실행시간
        SelectionSort selectionSort = new SelectionSort();

        long start_sel = timer.startTime();
        selectionSort.sort(selectionList);
        long end_sel = timer.endTime();
        System.out.println("Selection Sorting : " + (end_sel - start_sel) + "ms");

//        // 버블정렬 실행시간
//        BubbleSort bubbleSort = new BubbleSort();
//
//        long start_bub = timer.startTime();
//        bubbleSort.sort(bubbleList);
//        long end_bub = timer.endTime();
//        System.out.println("Bubble Sorting : " + (end_bub - start_bub) + "ms");


//        // 삽입정렬 실행시간
//        InsertionSort insertionSort = new InsertionSort();
//
//        long start_ins = timer.startTime();
//        insertionSort.sort(insertionList);
//        long end_ins = timer.endTime();
//
//        System.out.println("Insertion Sorting : " + (end_ins - start_ins) + "ms");
//
        // 합병정렬 실행시간
//        MergeSort mergeSort = new MergeSort();
//
//
//        long start_merge = timer.startTime();
//        mergeSort.sort(mergeList);
//        long end_merge= timer.endTime();
//
//        System.out.println("Merge Sorting : " + (end_merge-start_merge) + "ms");

        // 퀵정렬 실행시간
//        QuickSort quickSort = new QuickSort();
//
//        long start_quick = timer.startTime();
//        quickSort.sort(quickList);
//        long end_quick= timer.endTime();
//
//        System.out.println("Quick Sorting : " + (end_quick-start_quick) + "ms");
//
        // 힙정렬 실행시간
//
//        HeapSort heapSort = new HeapSort();
//
//        long start_heap = timer.startTime();
//        heapSort.sort(heapList);
//        long end_heap= timer.endTime();
//
//        System.out.println("Heap Sorting : " + (end_heap-start_heap) + "ms");

        // 기수정렬 실행시간
//        RadixSort radixSort = new RadixSort();
//        long start_radix = timer.startTime();
//
//        // 리스트 안에서 가장 긴 문장 알아내는 함수 만들기
//        radixSort.sort(radixList, getMax(radixList));
//
//        long end_radix= timer.endTime();
//        System.out.println("Radix Sorting : " + (end_radix-start_radix) + "ms");
    }
}
