package ArraySolvingProblems.Easy;

import java.util.HashMap;

public class MediumLevelProblems {
    public static void main(String[] args) {

    }
}

class Solution{

    public void sortZeroOneTwo(int[] nums) {

    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = result[1] = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int num2 = target - num;
            if(map.containsKey(num2)){
                result[0] = map.get(num2);
                result[1] = i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;

//        int[] result = new int[2];
//        result[0] = result[1] = -1;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if((nums[i] + nums[j]) == target){
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;

    }

}
