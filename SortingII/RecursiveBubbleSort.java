package SortingII;

class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {7 ,4 ,1 ,5 ,3};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

     public static int[] bubbleSort(int[] nums) {
       return bubbleSortHelper(nums, nums.length);
    }

    public static int[] bubbleSortHelper(int[] nums, int n) {
        if (n == 1) {
            return nums;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        return bubbleSortHelper(nums, n - 1);
    }


    

}

