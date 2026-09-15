/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
// Two Pointer to solve the question -->

class Solution {
    public int[] sortedSquares(int[] nums){
        int[] res = new int[nums.length];

        int i = 0;
        int j = nums.length-1;
        int k = nums.length-1;

        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[k] = nums[i] * nums[i];
                i++;
            }
            else{
                res[k] = nums[j] * nums[j];
                j--;
            }

        k--;
        }
        return res;
    }
}

// T:O(n)
// S:O(n) -- as new res array is formed in the question.
// @lc code=end

