package com.practice.dsa.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){

        //Sorted partition growing from right to left

        int [] intArray = { -1, 8, 3, 6, 35, 0 };

        for( int lastUnSortedIndex = intArray.length - 1; lastUnSortedIndex >0; lastUnSortedIndex --){
            for (int i = 0 ; i < lastUnSortedIndex; i ++){
                if (intArray[i] > intArray[i+1]){
                    swap(intArray, i,i+1);
                }
            }
        }
        System.out.println("Sorted array is:");
        Arrays.stream(intArray).forEach(System.out::println);
    }

    private static void swap(int [] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
