package interviewquestions;

public class SwapNumber {
    public static void main(String[] args) {
        int a=100;
        int b=200;

        System.out.println("Before Swapping the Value is: ");
        System.out.println("a="+a);
        System.out.println("b="+b);

        int c;
        c=a;
        a=b;
        b=c;

        System.out.println("After Swapping the Value is: ");
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println(">>>>>>>>>>>>>>>>>>>");

        System.out.println("Before swapping the number is: ");
        System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);

        System.out.println("After swapping the number is: ");
        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);

    }

}
