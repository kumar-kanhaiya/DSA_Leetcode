class Solution {
    public int myAtoi(String s) {
        // first we have to initilise the i 
        int i = 0;
        // now we have to check the white spaces
        while(i< s.length() && s.charAt(i) == ' '){
            i++;
        }
        // now we have to check the sign 
        boolean positive = true;
        if(i< s.length() && s.charAt(i) =='-'){
            positive = false;
            i++;
        }
        else if(i<s.length() && s.charAt(i) == '+'){
            i++;
        }

        // now here is the main funda 
        int number = 0;
        while(i< s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            // ans should be 
            // number*10 + digit 
            // but we have to check is (number*10 + digit ) > Integer.MAX_VALUE
            if(number> (Integer.MAX_VALUE - digit)/10){
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            number = number*10 + digit;
            i++;
        }
        return positive?number:(-number);

    }
}