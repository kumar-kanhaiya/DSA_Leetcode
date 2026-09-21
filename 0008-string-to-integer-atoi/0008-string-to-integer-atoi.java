class Solution {
    public int myAtoi(String s) {
        int i = 0;
        // first we have to checck for white spaces;
        while (i < s.length() && s.charAt(i) == ' ') {
            // System.out.println("i = " +i );
            i++;
            // System.out.println("increment i");
        }
        // now we have to check the sign ;
        boolean positive = true;
        if (i < s.length() && s.charAt(i) == '-') {
            // System.out.println("postive check");
            positive = false;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }
        int number = 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // 4. Check overflow BEFORE multiplying by 10
            if (number > (Integer.MAX_VALUE - digit) / 10) {
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            number = number * 10 + digit;

            i++;
        }
        // int number = Integer.parseInt(ans);

        return positive ? number : -number;
    }
}