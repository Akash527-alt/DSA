package PatternProgram;

public class Pattern10 {

    public static void main(String[] args) {
        int n=5;
        System.out.println("Method 1");
        method1(n);
        System.out.println("Method 2");
        method2(n);
        
    }

    public static void method1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void method2(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if (i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
    
}
