import java.lang.reflect.Array;
import java.util.Arrays;

public class Search_In_String {
    public static void main(String[] args) {

            
        String name = "nitin";
        char target = 'n';
        boolean ans = linersearch(name, target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
        // Q.2
        char target1 = 'd';
        boolean ans1 = linersearch1(name, target );
        System.out.println(ans1);
    }
    


    // searching target inside the string using charat
    static boolean linersearch(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.length() == 0) return false;

            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    // foreach using tocharArray
    static boolean linersearch1(String str, char target) {
        
            for (char ch : str.toCharArray()) {
                if (str.length() == 0 ) return false;
                if (ch == target)return true;
                }
        return false;
    }

}
