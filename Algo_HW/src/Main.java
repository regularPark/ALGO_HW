import Sorting.*;

import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        List<String> selectionList = new ArrayList<String>();
        List<String> insertionList = new ArrayList<String>();
        List<String> bubbleList = new ArrayList<String>();
        List<String> radixList = new ArrayList<String>();
        List<String> quickList = new ArrayList<String>();
        List<String> mergeList = new ArrayList<String>();
        List<String> heapList = new ArrayList<String>();

        CSVReader csvReader = new CSVReader("C:\\Users\\srk99\\OneDrive\\문서\\ALGO_HW\\Algo_HW\\Sorting algorithm sample.csv");

        String[] line=null;
        String[] tmp;


        boolean isData = false;
//         클래스화 한 후 7개의 배열 만들기
        while((line = csvReader.nextRead())!=null) {
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
            }
        }

//        // 선택정렬 실행시간
//        SelectionSort selectionSort = new SelectionSort();
        Timer timer = new Timer();
//
//        long start_sel = timer.startTime();
//        selectionSort.sort(selectionList);
//        long end_sel = timer.endTime();
//        System.out.println("Selection Sorting : " + (end_sel - start_sel));
//
//        // 버블정렬 실행시간
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort(bubbleList);
//
//
//        long start_bub = timer.startTime();
//        selectionSort.sort(selectionList);
//        long end_bub = timer.endTime();
//        System.out.println("Bubble Sorting : " + (end_bub - start_bub));
//
//
//        // 삽입정렬 실행시간
//        InsertionSort insertionSort = new InsertionSort();
//
//        long start_ins = timer.startTime();
//        insertionSort.sort(insertionList);
//        long end_ins = timer.endTime();
//
//        System.out.println("Insertion Sorting : " + (end_ins - start_ins));

        // 합병정렬 실행시간 오류 발생!!!
//        MergeSort mergeSort = new MergeSort();
//
//        long start_merge = timer.startTime();
//        mergeSort.merge_sort(mergeList);
//        long end_merge= timer.endTime();
//
//        System.out.println("Merge Sorting : " + (end_merge-start_merge));

//        // 퀵정렬 실행시간
//        QuickSort quickSort = new QuickSort();
//
//        long start_quick = timer.startTime();
//        quickSort.sort(quickList);
//        long end_quick= timer.endTime();
//
//        System.out.println("Quick Sorting : " + (end_quick-start_quick));

//        // 힙정렬 실행시간
//
//        HeapSort heapSort = new HeapSort();
//
//        long start_heap = timer.startTime();
//        heapSort.sort(heapList);
//        long end_heap= timer.endTime();
//
//        System.out.println("Heap Sorting : " + (end_heap-start_heap));

        // 기수정렬 실행시간
    }
}
