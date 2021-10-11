package com.company;

import java.util.List;

public class sorting <T extends Comparable<T>> {

    public void bublesort(T[] array){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j< array.length-1-i;j++){
                if(array[j].compareTo(array[j+1])>0){
                    T temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public void bublesort(List<T> array){
        for(int i=0; i<array.size()-1; i++){
            for(int j=0; j< array.size()-1-i;j++){
                if(array.get(j).compareTo(array.get(j+1))>0){
                    T temp = array.get(j);
                    array.set(j,array.get(j+1));
                    array.set(j+1,temp);
                }
            }
        }
    }
    public void insertsort(T[] array){
        for(int i = 1; i<= array.length-1;i++){
            int j=i;
            while (j>0 && array[j].compareTo(array[j-1])<0){
                T temp = array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
                j--;
            }
        }
    }
    public void insertsort(List<T> array){
        for(int i = 1; i<= array.size()-1;i++){
            int j=i;
            while (j>0 && array.get(j).compareTo(array.get(j-1))<0){
                T temp = array.get(j);
                array.set(j,array.get(j-1));
                array.set(j-1, temp);
                j--;
            }
        }
    }
}
