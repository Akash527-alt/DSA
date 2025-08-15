package PatternProgram;

public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        method1(n);
        method2(n);
        
    }

    static void method1(int n){
        for(int i=n;i>0;i--){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void method2(int n){
        for(int i=n;i>0;i--){
            for(int j=65;j<=64+i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    
}
