

import java.util.Scanner;

public class prime_number {
         
         public static void main(String[] args) {
                 
                  Scanner input = new Scanner(System.in);
                  int num = input.nextInt();
                  boolean ans = isprime(num);
                  System.out.println(ans); // true or false

         }
         static boolean isprime(int num){
                  
                  if(num <= 1){
                           return false;
                   }
                    int c = 2;
                    while(c*c <= num ){
                           if(num % c == 0){
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
