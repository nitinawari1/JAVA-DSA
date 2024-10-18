package DSA.Algorithms.Searching.LinearSearch.Problems;

public class Search_in_the_range {
    public static void main(String[] args) {
       
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 1;
        int ans = linersearch(arr, target , 2 , 7);
         System.out.println(ans);

    }

    //Q,1 search the element between index 3 to 7
    static int linersearch(int[] arr , int target , int start , int end){
        for (int i = start; i <= end; i++) {
        int element = arr[i];
            if (arr.length == 0)return -1;
            if (element == target) {
          return i;                
            } 
        }
        return -1;
    }
}
