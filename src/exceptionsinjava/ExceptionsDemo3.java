// If we divide 12/0 then we can see the exception
package exceptionsinjava;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionsDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int n1=input.nextInt();
        System.out.println("Enter Second Number: ");
        int n2=input.nextInt();
        int sum=n1/n2;
        System.out.println(sum);
        }
    }

