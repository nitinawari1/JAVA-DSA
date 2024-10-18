import java.util.*;
public class Typeconversion {
     public static void main(String[] args) {
        
        // rule of automatic type conversion
        // 1. both should compatible with each other like float  and integer
        // 2 . destination type should be greater than source type  like we convert interger into float but we cannot convert float into integer for that we have typecasting 

        // automatic type conversion 
        //int into float
      Scanner input  = new Scanner(System.in);
        float num = input.nextInt();
        System.out.println(num);
        
        // typecasting
        int num1 =(int) (67.58f); // it will compress number to 67 and print it as interger
        System.out.println(num1); 

        //automatic type  promotion  in expressions
        int a = 257;
        byte b = (byte) (a) ; // 257 % 256  = 1  // byte able to store only 256 but we giving 257 that's why i only store remainder 
        System.out.println(b);

      byte c = 40;  //here we doing 40*50 that equal to 2000 byte . but byte only able to store 256 that's why for calculation it converting into integer 
      byte d = 50;
      byte e = 100;
      int f = c * d / e; 
      System.out.println(f);

      // byte ab = 50 ;
      //  ab = ab*2;   we cannot do this becuase byte not able to store intger 
      byte ab = 50 ;
      
      int number  ='a'; // it will give the ascii value of a 
      System.out.println(number);

      // int * double = double 
      int A = 20;
      double B = 3;
      double C = A/B;
      System.out.println(C);
    }
}
