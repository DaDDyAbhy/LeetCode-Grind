/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start

// Note--> Iss question mein hum palindromeHelper() function call ke samay i++ ya j-- calling ke time nahi use karenge because i++ means that kaam karr lo and then i=i+1 karna and similarly j-- mean ki kaam karlo phir j=j-1 karna.
// And --i aur ++j ka matlab hota hai ki pehle i=i+1 hoga aur firr koi kaam hoga and --j means ki pehle j=j-1 hoga phir hi koi aur kaam hoga.

class Solution {
    private boolean palindromeHelper(int i, int j, String s) {
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left != right){
                return palindromeHelper(i+1, j, s) || palindromeHelper(i,j-1, s);
            }else{
                i++;
                j--;
            }
        }
    return true;
    }
}

// T:O(n)
// S:O(1)

// @lc code=end

