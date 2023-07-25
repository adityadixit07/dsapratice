// package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public static void main(String[] args) {
        String s = "tree";
        // output can be : eert
        System.out.println(sortCharbyFreq(s));
        // sort the character by frequency
        // Given a string s, sort it in decreasing order based on the frequency of the
        // characters. The frequency of a character is the number of times it appears in
        // the string.
        // Return the sorted string. If there are multiple answers, return any of them.
    }

    public static String sortCharbyFreq(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<Map.Entry<Character, Integer>>(
                (a, b) -> (b.getValue() - a.getValue()));
        pq.addAll(map.entrySet());
        String ans = "";
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> head = pq.poll();
            int freq = head.getValue();
            while (freq-- > 0) {
                ans += head.getKey();
            }
        }
        return ans;
    }
}
