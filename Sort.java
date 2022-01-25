package com.mss.part1;

public class Sort {

    public static void swap(int[] arr, int i, int j) {
//        定义临时变量
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //    选择排序
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; //if 中的return是什么意思？？
        }
        int N = arr.length;
//        规则：每一个元素都要跟剩下的元素都比较一遍，较大的数或者较小的数放在i的位置上，较大的数或者较小的数只决定数据的排序方式（从小到大）
//        为提高效率不能重复进行比较
        for (int i = 0; i < N; i++) { // 所有数依次拿出来排序
            int minValueIndex = i;
            for (int j = i + 1; j < N; j++) { // 控制对比的另一个数字
                minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
            }
            swap(arr, i, minValueIndex);
        }
    }

    //    冒泡排序
//    规则：相邻的两个数字进行比较，如果一个数大于另一个数相互交换（如果一个数小于另一个数相互交换）
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) { // 控制比较的趟数，一共需要比较N-1次
            for (int second = 1; second <= end; second++) { // 该数和前一个数进行比较
//                大于小于最终只决定数组的排序是从小到大还是从大到小
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second, second - 1);
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 5, 1, 6, 8, 1, 3, 5, 7, 5, 6};
        int[] arr1 = {1}; // 只有一个元素的数组

//        test
//        printArray(arr);
//        selectSort(arr);
//        printArray(arr);
//
////        test
//        printArray(arr1);
//        selectSort(arr1);
//        printArray(arr1);


        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
}
