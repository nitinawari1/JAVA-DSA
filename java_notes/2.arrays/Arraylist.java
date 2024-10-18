package arrays;
 import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //it use for storing lot of number as a array
        // we use it when we don't no how many element will be added
        ArrayList<Integer> list = new ArrayList<>(5);

        //adding element to array
        list.add(2);
        list.add(21);
        list.add(22);
        list.add(234);
        list.add(25);
        list.add(26);
        list.add(672);

        //remove element 
        list.remove(0); // 0th index number will be remove

        //editing array
        list.set(0,12); // seting 0th index with 12 
        
        //check avalable or not
        list.contains(12);

        // input
        for(int i = 0 ; i<5 ; i++){
            list.add(in.nextInt());
        }

        //output
        for(int i = 0 ; i<5 ; i++){
           System.out.println(list.get(i)); // pass index here , list[index] synatax not work here

           //Internal working of array
           //1.size is fixed internally 
           //2. let say arraylist fills by some amount
           //3. it will a new array list of let say , double the size
           //4. old element are copied in new one 
           //5. old one is remove
    }

}
}