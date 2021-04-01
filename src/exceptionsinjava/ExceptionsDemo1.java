package exceptionsinjava;

public class ExceptionsDemo1 {
    public static void main(String[] args) {
        //String str=null;
        //System.out.println(str.length());

        try {
            int a=30, b=0;
            int c=a/b;
            System.out.println("Result: "+c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide a number by Zero");
        }

        try {
            int num=Integer.parseInt("Bangladesh");
            System.out.println(num);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception");
        }
    }
}
