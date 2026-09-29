/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum > target){
                j = j - 1;
            }
            else if(sum < target){
                i = i + 1;
            }
            else{
                return new int[]{
                    i+1,j+1
                };
            }
        }
        return new int[]{-1,-1};
    }
}
// T:O(n)
// S:O(1)
// @lc code=end

