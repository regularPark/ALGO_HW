package Sorting;

import java.util.*;

public class MergeSort {

    private static List<String> sorted;		// 합치는 과정에서 정렬하여 원소를 담을 임시배열

    public static void merge_sort(List<String> a) {

        sorted = new ArrayList<String>() {
        };
        merge_sort(a, 0, a.size() - 1);
        sorted = null;
    }

    // Top-Down 방식 구현
    private static void merge_sort(List<String> a, int left, int right) {

        /*
         *  left==right 즉, 부분리스트가 1개의 원소만 갖고있는경우
         *  더이상 쪼갤 수 없으므로 return한다.
         */
        if(left == right) return;

        int mid = (left + right) / 2;	// 절반 위치

        merge_sort(a, left, mid);		// 절반 중 왼쪽 부분리스트(left ~ mid)
        merge_sort(a, mid + 1, right);	// 절반 중 오른쪽 부분리스트(mid+1 ~ right)

        merge(a, left, mid, right);		// 병합작업

        System.out.println(a);
    }

    /**
     * 합칠 부분리스트는 a배열의 left ~ right 까지이다.
     *
     * @param a		정렬할 배열
     * @param left	배열의 시작점
     * @param mid	배열의 중간점
     * @param right	배열의 끝 점
     */
    private static void merge(List<String> a, int left, int mid, int right) {
        int l = left;        // 왼쪽 부분리스트 시작점
        int r = mid + 1;    // 오른쪽 부분리스트의 시작점
        int idx = left;        // 채워넣을 배열의 인덱스


        while (l <= mid && r <= right) {
            /*
             *  왼쪽 부분리스트 l번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우
             *  왼쪽의 l번째 원소를 새 배열에 넣고 l과 idx를 1 증가시킨다.
             */
            if (a.get(l).compareTo(a.get(r)) <= 0) {
                sorted.set(idx, a.get(l));
                idx++;
                l++;
            }
            /*
             *  오른쪽 부분리스트 r번째 원소가 왼쪽 부분리스트 l번째 원소보다 작거나 같을 경우
             *  오른쪽의 r번째 원소를 새 배열에 넣고 r과 idx를 1 증가시킨다.
             */
            else {
                sorted.set(idx, a.get(r));
                idx++;
                r++;
            }
        }

        /*
         * 왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (l > mid)
         * = 오른쪽 부분리스트 원소가 아직 남아있을 경우
         * 오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
         */
        if (l > mid) {
            while (r <= right) {
                sorted.set(idx, a.get(r));
                idx++;
                r++;
            }
        }

        /*
         * 오른쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (r > right)
         * = 왼쪽 부분리스트 원소가 아직 남아있을 경우
         * 왼쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
         */
        else {
            while (l <= mid) {
                sorted.set(idx, a.get(l));
                idx++;
                l++;
            }
        }

        /*
         * 정렬된 새 배열을 기존의 배열에 복사하여 옮겨준다.
         */
        for (int i = left; i <= right; i++) {
            a.set(i, sorted.get(i));
        }
    }
}