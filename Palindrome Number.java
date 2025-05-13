class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int originalNumber = x;
        int reversedNumber = 0;

        while(x > 0){
            int remainder = x % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            x /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
