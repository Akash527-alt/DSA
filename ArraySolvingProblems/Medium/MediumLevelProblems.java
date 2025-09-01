package ArraySolvingProblems.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MediumLevelProblems {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.print(s.majorityElement(arr));
//        for(int i:arr){
//            System.out.print(i +" ");
//        }



    }
}

 class Solution{
     public int majorityElement(int[] nums) {
         // moose voting algorithm
         int element =0;
         int count =0;
         for(int i=0;i<nums.length;i++){
             if(count ==0){
                 element = nums[i];
                 count =1;
             }
             else if(nums[i] == element){
                 count++;
             }
             else{
                 count--;
             }
         }

         int countTotal =0;
         for(int i=0;i<nums.length;i++){
             if(nums[i] == element){
                 countTotal++;
             }
         }
         if(countTotal > (nums.length/2)) return element;
         return -1;

         // better
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < nums.length; i++){
//             int value = map.getOrDefault(nums[i], 0);
//             map.put(nums[i] , value + 1);
//         }
//
//         for(Map.Entry<Integer,Integer> a :  map.entrySet()){
//             if(a.getValue() > (nums.length /2)){
//                 return a.getKey();
//             }
//         }
//         return -1;


         // brute solution
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             for(int j=0;i<nums.length;i++){
//                 if(nums[i]==nums[j]){
//                     count++;
//
//                 }
//                 if(count>nums.length/2){
//                     return nums[i];
//                 }
//             }
//
//         }
//         return 0;

     }

    public void sortZeroOneTwo(int[] nums) {


//        int low = 0;
//        int mid =0;
//        int high = nums.length -1;
//
//        while(mid<=high){
//            if(nums[mid] == 0) {
//                int temp = nums[low];
//                nums[low] = nums[mid];
//                nums[mid] = temp;
//                low++;
//                mid++;
//            }
//            else if(nums[mid] == 1){
//                mid++;
//            }
//            else{
//                int temp = nums[high];
//                nums[high] = nums[mid];
//                nums[mid] = temp;
//                high--;
//            }

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }
        for (int i = count0 + count1; i < nums.length; i++) {
            nums[i] = 2;
        }
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
