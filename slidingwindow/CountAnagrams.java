import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountAnagrams {
    public static void main(String[] args) {
        String word = "fororffrxfro";
        String pattern = "for";
        System.out.println("total anagrams :");
        // System.out.println(allocuurences(word, pattern));
        System.out.println(totalOCcurencesOfAnagrams(word, pattern));
    }
    // brute force approach
    // public static List<String> allocuurences(String word,String pattern){
    // List<String> res=new ArrayList<>();

    // for(int i=0;i<=word.length()-pattern.length();i++){
    // String substr=word.substring(i, i+pattern.length());
    // if(isEqual(pattern,substr)){
    // res.add(substr);
    // }
    // }
    // return res;
    // }
    // public static boolean isEqual(String pattern,String substr){
    // char[] ch1=pattern.toCharArray();
    // char[] ch2=substr.toCharArray();
    // Arrays.sort(ch1);
    // Arrays.sort(ch2);
    // if(Arrays.equals(ch1,ch2)){
    // return true;
    // }
    // else{
    // return false;
    // }
    // }

    // sliding window approach
    public static List<Integer> totalOCcurencesOfAnagrams(String word, String pattern) {
        List<Integer> res = new ArrayList<>(); // stores the indices where the anagram found

        int[] wordcount = new int[256];
        int[] patcount = new int[256];
        // storing the frequency of pattern
        for (int i = 0; i < pattern.length(); i++) {
            wordcount[word.charAt(i)]++;
            patcount[pattern.charAt(i)]++;
        }

        for (int i = pattern.length(); i < word.length(); i++) {
            if (isValidAnagram(patcount, wordcount)) {
                res.add(i - pattern.length());
            }
            // removing the first character
            wordcount[word.charAt(i - pattern.length())]--;
            // adding the current character
            wordcount[word.charAt(i)]++;
        }
        // checking for last window size
        if (isValidAnagram(patcount, wordcount)) {
            res.add(word.length() - pattern.length());
        }
        return res;

    }

    public static boolean isValidAnagram(int[] patcount, int[] wordcount) {
        for (int i = 0; i < 256; i++) {
            if (patcount[i] != wordcount[i]) {
                return false;
            }
        }
        return true;
    }

}
