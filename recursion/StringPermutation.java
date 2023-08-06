package recursion;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class StringPermutation{
    public static void main(String[] args) {
        String s="ABCD";
        boolean[] freq=new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            freq[i]=false;
        }
        ArrayList<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        helper(s, res, sb, freq);
        System.out.println(res);
    }
    public static void helper(String s,ArrayList<String> res,StringBuilder sb,boolean[] freq){
        if(sb.length()==s.length()){
            res.add(sb.toString());
            return;
        }
        for(int i=0;i<s.length();i++){
            if(freq[i]==false){
                freq[i]=true;
                sb.append(s.charAt(i));
                helper(s, res, sb, freq);
                sb.deleteCharAt(sb.length()-1);
                freq[i]=false;
            }
        }
    }
}