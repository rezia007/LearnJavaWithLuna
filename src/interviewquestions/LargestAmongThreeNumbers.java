package interviewquestions;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        int x=100;
        int y=400;
        int z=300;

        if(x>y && x>z){
            System.out.println("X is the greatest number");
        }else if (y>z){
            System.out.println("Y is the greatest number");
        }else {
            System.out.println("Z is the greatest number");
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
}
