package DSA.Algorithms.Searching.BinarySearch.Problems;
// 1/06/2024 monday #binarysearch # gfg 
public class InfiniteArray {
         public static void main(String[] args) {
                  
                  int[] arr = {3,4,5,7,8,12,34,56,78,90,123,456,789,12345,677899};
                  int target  = ;
                  int ans = infiniteArray(arr , target);
                  System.out.println(ans);


         }
         static int infiniteArray(int[] arr , int target){
                  // first find the range
                  // start with a box of size 2 

                 int start = 0;
                  int end = 1;

                  while (target > arr[end]) { //while target is bigger than end 
                           int temp =end + 1 ;  // this is a new start  currently stronging in temp 
                           // double the box value
                           // end = previous_end + sizeofbox*2
                           end = end + (end - start + 1 ) * 2; // this is forrmula to find length of subarray
                           // start = previous_end + 1
                           start = temp;
                           
                  }
                  return BinarySearch( arr, target , start, end);
         }
                  
         
         static int BinarySearch(int[] arr, int target , int start , int end) {
             
          
                  while (start <= end) {
                      // int mid = (end + start)/2 // this calculation may be wrong because it can
                      // cause integer overflow means interger data type will exist it storing limit
                      // and it will give wrong answer
          
                      int mid = start + (end - start) / 2;// this is the correct calculation to avoid integer overflow
          
                      if (target < arr[mid]) {
                          end = mid - 1;
                      } else if (target > arr[mid]) {
                          start = mid + 1;
          
                      } else {
          
                          return mid;
                      }
                  }
                  return -1;
              }
}
