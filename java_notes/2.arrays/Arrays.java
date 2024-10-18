package arrays;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        // syntax 
        // datatypes[] variable_name = new datatype[size]
        int[] arr = new int[5];
        // or directly
        int[] arr1 = {1,23,43,5,546};

        //string type
         String[] names = new String[5]; 
         // intially it will be null 
         System.out.println(names[1]); // printing single value
        
        
        //memory allocation
          int[] arr2; //declaration of Array . arr2 is getting defined in the stack memory
          arr2 = new int[10]; // initialisation : actually here object is being created in the memory (heap).  
            //instially whole array index hold value zero


        // string is a object in java so it stored in heap memory 
        //example we have  5 element in array there refence variable(not variable name ) stored in heap and then they we point to actual data that stored in heap anywhere 
    

    }

  
}
