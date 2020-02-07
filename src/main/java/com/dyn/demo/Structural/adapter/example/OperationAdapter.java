package com.dyn.demo.Structural.adapter.example;

// 适配器
public class OperationAdapter implements ScoreOperation {

    BinarySearch binarySearch;

    QuickSort quickSort;

    public OperationAdapter() {
        binarySearch = new BinarySearch();
        quickSort = new QuickSort();
    }

    @Override
    public int[] sort(int[] array) {

        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array, key);
    }

}
