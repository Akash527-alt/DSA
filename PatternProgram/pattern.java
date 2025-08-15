package PatternProgram;
public class pattern {
    public static void main(String[] args){
        int n=3;
        int num=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j+" ");
                
            }
            num=num-1;
            System.out.println();
        }
    }
}
