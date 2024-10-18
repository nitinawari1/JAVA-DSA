package DSA.Algorithms.Searching.BinarySearch.Problems;

public class RotatedSortedArray {
    public static void main(String[] args) {

        int[] nums = { 3, 4, 5, 6, 7, 8, 0, 1 };
        int target = 0;

        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = FindPivot(nums); // we will get pivot

        if (pivot == -1) { // if pivot not found thats mean array is not rotated then do simple binary
                           // search
            return BinarySearch(nums, target, 0, nums.length - 1);
        }

        // now search in two ranges left and right from pivot and both are ascending

            if (nums[pivot] == target) {
                return pivot;
            }

   
        if (target >= nums[0]) {
            return  BinarySearch(nums, target, 0, pivot - 1 );
        } else {
            return BinarySearch(nums, target, pivot+1, nums.length - 1);
        }

    }

    static int FindPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;

            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] nums, int target, int start, int end) {
        // int start = 0;
        // int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;// this is the correct calculation to avoid integer overflow

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {

                return mid;
            }
        }
        return -1;
    }

}
