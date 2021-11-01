package interviewquestions;

public class RemoveJunk {
    public static void main(String[] args) {
        String s = "++## $$%% Love You America**007@@";
        s=s.replaceAll("[^ a-zA-Z0-9]"," ");
        System.out.println(s);
    }
}