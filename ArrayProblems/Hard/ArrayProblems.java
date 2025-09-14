package ArrayProblems.Hard;

import java.util.ArrayList;
import java.util.List;

public class ArrayProblems {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> list = s.pascalTriangle(6);
        System.out.print(list);

    }
}

class Solution {


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
