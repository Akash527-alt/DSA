package PatternProgram;
import java.util.Scanner;
public class reversePeramid {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in) ;
        System.out.println("Enter row you want to print");
        int n = scan.nextInt();
        PrintPatter pp = new PrintPatter();
        pp.peramid(n);
        scan.close();
    }
    
}

class PrintPatter{
    public void peramid(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<(2*n)-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }


            System.out.println();
        }


    }


}
