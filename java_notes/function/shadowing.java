
public class shadowing {
         static int a = 30;// global variable // accesible from anywhere  //this will shadow at line number 9
         
         public static void main(String[] args) {
                  int a; 
                 // System.out.println(a); // it will this error because we cannot use variable before initializing it 
                  a = 29; // this will shadow the global variable at line number 4
                  System.out.println(a); // 29
                                    
                 sum();
                  
         
         }
         static void sum(){
                  System.out.println(a); // 30  //becuase a=29 is only  avalaible in local scope
                  int a = 50 ; // this will shadow the global variable at line number 4 and local variable at line number 9
                  System.out.println(a); //50
                
                  // if we want to access global variable at line number 9 then we have to use "shadowing" keyword 
                  System.out.println(shadowing.a); //30        
         }

}
