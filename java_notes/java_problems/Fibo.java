import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int first_value =0; 
        int second_value = 1;
        int nth = 2;
        //first apporch
        // for(int i = 2 ;i <= input ; i ++){
        //      fibo = first_value + second_value ;
        //     if (fibo >= second_value ){
        //         first_value = second_value;
        //             second_value = fibo;
        //     }
        // }
        // System.out.println(fibo);

        //second approch
        while(nth <= input){
            int temp =second_value;
            second_value = second_value+ first_value;
            first_value = temp;
            nth++;


        }
        System.out.println(second_value);
    }
}
