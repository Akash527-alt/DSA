package basicsMaths;

import java.util.ArrayList;

public class RunProgram{
    public static void main(String[] args) {
        basicsMaths bm = new basicsMaths();
        System.out.println("\ndigits: "+bm.countDigit(1534236469));
        System.out.println("\nReverse: "+bm.reverse(15342369));
        if(bm.isPalindrome(-121)) System.out.println("\nPalindrome");
        else System.err.println("\nNot a palindrome");

        System.out.println("\nGreatest divisior factor of 14 and 52 is : "+bm.GCD(14,52));
        System.out.println("\nArmstrong: "+bm.isArmstrong(153));
        System.out.println("\n Divisor of 50: ");
        int[] result = bm.divisors(50);
        for (int num : result) {
            System.out.print(num+" ");
        }

        // prime
        if(bm.isPrime(92)){
            System.out.println("\n17 is prime");
        }
        else{
            System.out.println("\nnot prime");
        }
        
        
    }

   
    
}

class basicsMaths{
    public boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
          return true;

    }

    public int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i ==0){
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;

    }

    public boolean isArmstrong(int n) {
        int temp = n;
        int len = 0;
        // witout type Casting calculating the length
        // while(temp>0){
        //     len=len+1;
        //     temp=(int)temp/10;
        // }
        String str = String.valueOf(temp);  //type cast to String
        len = str.length();    // calculate length
        int sum=0;

        while(temp>0){
            int rem =(int) temp%10;
            sum = sum + (int) Math.pow(rem, len);
            temp=(int)temp/10;
        }
        if(n == sum) return true;
        return false;


    }

     public int GCD(int n1, int n2) {
        while(n1!=0){
            int rem = n2%n1;
            n2=n1;
            n1=rem;
           
        }
        return n2;

    }

    public boolean isPalindrome(int x) {
        int rev = 0;
        int original =x;
        while(x !=0){
            int rem = x%10;
            rev= rev*10+rem;
            x = (int)x/10;
        }
        if(rev==original){
            return true;
        }
        return false;
    }

     public   int countDigit(int n) {
        int count =0;
        while(n>0){
            count++;
            n =(int)n/10;
        }
        return count;
        
    }

    //reverse Integer
    public int reverse(int x) {
        int rev =0;
        while(x!=0){
            
            int rem = x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            } 
            rev = rev*10+rem;
            x =(int) x/10;
        }
        return rev;
    }



}
