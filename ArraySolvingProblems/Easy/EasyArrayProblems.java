package ArraySolvingProblems.Easy;

import java.util.ArrayList;

public class EasyArrayProblems {
    public static void main(String[] args) {
        ArrayProblems ap = new ArrayProblems();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(6);

        System.out.println(arr);
        boolean result = ap.isSorted(arr);

        if(result) System.out.println("yes");
        else System.out.println("no");

        

        
    }


    
    
}

class ArrayProblems{
    public boolean isSorted(ArrayList<Integer> nums) {

        // for(int i=0;i<nums.size();i++){
        //     for(int j=i+1;j<nums.size();j++){
        //         if(nums.get(j)<nums.get(i)){
        //             return false;
        //         }

        //     }
        // }
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)<nums.get(i-1)){
                return false;
            }
        }
        return true;
        
    }


    public int secondLargestElement2(int[] nums){
        int largest = nums[0];
        int secondLargest = -1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest ){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] < largest && nums[i]>secondLargest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public int secondLargestElement(int[] nums) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int secondmx =-1;
        for(int j=0;j<nums.length;j++){
            if(nums[j] > secondmx && nums[j] != max) {
                    secondmx = nums[j];
            }
        }
        return secondmx;
        
    }

    public  int largestElement(int[] nums) {
        int max= nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        return max;

    }

            
        
    
}
