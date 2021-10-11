package com.company;

import java.util.List;
import java.lang.Math;

public class Searching  <T extends Comparable<T>> {

    public Integer secsearch(T[] array, T element) {
        for (int j = 0; j < array.length; j++) {
            if (array[j].compareTo(element) == 0) {
                return j;
            }
        }
        return null;
    }

    public Integer secsearch(List<T> array, T element) {
        for (int j = 0; j < array.size(); j++) {
            if (array.get(j).compareTo(element) == 0) {
                return j;
            }
        }
        return null;
    }


    public Integer jumpsearch(T[] array, T element) {
        int t = 0;
        Integer sqrtn = (int) Math.sqrt(array.length);
        int j = sqrtn;
        while (array[Math.min(j - 1, array.length - 1)].compareTo(element) < 0) {
            t = j;
            j = j + sqrtn;
            if (t >= array.length) {
                return null;
            }
        }
        while (array[t].compareTo(element) < 0) {
            t++;
            if (t == j || t == array.length) {
                return null;
            }
            if (array[t].compareTo(element) == 0) {
                return t;
            }
        }
        return null;
    }

    public Integer jumpsearch(List<T> array, T element) {
        Integer sqrtn = (int) Math.sqrt(array.size());
        int j = sqrtn;
        int t = 0;
        while (array.get(Math.min(j - 1, array.size()-1)).compareTo(element) < 0) {
            t = j;
            j = j + sqrtn;
            if (t >= array.size()) {
                return null;
            }
        }
        while (array.get(t).compareTo(element) < 0) {
            t++;
            if (t == j || t == array.size()) {
                return null;
            }
            if (array.get(t).compareTo(element) == 0) {
                return t;
            }
        }
        return null;
    }

    public Integer binarysearch(List<T> array, T element, int low, int high){
        if(low> high){
            return null;
        }
        int mid = (low+ high)/2;

        if (array.get(mid).compareTo(element)==0){
            return mid;
        }

        if(array.get(mid).compareTo(element)<0){
            return binarysearch(array, element, mid+1, high);
        }
        if(array.get(mid).compareTo(element)>0){
            return binarysearch(array, element, low, mid-1);
        }
        return null;
    }

    public Integer binarysearch(T[] array, T element, int low, int high){
        if(low > high){
            return null;
        }
        int mid = (low+ high)/2;

        if (array[mid].compareTo(element)==0){
            return mid;
        }

        if(array[mid].compareTo(element)<0){
            return binarysearch(array, element, mid+1, high);
        }
        if(array[mid].compareTo(element)>0){
            return binarysearch(array, element, low, mid-1);
        }
        return null;
    }
}
