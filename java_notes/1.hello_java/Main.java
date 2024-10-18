
// Package Declaration:
// At the beginning of a Java source file, you can include a package declaration to specify the package to which the class belongs. This declaration is optional, but it's a good practice to use packages for organizing your code.
import java.util.*;

public class Main {
    public static void Main(String[] args) {

    //output
        System.out.println("hello world");
        System.out.print("println use for line breaking\n");
        // System.out.println(args[0]); // print value of zeroth index from above array .  we can give at executing time

     // taking input 
        Scanner input = new Scanner (System.in); //intiallizing input taker
         String name = input.next();// take siingle word
         int name1 = input.nextInt();// take integer
         String name2 = input.nextLine();// take sentence
        System.out.println(name);
    }
}
