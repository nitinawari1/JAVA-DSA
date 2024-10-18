package problems;

public class reverse_the_number {
    public static void main(String[] args) {
       int  n = 1234567;
        int ans= 0;

       while (n>0) {
        int rem = n%10;
        ans = ans *10 + rem;
        n /= 10;    
       }
       System.out.println(ans);

    }
}
