class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(curr, map.get(curr) - 1);
            if (set.contains(curr)) {
                continue;
            }

            while (!stack.isEmpty()
                    && curr < stack.peek()
                    && map.get(stack.peek()) > 0) {
                set.remove(stack.pop());
                // map.put(curr , map.get(curr) - 1);
            }
            stack.push(curr);
            set.add(curr);
        }
        String ans = "";
        while (!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }
        return ans;
    }
}