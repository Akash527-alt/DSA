package Sorting1;

import java.util.Arrays;

class RunSorting{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {8,2,5,2,1,6,7,3};
         System.out.println("Unsorted array: "+Arrays.toString(nums));
        // System.out.println("Sorted array using selection sort: "+Arrays.toString(s.selectionSort(nums)));

        System.out.println("Bubble sort: "+Arrays.toString(s.bubbleSort(nums)));

    }


    
}


class Solution {

    public int[] bubbleSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                System.out.println(Arrays.toString(nums));
            }
        }
        return nums;

    }

    public int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int minInd = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[minInd] > nums[j]){
                    minInd = j;
                }

            }

            int temp = nums[i];
            nums[i] = nums[minInd];
            nums[minInd] = temp;
        }

        return nums;

    }

   
    }

