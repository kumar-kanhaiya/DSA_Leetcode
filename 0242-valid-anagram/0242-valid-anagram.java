class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] arr = s.toCharArray();
        char[] secondArr= t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(secondArr);
        String first = "";
        String second = "";
        for(int i = 0 ; i < arr.length ; i++){
            first = first + arr[i];
            second += secondArr[i];
        }
        return first.equals(second);
        
    }
}