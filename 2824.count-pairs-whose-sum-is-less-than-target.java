/*
 * @lc app=leetcode id=2824 lang=java
 *
 * [2824] Count Pairs Whose Sum is Less than Target
 */

// @lc code=start
import java.util.Collections;
class Solution {
    public int countPairs(List<Integer> nums, int target) {
       Collections.sort(nums);

       int i = 0;
       int j = nums.size() - 1;
       int count = 0; 

       while(i<j){
        int sum = nums.get(i) + nums.get(j);

        if(sum < target){
            count = count + (j - i);
            i = i + 1;
        }
        else{
            j = j - 1;
        }
       }
       return count;
    }
}

// T: O(n.logn)
// S: O(logn) as quicksort is used in java so its time complexity is O(logn)
// @lc code=end

