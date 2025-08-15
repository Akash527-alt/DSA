package PatternProgram;

public class Pattern14{

    public static void main(String[] args) {
        int n=5;
        System.out.println("Method 1");
        method1(n);
        System.out.println("method 2:");
        method2(n);
        
    }
    
    static void method1(int n){
        for(int i=1;i<=n;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void method2(int n){
        for(int i=1;i<=n;i++){
            for(int j=65;j<65+i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}