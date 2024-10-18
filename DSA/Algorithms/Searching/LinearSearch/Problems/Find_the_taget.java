package DSA.Algorithms.Searching.LinearSearch.Problems;

public class Find_the_taget {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 50;
        //Q.1
        int ans = linersearch(arr, target );
        System.out.println(ans);

        //Q.2
        int ans1 = linersearch1(arr, target );
        System.out.println(ans1);

    }


    //Q.1 find the target value arr and return it index
    static int linersearch(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
        int element = arr[i];
            if (arr.length == 0)return -1;
            if (element == target) {
          return i;                
            }
        }
        return -1;
    }

    //Q.2 find the target value arr and return it the element
    static int linersearch1(int[] arr , int target){
        for (int element : arr) {
        if (arr.length == 0)return Integer.MAX_VALUE;
            if (element == target) {
          return element;                
            }
        }
        return  Integer.MAX_VALUE;
    }
}
