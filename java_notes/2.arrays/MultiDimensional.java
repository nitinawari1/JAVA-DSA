package arrays;

import java.util.*;
import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        // 2D array = it is a array of arrays.
        Scanner in = new  Scanner(System.in);
     int[][] arr = new int[3][3]; // we have to specify row compolsory but column are not necessary to specify
                          //first is row and second is column 

        //dircet syntax
        int[][] arr1 = { //3*3
                {1,23,4}, // 0th index
                {2,4,5}, //1st index 
                {6,7,8} // 2nd index
        } ;

        //accesing element
        System.out.println(arr1[0]);  // it not give 0th index array it give random value
        System.out.println(Arrays.toString( arr1[0]));  // it give 0th index value
        System.out.println(arr1[0][2]); // accesing 2nd element from  0th array 

        //lenth of arr
        System.out.println(arr.length); // give the no. of rows 

        for(int row = 0 ; row<arr.length ; row++){
            for (int col=0; col<arr[row].length ; col++ ){
                      arr[row][col]=in.nextInt();           
                     }
        }
        // output
        for(int row = 0 ; row<arr.length ; row++){
            for (int col=0; col<arr[row].length ; col++){
                     System.out.println(arr[row][col]);      
                     }
                     System.out.println();
        }

        // output  second way
        // for(int row = 0 ; row<arr.length ; row++){
        //     System.out.println(Arrays.toString(arr1[row]));
        // }

        // //output third way 
        // for (int[] a: arr){
        //     System.out.println(Arrays.toString(a));
        // } 
    }
}
