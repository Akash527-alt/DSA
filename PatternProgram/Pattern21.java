package PatternProgram;

public class Pattern21 {
    public static void main(String[] args) {
        int n=4;
        System.out.println("mehtod 1");
        method1(n);
        System.out.println("method 2");
        method2(n);
        
    }

    public static void method2(int n){
        for(int i=0;i<n;i++)    {
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void method1(int n){
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==3){
                    System.out.print("*");
                }
                else if((i==1 && (j==1 || j==2)) || (i==2 && (j==1 || j==2)) ){
                    System.out.print(" ");
                }
                else if((i==1 && j==3) || (i==2 && j==3) ){
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
    
}
