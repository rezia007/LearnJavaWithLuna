package interviewquestions;

public class VowelAndConsonant {
    public static void main(String[] args) {
        char ch='p';

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+" is vowel");
        }else {
            System.out.println(ch+" is consonant");
        }
        System.out.println("..........................");

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch+" is vowel");
            default:
                System.out.println(ch+" is consonant");

        }
    }
}
