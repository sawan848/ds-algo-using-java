package org.example.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * 05:46 pm
 * 19-12-2022
 */
public class Q1 {
    public static void main(String[] args) {

        int []arr={12,23,45,66};
        int []arr1={12,23,45,66};
        int mismatch = Arrays.mismatch(arr, arr1);


        
        System.out.println(mismatch);

//        Arrays.fill(arr,0);
//        System.out.println(Arrays.toString(arr));
//        boolean equals = Arrays.equals(arr, arr1);
//        System.out.println(equals);

//        int index = Arrays.binarySearch(arr, 45);
//        List<Integer> integers = Arrays.asList(12, 34, 56, 77, 88);
//        String [][]arr={{"Samay","Sukriti","Sankriti","Sarthak"},{"Kunal","kartik","kundan","kumar"}};
//        System.out.println(Arrays.deepToString(arr));

//        int compare = Arrays.compare(arr,arr1);


    }
}
