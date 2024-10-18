package DSA.Algorithms.Searching.LinearSearch.Problems;

 class Max_wealth {
    public static void main(String[] args) {
        int[][] accounts = { //3*3
            {1,23,4}, // 0th index
            {2,4,5}, //1st index 
            {6,7,99} // 2nd index
    } ;
    System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        
        // for (int row = 0 ; row < accounts.length ; row++ ){
        //     int balance = 0; // adding balance of single row // it will reset to zero for  next row;
            
        //     for(int col = 0; col < accounts[row].length; col++){
        //       balance += accounts[row][col];     
        //     }
        //     //now we have sum of accounts of person 
        //     //check with other account balance with one is highest
        //     if (balance > max) {
        //         max = balance;
        //       }
        // }

        for (int[] row : accounts) {
            int balance = 0; // adding balance of single row // it will reset to zero for  next row;
            for(int col:  row){
                balance += col;

            }
            if (balance> max) {
                max = balance;            
            }
        }
        return max;
    }
}
