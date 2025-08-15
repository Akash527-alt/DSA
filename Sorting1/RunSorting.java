package Sorting1;

import java.util.Arrays;

class RunSorting{
    public static void main(String[] args) {
        Solution s = new Solution();
    //     int[] nums = {8,2,5,2,1,6,7,3};
    //      System.out.println("Unsorted array: "+Arrays.toString(nums));
    //    // System.out.println("Sorted array using selection sort: "+Arrays.toString(s.selectionSort(nums)));

        // System.out.println("Bubble sort: "+Arrays.toString(s.bubbleSort(nums)));

        int[] arr1 = {2,3,5,7,1,2,8,9,10,4};
        System.out.println("\nunsorted Array: "+Arrays.toString(arr1));
       // System.out.println("Insertion sort: "+Arrays.toString(s.insertionSort(arr1)));
        System.out.println("Insertion sort 2: "+Arrays.toString(s.insertionsSort2(arr1)));

    }


    
}


class Solution {

    public int[] insertionsSort2(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
                System.out.println("  Current array: "+Arrays.toString(arr));
            }
            arr[j+1] = key;
        }
        return arr;
    }


     public int[] insertionSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j = i;
            while(j>0 && nums[j-1] >nums[j]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
        return nums;
    }

    public int[] bubbleSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                // System.out.println(Arrays.toString(nums));
            }
        }
        return nums;

    }

    public int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int minInd = i;
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

