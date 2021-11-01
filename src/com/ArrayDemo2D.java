package com;

public class ArrayDemo2D {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40};
        int b[] = {50, 60, 70, 80};
        int c[] = {5, 10, 15, 30};
        int d[][] = {a, b, c};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }
    }
}
