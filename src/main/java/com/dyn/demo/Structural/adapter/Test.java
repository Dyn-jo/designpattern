package com.dyn.demo.Structural.adapter;

import com.dyn.demo.Structural.adapter.example.OperationAdapter;
import com.dyn.demo.Structural.adapter.example.ScoreOperation;

public class Test {

    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();
        int[] scores = {84, 76, 50, 69, 90, 91, 88, 96}; //定义成绩数组
        for (int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();
        scores = operation.sort(scores);
        for (int i : scores) {
            System.out.print(i + ",");
        }
    }

}
