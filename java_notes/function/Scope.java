import java.util.*;

public class Scope {
  static  int a = 30;// global variable  // this will be shadowed if any other block  redefine it 
    public static void main(String[] args) {
        // a=29; wee can modify global variable
        System.out.println(a); // 30    
        //block scope  or loop scope

        //1. variable declared outside the block can be use or modify in the inside of block but not redefine in the block

        // 2. variable that declared in the inside the block cannot be use outside the block but we can redefine outside the block
         int a = 10;
        System.out.println(a); // 10 
    
        {
   
         //int a = 20; // if variable is already define outside the block we cannot redefine in block
         a = 20 ; //  but we can modify  it  and  this value reflected to orginal one 
          System.out.println(a); //20 // we can also use inside the scope
         int b = 20 ; // but if we define variable inside this block we cannot modify or use outside of this scope 
        }

        int b = 20 ; //we can installize again outside of scope 
        // b=30;  // this wrong we cannot use outside of block
        funcscope();
        varargs(1,2,3,45,6,67,4,4,448); // passing arguments it will sperd
        fun(1,2, "nitn" , "kartik " , "ajay" , "vijay" ,"samir"); // passing multiple arguments
    }
    
    static void funcscope(){
        System.out.println("global " + a); //30
        int a = 55;  // this is only usable inside this method 
        System.out.println(a); //55
    }   


    //MULTIPLE ARGUMENTS
    static void fun(int num , int num2 , String ...v){

    }
        
    
    //vararges
    static void varargs(int ...v) { // we can get unlimited arguments and store them as a array
        System.out.println(Arrays.toString(v));
    }
}
