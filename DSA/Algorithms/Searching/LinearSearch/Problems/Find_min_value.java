package DSA.Algorithms.Searching.LinearSearch.Problems;

import java.util.Scanner;

public class Find_min_value {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,4,5,-6,7,8,9,0};
       
        System.out.println( minvalue(arr));
        
    }
    static int minvalue(int[] arr ){
        int minimum  = arr[0];
        for (int i = 1; i < arr.length; i++) {
         if ( arr[i] < minimum ){
            minimum = arr[i];
         }
        }
        return minimum;
    }
}
