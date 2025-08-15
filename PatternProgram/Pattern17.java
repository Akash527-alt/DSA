package PatternProgram;

public class Pattern17{
    public static void main(String[] args) {
        int n=5;
        
        for(int i=0;i<n;i++){
            // spaces
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }

            // characters
            char ch='A';

            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=(2*i+1)/2) ch++;
                else ch--;

            }

            // spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }



            System.out.println();

        }


    }
}