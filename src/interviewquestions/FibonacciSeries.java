package interviewquestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num=10;
        int a1=0;
        int a2=1;

        for(int i=1;i<=num;i++){
            System.out.println(a1);
            int sum=a1+a2;
            a1=a2;
            a2=sum;
        }

    }
}
