/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = (n+m)-1;

        while(i>=0 && j>=0){
            if(nums2[j]>nums1[i]){
                nums1[k] = nums2[j];
                j = j - 1;
            }
            else{
               nums1[k] = nums1[i];
               i = i - 1;
            }
            k = k - 1;
        }
        while(j >= 0){ // Kyoonki idhar i maanlo khaali bhi ho gaya toh uske saare sort ho chuke hain elements in the array. Matlab yahi hua hoga ki nums1[i] greater than raha hoga nums2[j] se tabhi last mein j ke koi element bach sakta hai. Isliye yahan loop lagakar j ki jitne bhi sorted elements bachenge usko uthakar patak denge nums1[k] mein aur k--;
            nums1[k] = nums2[j];
            j = j - 1;
            k = k - 1;
        }
    }
}
// @lc code=end

