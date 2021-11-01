package hackerrankjava;

import java.util.Scanner;

public class StdIn_StdOut {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int i=scanner.nextInt();
        Double d=scanner.nextDouble();


        System.out.println("String is: "+ s);
        System.out.println("Integer is: "+ i);
        System.out.println("Double is: "+ d);


    }

}
