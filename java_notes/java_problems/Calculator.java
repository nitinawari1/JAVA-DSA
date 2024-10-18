package problems;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
        int ans = 0;
       while (true) {
           
           System.out.println("please enter the oprator ");
           Scanner in = new  Scanner(System.in);
           char op = in.next().trim().charAt(0);

           if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%' ) {
            //input two number 
            Scanner num = new  Scanner(System.in);
            System.out.println("input first number");
            int num1 = num.nextInt();
            System.out.println("input second number");
            int num2 = num.nextInt();
            if (op == '+') {
                ans= num1 + num2;
            }
            if (op == '-') {
                ans= num1 - num2;
            }
            if (op == '*') {
                ans= num1 * num2;
            }
            if (op == '/') {
                
                if ( num2 != 0 ) {
                    ans= num1 / num2;
                }
            }
            if (op == '%') {
                ans= num1 % num2;
            }
           }
           else if (op == 'x'){
            break;
           }
           else{
            System.out.println("give valid opertor");
           }
        
           System.out.println(ans);
       }
     System.out.println("i am outside");
    }
}
