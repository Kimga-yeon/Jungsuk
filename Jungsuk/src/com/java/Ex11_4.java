package com.java;

import java.util.Arrays;

public class Ex11_4 {
    public static void main(String[] args) {
        int[]arr = {3,2,0,1,4};
        int idx = Arrays.binarySearch(arr, 2);
        System.out.println(idx);        
        
        //배열의 정렬과 검색 - sort(), binarySerch()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idx2 = Arrays.binarySearch(arr, 2);
        System.out.println(idx2);
    }
        

}
