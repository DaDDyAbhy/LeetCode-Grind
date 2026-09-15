/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while (left<right) {
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            
            if((s.charAt(left) != s.charAt(right))){
                return false;
            }

            left++;
            right--;
                
        }
        return true;
    }
}
// @lc code=end

