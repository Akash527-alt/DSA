package ArrayProblems.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class MediumLevelProblems {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println("The maximum profit: " + Arrays.toString(s.rearrangeArray(arr)));




    }
}

 class Solution{

     public int[] rearrangeArray(int[] nums) {
         int[] arr = new int[nums.length];
         int posIndex = 0;
         int negIndex = 1;
         for(int i=0;i<nums.length;i++){
             if(nums[i]>0){
                 arr[posIndex] = nums[i];
                 posIndex += 2;
             }
             else{
                 arr[negIndex] = nums[i];
                 negIndex += 2;
             }
         }
         return arr;

//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();
//
//         for(int i =0;i<nums.length;i++){
//             if(nums[i]>0) pos.add(nums[i]);
//             else neg.add(nums[i]);
//         }
//
//         for(int i=0;i<(nums.length)/2;i++){
//             nums[2 * i] = pos.get(i);
//             nums[2 * i + 1] = neg.get(i);
//         }
//         return nums;

     }

     public int maxProfit(int[] prices) {

         int minPrice = Integer.MAX_VALUE;
         int profit  =0;
         for(int i=0;i<prices.length;i++){
             if(minPrice>prices[i]){
                 minPrice = prices[i];
             }
             else if((prices[i] - minPrice > profit)){
                 profit = prices[i] - minPrice;
             }
         }
         return profit;
//         int max =0;
//         for(int i=0;i<prices.length;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 if(prices[i]<prices[j]){
//                     max = Math.max(max, prices[j] - prices[i]);
//                 }
//             }
//         }
//
//         return max;

     }

     public int maxSubArray(int[] nums) {
         if (nums.length == 0) return nums[0];
         int max = Integer.MIN_VALUE;
         int sum = 0;

         int start = 0;
         int arrStart = -1;
         int arrEnd = -1;
         for (int i = 0; i < nums.length; i++) {
             sum += nums[i];

             if (sum == 0) start = i;
             if (max < sum) {
                 max = sum;
                 arrStart = start;
                 arrEnd = i;
             }

             if (sum < 0) {
                 sum = 0;
             }
         }

         System.out.print("The subArray is: [");
         for (int i = arrStart; i < arrEnd; i++) {
             System.out.print(nums[i] + " ");
         }
         System.out.print("]\n");
         return max;
     }

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
