package DSA.Algorithms.Searching.BinarySearch.Problems;

public class RotationCount {
         public static void main(String[] args) {

                  int[] nums = { 3, 4, 5, 6, 7, 7, 8, 0, 1 };

                  int ans = CountRotation(nums);
                  System.out.println(ans);
         }

         static int CountRotation(int[] nums) {
                  int pivot = FindPivot(nums); // we will get pivot
                //  int pivotInDuplicate = FindPivotWithDuplicate(nums); // we will get pivot //use for duplcate arrayu

                  return pivot + 1; // this is a rotation count also called length of array from start to pivot

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
