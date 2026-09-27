class Solution {
    public static String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);

        int left = sb.lastIndexOf("(");
        int right = sb.indexOf(")" , left);

        while (left != -1 && right != -1) {

            sb.deleteCharAt(right);
            sb.deleteCharAt(left);

            StringBuilder temp =
                new StringBuilder(sb.substring(left, right - 1));

            temp.reverse();

            sb.replace(left, right - 1, temp.toString());

            left = sb.lastIndexOf("(");
            right = sb.indexOf(")", left);
        }

        return sb.toString();
    }

}