package ArrayProblems.Hard;

import java.util.*;

public class ArrayProblems {
    public static void main(String[] args) {
        Solution s = new Solution();


        int arr2[] = {4,3,6 ,2, 1, 1};

        int[] ans = s.findMissingRepeatingNumbers(arr2);

        for(int a: ans){
            System.out.print(a + " ");
        }



    }
}

class Solution {


    public int[] findMissingRepeatingNumbers(int[] nums) {


        // solution 3 : optimal 1 -> Mathematics calculation  -> tc - O(n)

        // s - sn : x-y
        // s2 - sn2 : x^2 - y^2

        int n = nums.length;
        long sn = ((long) n * (n+1))/2;
        long sn2 = (n * (n+1) * (2 * n + 1)) /6;
        long s = 0;
        long s2 = 0 ;
        for(int i = 0 ; i<n; i++){    // O(n)
            s += nums[i];
            s2 += (long) nums[i] * (long)nums[i];
        }

        long val1 = s - sn;  // x - y
        long val2 = s2 - sn2;  // x^2 - y^2
        val2 = val2/val1;

        long x = (val1 + val2)/2;
        long y = val2- x;

        return new int[]{(int)x, (int)y};


        // solution 2 : Better -> using hashMap
        /*
        int n = nums.length;
        int[] hash = new int[n+1];

        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }

        int repeating = -1, missing =-1;
        for(int i = 1;i<=n ;i++){
            if(hash[i] == 2) repeating = i;
            else if(hash[i] == 0) missing = i;

            if(repeating != -1 && missing != -1){
                break;
            }
        }

        int ans[] = {repeating,missing};
        return ans;

         */


        // brute force solution
        /*
        int n = nums.length;
        int missing = -1;
        int repeating = -1;

        for(int i =1 ; i<=n; i++){
            int count = 0;
            for(int j = 0 ;j<n;j++){
                if(nums[j] == i) count ++;
            }

            if(count == 0) missing = i;
            else if(count==2) repeating = i;

            if(missing != -1 && repeating != -1) break;



        }

        int[] ans = {repeating,missing};
        return ans;

         */


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // solution 2
        int i = m-1;
        int j = n-1;
        int k = m+n -1;

        while(j>=0 && i>= 0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0 ){
            nums1[k--] = nums2[j--];
        }



        /**
         *

        // method 1
        for(int i = 0 ; i<n; i++){
            nums1[i+m] = nums2[i];
        }

        Arrays.sort(nums1);

         */


    }

    public List<List<Integer>> mergeOverlap(List<List<Integer>> intervals) {



        intervals.sort((a,b) -> {
           if(!a.get(0).equals(b.get(0))){
               return Integer.compare(a.get(0),b.get(0));
           }
           else{
               return Integer.compare(a.get(1),b.get(1));
           }
        });

        List<List<Integer>> ans = new ArrayList<>();
//        // method 2
//
//        for(List<Integer> interval: intervals){
//            if(ans.isEmpty() || ans.getLast().get(1)<interval.get(0)){
//                ans.add(Arrays.asList(interval.getFirst(),interval.getLast()));
//            }
//            else{
//                List<Integer> last = ans.getLast();
//                int maxEnd = Math.max(ans.get(last.getFirst()).get(1),interval.get(1));
//
//            }
//
//        }


      //   method 1
        int n = intervals.size();
        int i=0 ;
        while(i<n){
            int start = intervals.get(i).get(0);
            int end = intervals.get(i).get(1);

            int j =i+1;

            while(j<n && intervals.get(j).getFirst() <= end){
                end = Math.max(end,intervals.get(j).getLast());
                j++;

            }

            ans.add(Arrays.asList(start,end));
            i = j;

        }

        return ans;
    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> {
            if(a[0] != b[0]){
                return Integer.compare(a[0],b[0]);
            }
            else{
                return Integer.compare(a[1],b[1]);
            }
        });

        int n = intervals.length;
        List<int[]> merged = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 0;i < n;i++){

            int[] current  = intervals[i];

            if(current[0]<=end){
                end = Math.max(end,current[1]);
            }
            else{
                merged.add(new int[]{start,end});
                start = current[0];
                end = current[1];
            }



        }

            merged.add(new int[]{start,end});

            return merged.toArray(new int[merged.size()][]);



    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans  = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1 ; j<nums.length;j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = nums.length-1;

                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum == target){
                        List<Integer> temp  = Arrays.asList( nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++; l--;

                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum<target) k++;
                    else l--;


                }

            }


        }
        return ans;

    }

    public int subarraysWithXorK(int[] nums, int k) {

        int xor = 0;
        int count = 0;
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(xor,1);
        for(int i = 0 ;i<n;i++){
            xor = xor ^ nums[i];
            int  x = xor ^ k;

            if(map.containsKey(x)){
                count += map.get(x);
            }

            int temp = map.getOrDefault(xor,0);
            map.put(xor , temp + 1);


        }

        return count;

//        int n = nums.length;
//        int count  = 0;
//        for(int i = 0;i<n;i++){
//            int xor = 0;
//            for(int j = i; j<n;j++){
//                xor = xor^nums[j];
//
//                if(xor == k){
//                    count++;
//                }
//            }
//        }
//        return count;
    }


    public int maxLen(int[] arr) {
        // Your code goes
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum =0;

        // method 2 : O(n) complexity for both time and space
        for(int i = 0 ; i<n; i++){
            sum += arr[i];

            if(sum == 0){
                max = i+1;
            }
            else {
                if (map.containsKey(sum)) {
                    max = Math.max(max, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }

        }



//        for(int i = 0 ; i<n;i++){;
//            int count = 0;
//            int sum = 0 ;
//            for(int j = i;j<n;j++){
//                sum += arr[j];
//                count++;
//                if(sum == 0 ) {
//                    max = Math.max(max,count);
//
//                }
//            }
//
//        }
        return max;

    }

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for(int i = 0 ; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0){
                    j++;
                }
                else if ( sum > 0) {
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;

                }
                System.out.println(ans);
            }



        }
        return ans;
    }


    public List<Integer> majorityElement2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt1 =0, cnt2 =0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt1 ==0 && nums[i] != el2 ){
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != el1){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i]) cnt1++;
            else if(el2 == nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 =0; cnt2 =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == el1) cnt1++;
            if(nums[i] == el2) cnt2++;
        }

        int mini = (int) (nums.length /3) +1;
        if(cnt1 >= mini) list.add(el1);
        if(cnt2 >= mini) list.add(el2);

        return list;
    }

    // majority element ( element > n/3 )
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            int val = map.getOrDefault(nums[i],0);
            map.put(nums[i],val+1);
        }

        for(Map.Entry<Integer,Integer> a : map.entrySet()){
            if(a.getValue() > (n/3)){
                list.add(a.getKey());
            }
        }
        return list;


    }

    public List<List<Integer>>  pascalTriangle(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(nthRowOfPascalTrianlge(i));
        }
        return ans;
    }


    public List<Integer> nthRowOfPascalTrianlge(int rowNumber){
        List<Integer> ansRow = new ArrayList<>();
        int ans =1;
        ansRow.add(ans);
        for(int i=1;i<rowNumber;i++){
            ans = ans * (rowNumber -i);
            ans = ans/i;
            ansRow.add(ans);
        }
        return ansRow;
    }

}
