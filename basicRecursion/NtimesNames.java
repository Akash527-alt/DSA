package basicRecursion;

import java.util.Scanner;

public class NtimesNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter times to print name:  ");
        int times = scan.nextInt();
        printName(1,times);

        
    }

    public static void printName(int i,int n){
        if(i>n) return;
        System.out.println("Akash");
        
        printName(i+1,n);
    }

}
