// package hashmap;

import java.util.HashMap;

public class HigestFrequencyCharacter {
    public static void main(String[] args) {
        String s="babcccdbabccd";
        System.out.println(highestfreq(s));
    }
    public static Character highestfreq(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int old_freq=map.get(ch);
                int new_freq=old_freq+1;
                map.put(ch, new_freq);
            }else{
                map.put(ch, 1);
            }
        }
        System.err.println(map);
        char maxfreqchar=s.charAt(0);
        for(Character keys:map.keySet()){
            if(map.get(keys)>map.get(maxfreqchar)){
                maxfreqchar=keys;
            }
        }
        return maxfreqchar;
    }
}
