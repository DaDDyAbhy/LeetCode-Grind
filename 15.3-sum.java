/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
import java.util.*;
class Solution {
    public void twoSumHelper(int k, int[] nums, List<List<Integer>> res) {
        int i = k + 1; 
        int j = nums.length - 1;

        while(i < j) {
            int sum = nums[k] + nums[i] + nums[j];

            if(sum > 0){
                j = j - 1;
            }

            else if( sum < 0){
                i = i + 1;
            }
            else{
                // found a triplet
                res.add(Arrays.asList(nums[k] ,nums[i], nums[j])); // nums[k], nums[i], nums[j]
                i = i + 1;
                j = j - 1;

                while(i < j && nums[i] == nums[i - 1]){
                    i = i + 1;
                }

                while(i < j && nums[j] == nums[j + 1]){
                    j = j - 1;
                }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int k = 0; k < nums.length; k++){
            if(nums[k] > 0){
                break;
            }

            if(k == 0 || nums[k]!= nums[k-1]){
                twoSumHelper(k, nums, res);
            }
        }
        return res;
    }
}

// T: O(nlogn + n^2)
// S: O(logn)
// @lc code=end

