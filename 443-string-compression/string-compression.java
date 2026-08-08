class Solution {
    public int compress(char[] chars) {

       char Element = chars[0];
       int count = 1;

       int index = 0;

       for(int i = 1; i< chars.length;i++){

            if(chars[i] == Element){
                count++;
            }else{

                chars[index++] = Element;

                if(count > 1) {
                    
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[index++] = c;
                    }

                     
                }
                 count = 1;
                    Element = chars[i];
            }
        
       }

       chars[index++] = Element;
            if (count > 1) {
            
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        

        return index;
    }
}