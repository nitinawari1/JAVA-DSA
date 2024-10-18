package DSA.Algorithms.Searching.BinarySearch;

public class BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = { -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
        int target = 1;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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