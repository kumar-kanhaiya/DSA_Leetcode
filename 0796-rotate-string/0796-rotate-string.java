class Solution {
    public boolean rotateString(String s, String goal) {
        // base condition 
        if(s.length() != goal.length()){
            return false;
        }
        String str = s+s;
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().contains(goal);
        
    }
}