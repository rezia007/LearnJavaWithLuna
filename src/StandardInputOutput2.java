import java.util.Scanner;

public class StandardInputOutput2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  s1 = scan.next();
        int b= scan.nextInt();

        System.out.print("Output will be: "+s1+" ");
        System.out.print(b);
    }

}
