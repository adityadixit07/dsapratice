package recursion;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GetAllSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        // List<String> res = getSubsequence(s);
        // System.out.println(res);
        // System.out.println(printALlSubsequnce(s));
        printSubs(s, "");
 
    }

    // Recursive solution
    public static void printSubs(String s, String resultSoFar) {
        if (s.length() == 0) {
            System.out.println(resultSoFar);
            return;
        }
        // include input str in result
        printSubs(s.substring(1), s.charAt(0) + resultSoFar);
        // not include in result
        printSubs(s.substring(1), resultSoFar);
    }

    // brute force approach power set method to print all subset of the given string
    public static List<String> printALlSubsequnce(String s) {
        List<String> list = new ArrayList<>();
        int n = s.length();
        // let s="abc" so total power set 8 means (2 power 3);
        int a = (int) Math.pow(2, n) - 1; // total subset formed
        for (int i = 0; i <= a; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    temp += s.charAt(j);
                }
            }
            if (temp.length() > 0) {
                list.add(temp);
            }
        }
        Collections.sort(list);

        return list;
    }

    // get all subsequences
    public static List<String> getSubsequence(String s) {
        if (s.length() == 0) {
            List<String> temp = new ArrayList<>();
            temp.add(" ");
            return temp;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
        List<String> al = getSubsequence(ros);
        List<String> res = new ArrayList<>();
        for (String str : al) {
            res.add("" + str);
        }
        for (String str : al) {
            res.add(ch + str);
        }
        return res;
    }

 

}
