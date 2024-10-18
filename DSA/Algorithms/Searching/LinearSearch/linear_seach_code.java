
public class linear_seach_code {

                           
                  // example
                  public static void main(String[] args) {
                      // Example usage
                      int[] arr = {3, 5, 2, 4, 9};
                      int target = 4;
                      int result = linearSearch(arr, target);
              
                      if (result != -1) {
                          System.out.println("Element found at index " + result);
                      } else {
                          System.out.println("Element not found in the list");
                      }
                  }
              
                  //code for linear search   
                  static int linearSearch(int[] arr, int target) {
                           
                           if (arr.length == 0 ) {
                                    return -1;
                           }

                           // Iterate through the array
                           for (int index = 0; index < arr.length; index++) {
                               // Compare each element with the target
                               int element  = arr[index];
                               if (arr[index] == target) {
                                   // Return the index if the target is found
                                   return index;
                               }
                           }
                           // Return -1 if the target is not found in the array
                           return -1;
                       }



         // inechnad for each loop  if we want to print target not the index
         //search the target and return the element 
         static int linersearch2(){

                  if (arr.length == 0 ) {
                           return -1;
                  }

                  for (int element : arr) {
                           if (element == target) {
                                    return element;
                           }
                           
                  }
                  return Integer.MAX_VALUE;
         }

         //search the target and return the true or false
         static int linersearch3(){
                  static boolean linersearch2(){
                           
                  if (arr.length == 0 ) {
                           return -1;
                  }
                  
                  for (int element : arr) {
                           if (element == target) {
                                    return element;
                           }
                           
                  }
                  return Integer.MAX_VALUE;
         }
         
}
}
