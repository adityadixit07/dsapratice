// 1. Write a recursive function to compute the count of vowels and consonants in a string

import java.util.*;
public class CountVowelConsonants{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("enter the string:");
        String input=sc.next();
        System.out.println("Total vowels:"+countVowels(input.toLowerCase(), 0));
        System.out.println("total consonants:"+countConsonants(input.toLowerCase(),0));
    }
    public static int countVowels(String s,int index){
        if(index==s.length()){
            return 0;
        }
        char curr=s.charAt(index);
        if(checkChar(curr)){
            return 1+countVowels(s,index+1);
        }
        else{
            return countVowels(s,index+1);
        }
    }
    public static int countConsonants(String s,int index){
        if(index==s.length()){
            return 0;
        }
        char curr=s.charAt(index);
        if(((curr>=65 || curr<=90)||(curr>=97 && curr<=122)) && checkChar(curr)==false){
            return 1+countConsonants(s, index+1);
        }
      
        else{
            return countConsonants(s,index+1);
        }
    }
    public static boolean checkChar(char c){
        if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}