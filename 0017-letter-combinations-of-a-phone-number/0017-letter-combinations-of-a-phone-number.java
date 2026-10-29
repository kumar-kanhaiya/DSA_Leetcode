class Solution {
    public List<String> letterCombinations(String digits) {
        return helper("",digits+"");
    }
    public static List<String> helper(String p , String up){
        // base condition 
        if(up.isEmpty()){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        // convert into digits 
        List<String> ans = new ArrayList<>();
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int digit = up.charAt(0) - '0'; // Convert char to int
        String letters = mapping[digit];

        for (char ch : letters.toCharArray()) {
            ans.addAll(helper(p + ch, up.substring(1)));
        }
        return ans;
    }
}