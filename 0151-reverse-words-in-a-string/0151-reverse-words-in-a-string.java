class Solution {
    public static String reverseWords(String s){
        String[] arr = s.trim().split("\\s+");
        System.out.println(Arrays.toString(arr));
        StringBuilder str = new StringBuilder();
        for(int i = arr.length -1 ; i>= 0 ; i--){
            str.append(arr[i]);
            str.append(" ");
        }
        return str.toString().trim();
    }
}