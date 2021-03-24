package controlflowdemo;

public class ForLoop {
    public static void main(String[] args) {
        forLoop();
    }

    public static void forLoop() {
        int[] studentID = new int[4];
        for (int i = 0; i <= 3; i++) {
            studentID[i] = 101 + i;
        }

        for (int i = 0; i <= 3; i++) {
            System.out.println("Student ID: " + studentID[i]);
        }
    }

    public void forLoopConcept() {
        int counter = 0;
        for (int i = 70; i <= 80; i++) {
            System.out.println("Interation number: " + (i - 69));
            counter++;
        }
        System.out.println(counter);

    }
}