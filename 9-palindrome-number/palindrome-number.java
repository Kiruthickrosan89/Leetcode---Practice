class Solution {
    public boolean isPalindrome(int x) {

        int temp = x;
        int out =0;

        if (x < 0) {
            return false;
        }

        while(x != 0){
            int rem = x%10;
            out = out*10+rem;
            x = x/10;
        }
        

        

        return out == temp;
    }
}