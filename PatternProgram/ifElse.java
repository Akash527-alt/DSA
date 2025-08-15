package PatternProgram;
class Solution {
    public void studentGrade(int marks) {
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=70){
            System.out.println("Grade B");
        }else if(marks>=50){
            System.out.println("Grade C");
        }else if(marks>=35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}

public class ifElse{
    public static void main(String[] args){
        Solution s = new Solution();
        s.studentGrade(14);
    }
}