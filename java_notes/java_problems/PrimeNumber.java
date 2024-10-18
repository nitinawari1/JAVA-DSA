package problems;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       int n =input.nextInt();
        boolean value =isprime(n);
        System.out.println(value);
        
    }

    private static boolean isprime(int n) {
        
        if (n <= 1) {
            return false;     
        }
        int c= 2;
        while (c*c <= n ) {
           if (n % c == 0) {
               return false;
           }
           c++;
        }
        if ( c*c > n) {
            return true;
        }
        return false;



    }


}
