package com.dyn.demo.Structural.proxy;

public class Test {

    public static void main(String[] args) {
        Searcher searcher = new ProxcySearcher();
        String result = searcher.doSearch("杨过", "玉女心经");
    }

}
