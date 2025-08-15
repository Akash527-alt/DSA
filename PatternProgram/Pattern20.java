package PatternProgram;

public class Pattern20 {
    public static void main(String[] args) {
        int n=5;
        int spaces = 2*n-2;
        for(int i=0;i<n*2-1;i++){
            int stars = i+1;
            if(i>=n) stars = 2*n-i-1;
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            
            // spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }

            for(int j=0;j<stars;j++){
                System.out.print("*");
            }

            // stars
            
            System.out.println();
            if(i<n-1) spaces -= 2;
            else spaces += 2;
        }
    }
    
}
