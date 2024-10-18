package DSA.Algorithms.Searching.LinearSearch.Problems;

class Solution {
    public static void main(String[] args) {
        int[] num = { 12, 345, 2, 6, 7896, };
        System.out.println(findNumbers(num));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {

        int numberofdigit = digit(num);

        return numberofdigit % 2 == 0;

    }


    static int digit(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
       return (int) (Math.log10(num)) + 1;
    }
    // static int digit(int num) {
    //     if (num < 0) {
    //         num = num * -1;
    //     }

    //     if (num == 0) {
    //         return 1;
    //     }
    //     int count = 0;

    //     while (num > 0) {
    //         count++;
    //         num = num / 10;
    //     }
    //     return count;
    // }
}