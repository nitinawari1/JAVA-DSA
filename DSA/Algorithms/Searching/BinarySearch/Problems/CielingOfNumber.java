package DSA.Algorithms.Searching.BinarySearch.Problems;
//1.figure out the target element
//2. figure out numbers equal or greater than target.
//3.find smallest one 




//target - 15 
//       s  m  e
//       14 16 18  first step  then target is smaller than mid so --> end - 1
//       14 16 16  then  --> end - 1
//       14 14 14  then --> start + 1
//       16 14 14   now while loop break because start > end 
 // answer dosen't  lie between start and end , hence we have to find next greater element that is start because now  start is greater elemnt than target .

 // before breaking while loop 
    //  start  target  end
    //after  breaking while loop 
    //  end    target  start        // now start is first smallest number than target . so start is a answer


//Q.1 return the smallest  number >= target
public class CielingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,11,23,54,67,87,93};
        int target = 33;
        int ans =  CielingNumber(arr, target);
        System.out.println(ans); 
    }


    static int CielingNumber(int[] arr , int target ){

        int start  = 0 ;
        int end = arr.length - 1 ;         
            
            
        if (target > arr[end] ) {
            return -1; // if target is greater than last element of array then return -1
        }
            while (start <= end) {
                int  mid = start + (end - start)/2;
                
                // if (target == 0) {
                //     return 0;                    
                // }
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                } 
                
                else  {
                    return mid;//returning index
                }
                
            }

            return start; // returning index
    }
}
          


