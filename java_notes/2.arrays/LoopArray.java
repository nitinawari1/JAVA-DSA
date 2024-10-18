package arrays;

import java.util.*;
import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {
        //arrays of 
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 29;
        arr[1] = 43;
        arr[2] = 323;
        arr[3] = 23;
        arr[4] = 6;
        //[29, 43, 323, 23, 6]

        //input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] =input.nextInt();
        }
        //printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
        }
        //for each loop
        for (int num : arr){ // for every element in array , print the element  
            System.out.println(num + " "); // here num represent the elements of array
        }

        System.out.println(Arrays.toString(arr)); // convert array to  string  and print with proper commas



        //arrays of string 
        String[] str = new String[5];
         
        for (int i = 0; i < arr.length; i++) {
            str[i] = input.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(str[i]); 
        }


    }
}
