package PatternProgram;

public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        int start = 1;
        for(int i =1;i<=n;i++){
            if(i%2 ==0) start = 0;
            else start = 1;

            for(int j=0;j<i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();

        }
    }
    
}
