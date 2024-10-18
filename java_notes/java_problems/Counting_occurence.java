package problems;

public class Counting_occurence {
    public static void main(String[] args) {
    //    q. find 5 in number how manytime occur
        int n = 555959593;

        int count = 0;
        while (n>0) {
            int rem = n % 10 ;
            if(rem == 5 ){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}

// solving approch 
// if we divide any number by 10 then reminder will be last value of that number  
//  by this approch we can itrate on whole value one by one 