package ArraySolvingProblems.Easy;

import  java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class EasyArrayProblems {

    public static void main(String[] args) {
        ArrayProblems ap = new ArrayProblems();

        int[] nums1 = {10, 5, 2, 7, 1, 9};
//      int[] nums2 = {1, 5, 7, 8, 8};


//        int[] result = ap.unionArray(nums1, nums2);

        System.out.println("num1 :" + Arrays.toString(nums1));
        int result = ap.longestSubarray(nums1,14);
        System.out.println(result);

    }
}

class ArrayProblems {

    public int longestSubarray(int[] nums, int k) {

        int count =0;

        // method 2


        // method 3
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
            if(sum==k){
                count = Math.max(count, j-i+1);
            }
            }

        }

//          method 4
//        for(int i=0;i<nums.length;i++){
//            for(int j=i;j<nums.length;j++){
//                int sum =0;
//                for(int a=i;a<=j;a++){
//                    sum += nums[a];
//                }
//                    if(sum == k){
//                        count = Math.max(count, j-i+1);
//                    }
//            }
//
//        }
        return count;

    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        // Method I
        for(int i=0;i<nums.length-1;i = i+2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }

        }
        return nums[nums.length-1];


        // method II
//        int num =0;
//        System.out.println("nums :" + Arrays.toString(nums));
//        for(int i=0;i<nums.length;i++){
//        int count =0;
//            for(int j=1;j<nums.length;j++){
//                if(nums[i] == nums[j]){
//                    count++;
//                }
//            }
//
//            if(count<2){
//                 num = nums[i];
//            }
//
//
//          return num;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count=0;
            }
        }

        return max;

    }

        public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;

//          Method I
//          int missing = 0;
//          for (int i = 0; i <nums.length; i++) {
//          if(nums[i] != missing){
//              missing = i;
//              return missing;
//              }
//              missing++;
//           }
//           return missing;

            // Method II
            int sum = (n*(n+1)) /2;
            int s = 0;
            for (int num : nums) {
                s += num;
            }

            return sum -s;


        }

        public int[] unionArray(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < nums1.length; i++) {
                set.add(nums1[i]);
            }
            for (int j = 0; j < nums2.length; j++) {
                set.add(nums2[j]);
            }


            int[] union = new int[set.size()];
            int i = 0;
            for (Integer a : set) {
                union[i] = a;
                i++;
            }

            return union;


        }

        public int linearSearch(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) return i;

            }
            return -1;

        }

        public void moveZeroes(int[] nums) {
            // Two pointer
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;

                }
            }


            // move zeros in array to end
            // int n = nums.length;
            // for(int i=0;i<n;i++){
            //     for(int j=0;j<n-1;j++){
            //         if(nums[j] == 0){
            //             int temp = nums[j];
            //             nums[j] = nums[j+1];
            //             nums[j+1] = temp;
            //         }
            //     }

            // }


        }

        public void rotateRightByD(int[] nums, int D) {

            // Time limit will execed if the input is very long
            int n = nums.length;
            int[] rotated = new int[n];
            for (int i = 0; i < n; i++) {
                rotated[(i + D) % n] = nums[i];
                System.out.println("in rotated " + Arrays.toString(rotated));
            }

            System.out.println("original Array" + Arrays.toString(nums));

            for (int i = 0; i < n; i++) {
                nums[i] = rotated[i];
                System.out.println("In nums: " + Arrays.toString(nums));
            }
        }


        public void rotateRightByK(int[] nums, int k) {

            // Time limit will execed if the input is very long this is valid for the smaller values
            int n = nums.length;
            for (int i = 0; i < k; i++) {
                int temp = nums[n - 1];
                System.out.println("Temp " + temp);

                for (int j = n - 1; j > 0; j--) {

                    nums[j] = nums[j - 1];
                    System.out.println(Arrays.toString(nums));
                }

                nums[0] = temp;
                System.out.println("In outer loop: " + Arrays.toString(nums));
            }
        }

        public void rotateLeftByK(int[] nums, int k) {
            int n = nums.length;
            for (int i = 0; i < k; i++) {
                int temp = nums[0];
                for (int j = 1; j < n; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[n - 1] = temp;
            }


        }

        public void rotateArrayByOne(int[] nums) {
            int temp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[nums.length - 1] = temp;
        }

        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            int j = 0;

            for (int i = 1; i < n; i++) {
                if (nums[i] != nums[j]) {
                    j++;
                    nums[j] = nums[i];
                }
            }
            return j + 1;
        }

        public boolean isSorted(ArrayList<Integer> nums) {

            // for(int i=0;i<nums.size();i++){
            //     for(int j=i+1;j<nums.size();j++){
            //         if(nums.get(j)<nums.get(i)){
            //             return false;
            //         }

            //     }
            // }
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) < nums.get(i - 1)) {
                    return false;
                }
            }
            return true;

        }


        public int secondLargestElement2(int[] nums) {
            int largest = nums[0];
            int secondLargest = -1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > largest) {
                    secondLargest = largest;
                    largest = nums[i];
                } else if (nums[i] < largest && nums[i] > secondLargest) {
                    secondLargest = nums[i];
                }
            }
            return secondLargest;
        }

        public int secondLargestElement(int[] nums) {
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            int secondmx = -1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > secondmx && nums[j] != max) {
                    secondmx = nums[j];
                }
            }
            return secondmx;

        }

        public int largestElement(int[] nums) {
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            return max;

        }



}
