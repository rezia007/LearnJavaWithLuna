package sdetinterviewcodes;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str="Welcome to Maryland";
        String[] words=str.split(" ");

        String reverse="";

        for(String w:words){
            String reverseword="";
            for (int i=w.length()-1;i>=0;i--){
                reverseword=reverseword+w.charAt(i);
            }
            reverse=reverse+reverseword+" ";
        }
        System.out.println(reverse);
    }
}
