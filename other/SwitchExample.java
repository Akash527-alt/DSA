import java.util.Scanner;

class Solution1 {
    public void whichWeekDay(int day) {
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
            
        }
    }
}

public class SwitchExample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to print days: ");
        System.out.println("1. Monday ");
        System.out.println("2. Tuesday ");
        System.out.println("3. Wednesday ");
        System.out.println("4. Thrusday");
        System.out.println("5. Friday ");
        System.out.println("6. Saturday ");
        System.out.println("7. Sunday ");

        int days = scan.nextInt();

        Solution1 s = new Solution1();
        s.whichWeekDay(days);

    }
    
}
