class Solution {
    public int reverse(int x) {

         int out = 0;


        while(x != 0){
           int val = x%10;


           if(out > Integer.MAX_VALUE/10 || out < Integer.MIN_VALUE/10){
            return 0;
           }


           out = out*10+val;
           x = x/10;
        }

        return out;
    }
}