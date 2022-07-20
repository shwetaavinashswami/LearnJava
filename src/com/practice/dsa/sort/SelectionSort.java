package com.practice.dsa.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String [] args){

        int [] intArray = {-20, 30, 4, 79, 13, 55, 28};
        for(int lastUnSortedIndex = intArray.length-1 ; lastUnSortedIndex >0; lastUnSortedIndex --){
            int largest = 0;

            for (int i = 0; i<=lastUnSortedIndex; i ++){
                if (intArray[i] > intArray[largest])
                    largest =i;
            }
            swap(intArray, largest, lastUnSortedIndex);
        }
        Arrays.stream(intArray).forEach(System.out::println);
    }

    public static void swap(int [] intArray , int i, int j){
        int temp = intArray [i];
        intArray[i] = intArray [j];
        intArray [j] = temp;
    }
}
