package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] Integerarr = {19, 36, 147, -33, 55, 44, 3, 6, 32, 6, -7, 3};

        List<String> MyStringlist = new ArrayList<>();
        MyStringlist.add("jonatan");
        MyStringlist.add("loei");
        MyStringlist.add("mads");
        MyStringlist.add("lukas");
        MyStringlist.add("malthe");
        MyStringlist.add("loei2");
        MyStringlist.add("mads4");
        MyStringlist.add("lukas1");
        MyStringlist.add("malthe2");


        List<Integer> intlist = new ArrayList<>(Arrays.asList(19, 36, 147, -33, 55, 44, 3, 6, 32, 6, -7, 3));

        sorting sorting = new sorting();
        Searching Searching = new Searching();
        //sorting.bublesort(Integerarr);
        //sorting.bublesort(intlist);
        //sorting.bublesort(MyStringlist);
        sorting.insertsort(Integerarr);
        //sorting.insertsort(MyStringlist);
        sorting.insertsort(intlist);
        //Collections.sort(MyStringlist);
        //MyStringlist.sort(String::compareTo);



        for (int i = 0; i < Integerarr.length; i++) {
            System.out.println(Integerarr[i]);
        }
        for (String s : MyStringlist)
            System.out.println(s);

    for(Integer s: intlist){
        System.out.println(s);
    }
        System.out.println("her er index af 55 " + Searching.secsearch(Integerarr, 55));
        System.out.println("her er index af 3 " + Searching.secsearch(intlist, 3));
        System.out.println("her er index af mads " + Searching.secsearch(MyStringlist, "mads"));

        System.out.println("her er index af 55 " + Searching.jumpsearch(Integerarr, 55));
        System.out.println("her er index af 3 " + Searching.jumpsearch(intlist, 3));
        System.out.println("her er index af mads " + Searching.jumpsearch(MyStringlist, "mads"));

        System.out.println("her er index af 55 " + Searching.binarysearch(Integerarr, 55, 0, Integerarr.length-1));
        System.out.println("her er index af 3 " + Searching.binarysearch(intlist, 3,0,intlist.size()-1));
        System.out.println("her er index af mads " + Searching.binarysearch(MyStringlist, "mads",0,MyStringlist.size()-1));

    }
}
