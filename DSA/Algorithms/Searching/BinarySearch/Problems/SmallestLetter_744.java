package DSA.Algorithms.Searching.BinarySearch.Problems;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
//1/06/2024 #leetcode744 # binarysearch 

//smallest letter
public class SmallestLetter_744 {
    public static void main(String[] args) {
        
      char[] char1 = {'c','f','j'};
    
     char ans =  nextGreatestLetter(char1 , 'd' );
    System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start  = 0 ;
       int end = letters.length - 1 ;         
           
           
           while (start <= end) {
               int  mid = start + (end - start)/2;
               
            //    if (target > letters[end] ) {   this will not working because he assume unknown char(that is not 
            //return letters[0];                   is  array)is always greater  than   
            //    }
              
               if(target < letters[mid]){
                   end = mid-1;
               }
               else {
                   start = mid + 1;
               } 
         
           }
           return letters[start % letters.length];//this will return smallest greater letter than target

   }
}
