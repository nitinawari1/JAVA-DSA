package problems;

import java.util.Scanner;

public class Armstrong_number {
     public static void main(String[] args) {
        
    //     Scanner input = new Scanner(System.in);
    //    int n =input.nextInt();

    //    boolean ans = isarmstrong(n);
    //    System.out.println(ans);
    
    // printing all 3 digit armstrong number 
    for (int i=100 ; i <10000; i++){
        if (isarmstrong(i)) {
            System.out.println(i);
        }

    }
        
    }
    static boolean isarmstrong(int n){
        int original = n; // it will be only useable for comparing in last with new value at line 32
        int sum = 0;
        while (n>0) {
           int  rem = n%10; // find reeminder  or for selecting single value from number
            n = n / 10; //update the value of n like first is 153 then 15  for calcuate remainder
            sum = sum + rem*rem*rem; // sum of cube of each digit
        }

            return sum == original; // if sum is equal to original number then it will return true otherwise false

        }

          
        
    }


