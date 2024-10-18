package arrays.arrays_problem;

public class Max_value_in_array {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,34,53,64};

        System.out.println(max(arr));
        System.out.println(maxrange(arr , 2 ,6));
    }

   //find max value in array
     static int max(int[] arr) {
       int maxvalue = arr[0];
       for (int i = 0; i < arr.length; i++) {
            if (maxvalue<arr[i]) {
                maxvalue = arr[i];
            }       
       }
       return maxvalue;
    }

//find max value in the range of array
    static int maxrange(int[] arr ,  int start , int end) {
        int maxvalue = arr[0];
        for (int i = start; i < end; i++) {
             if (maxvalue<arr[i]) {
                 maxvalue = arr[i];
             }       
        }
        return maxvalue;
     }
 
}
