package hackerrankjava;

import java.util.Scanner;

public class If_Else_Weird_NotWeird {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%2==1){
            System.out.println("Weird");
        }else {
          if(n>=6 && n<=20){
              System.out.println("Weird");
          }else {
              System.out.println("Not Weird");

          }
        }

    }
}
