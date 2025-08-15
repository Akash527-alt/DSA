package PatternProgram;
public class peramid {
    public static void main(String[] args){
        int n=20;
         for(int i=0;i<n;i++){
            // for(int k=1;k<i;k++){
            //     System.out.print("P");
            // }

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
    
}
