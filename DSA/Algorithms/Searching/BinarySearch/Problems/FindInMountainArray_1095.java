 // binarysearch //hard // leetcode_1095  // 03/07/2024
 // https://leetcode.com/problems/find-peak-element/
public class FindInmountainArray_1095{

         public static void main(String[] args) {
                  int[] mountainArr = { 0,1,2,3,4, 5, 3,2,1 };
                  int target = 3;
                  int ans = search(mountainArr, target);
                  System.out.println(ans);

         }

         static int search( int[] arr , int target  ){
                  int peak = peakIndexInMountainArray(arr) ;

                  int ans = orderAgnosticBs( arr , target , 0 , peak) ;

                  if(ans != -1){
                      return ans ;
                  }
                  else{
                      
                           //try search in desecending arry
                   return orderAgnosticBs(arr , target , peak + 1 , arr.length);
                   }

         }

         static int peakIndexInMountainArray(int[] mountainArr  ) {
                   
                  int start = 0;
                  int end = mountainArr.length - 1;

                  while (start < end) {
                           int mid = start + (end - start) / 2;
                           if (mountainArr[mid] > mountainArr[mid + 1]) {

                                    end = mid;
                           } else {
                                    // you are in asc part of mountainArray
                                    start = mid + 1; // because we know that mid+1 element > mid element
                           }
                  }
                  
                  return start;

      
  }

         static int orderAgnosticBs(int[] mountainArr, int target , int start , int end ) {
                
        
 
        boolean isAsce = mountainArr[start] < mountainArr[end]; // finding ascending or descending  //if else replacement 
        
        while (start<=end) {
            int mid = start + (end - start)/2;

            if (target == mountainArr[mid]) { //common senario 
                return mid;
            }
            if (isAsce) { 
                if(target < mountainArr[mid] ){ // if mountainArray is in ascending order then target will be in left side of mid if target is less than mid
                    end = mid - 1;
                }
                else{   
                      start = mid + 1;
                }
            }  
            else{ // if mountainArray is in descending order then target will be in right side of mid if target is less than mid
                if(target > mountainArr[mid]){
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
