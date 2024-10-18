package DSA.Algorithms.Searching.BinarySearch.Problems;

public class RotatedSortedArrayWithDuplicates {
         public static void main(String[] args) {

                  int[] nums = { 3, 3, 4, 5, 5, 6, 6, 6, 7, 8, 8, 0, 0, 1, 1 };

                  int ans = search(nums);
                  System.out.println(ans);

         }

         static int search(int[] nums) {
                  int pivot = FindPivotWithDuplicate(nums); // we will get pivot
                  return pivot;

         }

         static int FindPivotWithDuplicate(int[] nums) {
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

                           // if element at middle , start and end are equal then just skip the duplicates
                           if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                                    // skip the duplicates
                                    // NOTE:what if these element at start andd end were the pivot ?

                                    // check if start is pivot
                                    if (nums[start] > nums[start + 1]) {
                                             return start;
                                    }
                                    ;
                                    start++; // ignoring a duplicate by pushing start to next element
                                    // if we still doing start++ it will not change or answer because all elment in
                                    // array before start and after end are small so they never be a pivot

                                    // check if end is pivot // end never be a pivot
                                    if (nums[end] < nums[end - 1]) {
                                             return end;
                                    }
                                    ;
                                    end--;
                           } else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                                    start = mid + 1;

                           } else {
                                    end = mid - 1;
                           }

                  }
                  return -1;
         }
}
