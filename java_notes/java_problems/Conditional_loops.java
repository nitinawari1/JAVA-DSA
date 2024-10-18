import java.util.Scanner;

public class Conditional_loops {
    public static void main(String[] args) {
        // int count=0;
        // // for(count=0; count < 20 ; count++ ){
        // //     System.out.println(count);
        // // }
        // while (count<5) {
        //     System.out.println(count);
            // count++;
        // }


    // // largest number
    //  Scanner  input = new Scanner(System.in);
    //  int a = input.nextInt();
    //  int b = input.nextInt();
    //  int c = input.nextInt();
    //  int max = a;

    //  if (b>max) {
    //     max = b;
    //  }
    //  else if (c > max) {
    //     max = c;
    //  }
    //  System.out.println(max);

    //  //extra proprerties 
    //       int maxi = Math.max(max, b);// find max value between them

    //     Scanner ch = new Scanner(System.in);
    //     char alpha = ch.next().trim().charAt(0); // this method give first alphabet of word

    //     // trim() cut extra spacess

    //     String word = "hello";
    //     System.out.println(word.charAt(3));//print only one char with this index no.

        // Scanner in1 = new Scanner(System.in);
        // String fruit1 = in1.next();
        // System.out.println(fruit1.equals("mango")); // check string equal or not ;
        

        // alphabet check case 

        // Scanner char1 = new Scanner(System.in);
        // char ap = char1.next().charAt(0);
        // if (ap >= 'a' && ap <= 'z') {  // here for comparing char converting into the ascii value automatically  
        //     System.out.println("lowercase");
        // } else {
        //     System.out.println("uppercase");
        // }


    //switch statement

    Scanner in = new Scanner(System.in);
    // String fruit = in.next();

    // switch (fruit) {
    //     case "mango":
    //         System.out.println("summer fruit");
    //         break;
    //     case "orange" :
    //         System.out.println("nagpur city");
    //         break;
    //     case "apple" :
    //         System.out.println("kasmir");
    //         break;
    //     default:
    //         System.out.println("give valid fruit");
    //         break;
    // }


    //new syntax
    // we dont have to use  break;
    // switch (fruit) {
    //     case "mango" ->  System.out.println("all india");   
    //     case "orange" ->  System.out.println("nagpur");   
    //     case "grapes" ->  System.out.println("maharasthra");   
    //     case "apple" -> {  // by this we can add multiple lines of code 
    //         System.out.println("kasmir");
    //     }
    //     default -> System.out.println("plz enter the valid fruit");
           
    // }

    // multiple case in one case
    // int day = in.nextInt();
    // switch (day) {
    // case 1,2,3,4,5 -> System.out.println("weekdays");
    // case 6,7 -> System.out.println("weekend");
    // }

    int empid = in.nextInt();
    String deparment = in.next();
    //nested switch cases
    switch (empid) {
        case 1 -> System.out.println("nitin awri");
        case 2 -> System.out.println("sagar dongare");
        case 3 -> {
            System.out.println("uday ghute");
            switch (deparment) {
                case "IT" -> System.out.println("software");
                case "MBA "-> System.out.println("managment");
                case "CA" -> System.out.println("finance");
                default -> System.out.println("give valid input");
            }
            }
        default -> System.out.println("give valid input");
    } 
    }

    }

