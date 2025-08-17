

package SortingII;

import java.util.Arrays;

class RecursiveInsertionSort{
    public static void main(String[] args) {

        int[] arr= {3,2,7,5,10,1};
        insertionSort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(insertionSort(arr)));
        
    }


    public static int[] insertionSort(int[] nums) {
        return helper2(nums,0, nums.length );

    }

    public static int[] helper1(int[] arr, int n){
        if(n<=1) return arr;
        helper1(arr, n-1);
        int key = arr[n-1];
        int j= n-2;

        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;

        return arr;
    }


    public static int[] helper2(int[] arr,int i, int n){
        if(i==n) return arr;
        int j=i;
        
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;    
        }

        return helper2(arr, i+1, n);

    }

}

