class Solution {
    public int smallestNumber(int n, int t) {

       int current = n;

       while(true){

        if(getProduct(current) % t == 0){
            return current;
        }

        current++;
       }
    }

    public int getProduct(int num){

        int product = 1; 
        while(num > 0){

            product *= num % 10;
            num = num/10;
        }

        return product;
    }
}