package PatternProgram;

public class Pattern18 {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            for(char ch=(char) ('A'+(n-i-1));ch<='A'+(n-1);ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    
}
