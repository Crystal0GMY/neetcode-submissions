class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left ++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right --;
            char cL = s.charAt(left);
            char cR = s.charAt(right);
            if (cL != cR && Character.toLowerCase(cL) != Character.toLowerCase(cR)) return false;
            left ++;
            right --;
        }
        return true;
    }
}
