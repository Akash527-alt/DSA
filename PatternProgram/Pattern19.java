package PatternProgram;

public class Pattern19 {
    public static void main(String[] args) {
        int n=5;
        // method1(n);
        // System.out.println();
        // method2(n);
        // method3();

        
        
        
    }
    // methods 3 yet to be complete using if else condition
    public static void method3(){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==9 ){
                    System.out.print("*");
                }
                else if(i==1 && (j !=4)){
                    System.out.print("*");
                }
                


            }

            System.out.println();
        }
        
    }

    public static void method1(int n){
        int iniS=8;
        for(int i=0;i<n;i++){

            // stars
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            // Stars
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }

            // spaces
            for (int j=0;j<iniS;j++){
                System.out.print(" ");
            }

            // Stars
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }

            iniS = iniS-2;
            System.out.println();
        }
    }

    public static void method2(int n){
        int iniS = 7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }

            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }

            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }

            for(int j=1;j<iniS;j++){
                System.out.print(" ");
            }

            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }

            iniS = iniS-2;
            System.out.println();
        }
    }

    

    
}

