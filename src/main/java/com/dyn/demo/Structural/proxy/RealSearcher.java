package com.dyn.demo.Structural.proxy;

public class RealSearcher implements Searcher{

    @Override
    public String doSearch(String userId, String keyword) {
        return "001";
    }

}
