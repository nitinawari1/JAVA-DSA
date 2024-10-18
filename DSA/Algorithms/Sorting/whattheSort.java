

public class whattheSort {
         public static void main(String[] args) {
                  int arr[] = {-1,0,1,1,2,3,4,4,5,6,7,8};
                 boolean ans  = isSorted(arr);
                 System.out.println(ans);

         }
         static boolean isSorted(int[] arr){
                int  firstValue = arr[0];
                  for (int i = 0; i < arr.length; i++) {
                           
                           if (firstValue > arr[i]) {
                                    return false ;
                           }
                          firstValue = arr[i] ;
                  }
                  return true;
         }
}
