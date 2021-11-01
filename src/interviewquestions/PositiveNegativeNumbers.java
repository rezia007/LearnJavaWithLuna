package interviewquestions;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        double number=12.50;
        if(number<0.0){
            System.out.println(number+" is a negative number");
        }else if (number>0.0){
            System.out.println(number+" is a positive number");
        }else {
            System.out.println(number+" is zero");
        }

    }
}
