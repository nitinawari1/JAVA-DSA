package DSA.Algorithms.Searching.BinarySearch.Problems;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,6,11,23,54,67,87,93};
        int target = 1;
        int ans =  CielingNumber(arr, target);
        System.out.println(ans);
    }

//Q.1 return the greatest  number <= target
    static int CielingNumber(int[] arr , int target ){

        int start  = 0 ;
        int end = arr.length - 1 ;         
            
            if(target < arr[start]){
                return -1;
            }

            while (start <= end) {
                int  mid = start + (end - start)/2;
                
                
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

            return end;
        }

}
