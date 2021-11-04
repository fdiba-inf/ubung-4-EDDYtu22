package exercise4;

import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter array length: ");
        int size = input.nextInt();
        double array[] = new double[size];
        int minIndex = 0;

        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
            }
        for (int i = 1; i < size; i++) {
            if (array[i] < array[i-1]) {
                minIndex = i;
            } else {
                minIndex = 0;
            }
        }
        System.out.println("Min index: "  + minIndex);
    }
}
