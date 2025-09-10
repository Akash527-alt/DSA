package ArrayProblems.Medium;

import java.util.*;

public class MediumLevelProblems {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> list = s.spiralOrder(arr);
        System.out.println(list);




    }
}

 class Solution{


     public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = row -1;
        int left = 0, right = col-1;

        while(left<=right && top<=bottom) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
     }

    public void setZeroes2(int[][] matrix){    // still wrong need to be correct
        int row = matrix.length;
        int col = matrix[0].length;
        //int[] r = new int[row];  --> matrix[...][0]
        //int[] c  = new int[col];  --> matrix[0][...]

        int col0 = 0;
        // traverse the matrix and mark 1st row and col accordingly
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == 0){
                    // mark i-th row
                    matrix[i][0] = 0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }

        // mark with 0 from (1,1) to (n-1,m-1)
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] =0;
                    }

                }
            }
        }

        if(matrix[0][0] ==0){
            for(int j=0;j<col;j++){
                matrix[0][j] =0;
            }
        }

        if(col0 == 0 ){
            for(int i=0;i<row;i++){
                matrix[i][0] = 0;
            }
        }


     }

     public void setZeroes(int[][] matrix) {
         int row = matrix.length;
         int col = matrix[0].length;
         int[] r = new int[row];
         int[] c = new int[col];
         Arrays.fill(r,0);
         Arrays.fill(c,0);

         for(int i=0;i<row;i++){
             for(int j=0;j<col;j++){
                 if(matrix[i][j] == 0){
                     r[i] = -1;
                     c[j] = -1;
                 }
             }
         }

         for(int i=0;i<row;i++){
             for(int j=0;j<col;j++){
                 if(r[i] == -1 || c[j] == -1){
                     matrix[i][j] = 0;
                 }
             }
         }


//         for(int i=0;i<row;i++) {
//             for (int j = 0; j < col; j++) {
//                 if (matrix[i][j] == 0) {
//                     markRow(matrix,i,row);
//                     markCol(matrix,j,row);
//                 }
//             }
//         }
//
//         for(int i=0;i<row;i++) {
//             for(int j=0;j<col;j++) {
//                 if(matrix[i][j]==-1) {
//                     matrix[i][j]=0;
//                 }
//             }
//         }

     }
//     private void markRow(int[][] arr,int i,int n){
//         for(int j=0;j<n;j++){
//             if(arr[i][j]!=0){
//                 arr[i][j] = -1;
//             }
//         }
//     }
//     private void markCol(int[][] arr,int j,int m){
//         for(int i=0;i<m;i++){
//             if(arr[i][j] != 0){
//                 arr[i][j] = -1;
//             }
//         }
//     }

     public int longestConsecutive(int[] nums) {
         int longest = 0;
         Set<Integer> set = new HashSet<>();

         for(int num : nums){
             set.add(num);
         }
         System.out.println(set);

         for(int num : set){
             int count =1;

             if(!set.contains(num-1)){
                 while(set.contains(num+1)){
                     num++;
                     count++;
                 }
                 longest = Math.max(longest,count);
             }

         }

//         Arrays.sort(nums);
//         int lastSmaller = Integer.MIN_VALUE;
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if(nums[i]-1 == lastSmaller){
//                 count++;
//                 lastSmaller = nums[i];
//             }
//             else if(nums[i] != lastSmaller){
//                 count = 1;
//                 lastSmaller = nums[i];
//             }
//            longest = Math.max(count,longest);
//         }
         return longest;
     }

     private boolean linearSearch(int[] nums, int target){
         for(int i=0;i<nums.length;i++){
             if (nums[i] == target) return true;
         }
         return false;
     }

     public List<Integer> leaders(int[] nums) {
         List<Integer> list = new ArrayList<>();
         int maxi = nums[nums.length-1];
         list.add(nums[nums.length-1]);
         for(int i=nums.length-2;i>=0;i--){
             if(nums[i]>maxi){
                 list.add(nums[i]);
                 maxi = nums[i];
             }
         }
         Collections.reverse(list);


//         for(int i=0;i<nums.length;i++){
//             boolean leader = true;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]<nums[j]){
//                     leader = false;
//                     break;
//                 }
//
//             }
//             if(leader != false){
//                 list.add(nums[i]);
//             }
//         }

         return list;
     }

     public void nextPermutation(int[] nums) {
         int n = nums.length;
         int index = -1;
         for(int i=n-2;i>=0;i--){
             if(nums[i]<nums[i+1]){
                 index = i;
                 break;
             }
         }

         if(index == -1){
             reverse(nums,0);
         }
         else {
             for (int i = n - 1; i >= index; i--) {
                 if (nums[i] > nums[index]) {
                     int temp = nums[i];
                     nums[i] = nums[index];
                     nums[index] = temp;
                     System.out.println(Arrays.toString(nums));
                     break;
                 }
             }
             reverse(nums,index+1);

         }

     }
     void reverse(int[] nums, int start){
         int i = start;
         int j = nums.length -1;
         while(i<j){
             swap(nums, i, j);
             i++;
             j--;

         }
     }
     void swap(int[] nums, int i, int j){
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;
     }

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
