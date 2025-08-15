package PatternProgram;

public class pattern22 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top =i;
                int left =j;
                int bottom =(2*n-2)-i;
                int right = (2*n-2)-j;

                int minDist=Math.min(Math.min(top,bottom),Math.min(left,right));
                int value = n-minDist;

                System.out.print(value + " ");
                
            }
            System.out.println();
        }
    }
    
}
