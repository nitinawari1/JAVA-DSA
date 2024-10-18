import java.util.Arrays;
import java.util.Scanner;

public class function_method {
    public static void main(String[] args) {
    //     sum(); // we can call function


        // String messege =  greting();// you will get return value
        // System.out.println(messege);



        int ans1 =sum1(1, 2); // passing argument  to function & also getting return value by function
        System.out.println(ans1);


    //    String receivegre = greteeng("hanumanji"); //passing argument as a string and also geting whole greting as return value
    //    System.out.println(receivegre);


        String naam = "hanumanji";
        changename(naam);
        System.out.println(naam);

        int[] arr = {1,2,3,4,5};
        change(arr); // passing
        System.out.println(Arrays.toString(arr));
    }

   private static void change(int[] num) { // it  is pass by the copy of value of refence
       num[0] = 99; // it will change original array because it modifing array  not creating new one

    }
    //the difference in behavior is due to the immutability of String and the mutability of arrays in Java. When you pass an object like an array to a method, changes made to the object inside the method are reflected outside the method because you are working with the same object.

 private static void changename(String name) { 
        name = "ramji"; // it not change original variable it will create new one 
        // System.out.println(naaam);
    }

    // Example 1 - sum two num function 
    static void sum(){
        Scanner input = new Scanner(System.in);
     int num1 = input.nextInt();
     int num2 = input.nextInt();
     int ans = num1 + num2;
     System.out.println(ans);
    }

    // Example 2 return function
    static String greting(){
        String greeting = "om bhagawan baba Hanumanji ॐ भगवान बाबा हनुमांजी";
        return greeting; // send greting value to call function
    } 

    // Example 3 argument function
    static int sum1( int num1 , int num2 ){
        // Scanner input = new Scanner(System.in);
    //  int num1 = input.nextInt();
    //  int num2 = input.nextInt();
     int ans = num1 + num2;
     System.out.println(ans);
     return ans;
    } 


    // Example 4
    static String greteeng(String name){ // argument that receving from call 
        String greeting = "om bhagawan baba " + name  + "ॐ भगवान बाबा हनुमांजी"; // using argument
        return greeting; // send greting value to call function
    } 



}
