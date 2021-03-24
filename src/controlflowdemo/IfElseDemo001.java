package controlflowdemo;

import java.util.Scanner;

public class IfElseDemo001 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String answer="";

        if(N%2==1)
        {
            answer = "Weird";
        }
        else
        {
            if (N >= 2 && N <= 5)
            {
                answer = "Not Weird";
            } else if (N >= 6 && N <= 20) {
                answer = "Weird";
            } else
            {
                answer = "Not Weird";
            }

        }
        System.out.println(answer);

    }


}
