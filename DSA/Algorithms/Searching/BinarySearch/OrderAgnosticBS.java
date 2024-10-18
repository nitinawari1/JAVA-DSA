package DSA.Algorithms.Searching.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9};
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4};
       int target = 4;
      int ans =orderAgnosticBs(arr,target);
      System.out.println(ans);
        
    }
    static int orderAgnosticBs(int[] arr, int target){
        int start  = 0 ;
        int end = arr.length - 1 ;
        
 
        boolean isAsce = arr[start] < arr[end]; // finding ascending or descending  //if else replacement 
        
        while (start<=end) {
            int mid = start + (end - start)/2;

            if (target == arr[mid]) { //common senario 
                return mid;
            }
            if (isAsce) { 
                if(target < arr[mid] ){ // if array is in ascending order then target will be in left side of mid if target is less than mid
                    end = mid - 1;
                }
                else{   
                      start = mid + 1;
                }
            }  
            else{ // if array is in descending order then target will be in right side of mid if target is less than mid
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }          
        }
     
        return -1;

    }

}
