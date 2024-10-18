package DSA.Algorithms.Searching.LinearSearch.Problems;
import java.util.*;
public class Search_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 35, 67, 57 },
                { 2, 35, 4, 11, 78 },
                { 3, 45 },
                { 232, 778, 11 }
        };
        int target = 11;
        
        //Q.1
        System.out.println(searchIN2DArray(arr, target));

        //Q.2
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        //Q.3
        System.out.println(maxvalue(arr));
    }



    //Q.1 find target value in 2D array
    static int searchIN2DArray(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return arr[row][col]; // retunring value 
                }
            }
        }
        return -1;

    }




    //Q.2 find target value in 2D array and return row and column

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[] {row, col};  //declaring and creating new array  of index values  // it is little bit diffrent syntax of creating 2D array
                    // returning the index value of row and column
                }
            }
        }
      return new int[] {-1 , -1};

    }


    //Q.3 find max value in 2D array
    static int maxvalue(int[][] arr ) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                  max = arr[row][col];
                }
            }
        }
        return max;

    }

    //enchanced loop
    // static int maxvalue(int[][] arr ) {
    //     int max = Integer.MIN_VALUE;
    //     for (int[] element : arr) {

    //          if (element[col] > max) {
    //               max = element[col];
    //             }
    //         }
    //         return max;
    //     }

    
} 
