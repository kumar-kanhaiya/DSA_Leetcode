class Solution {
   public  ArrayList<String> letterCombinations(String digits) {
    if (digits.isEmpty()) return new ArrayList<>();
        return check("",digits);
    }

    private  ArrayList<String> check(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int digit = up.charAt(0) - '0'; // Convert char to int
        String letters = mapping[digit];

        for (char ch : letters.toCharArray()) {
            ans.addAll(check(p + ch, up.substring(1)));
        }
        return ans;
    }
}