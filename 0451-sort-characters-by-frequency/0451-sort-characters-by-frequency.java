class Solution {
    static class Pair {
        char ch;
        int freq;

        public Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> b.freq - a.freq);
        // adding occurence
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        // now we have the frequency 
        // we have to insert the following details into the priorityQueue
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
        // now we have the priority queue and also the occurence 
        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            Pair p = pq.poll();

            for (int i = 0; i < p.freq; i++) {
                ans.append(p.ch);
            }
        }
        return ans.toString();
    }

    
}