package interviewquestions;

public class ReverseString {
    public static void main(String[] args) {
        String s="Selenium";
        int len=s.length();
        String reverse="";

        for(int i=len-1;i>=0;i--){
           reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);
    }
}
