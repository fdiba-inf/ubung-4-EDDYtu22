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
            if (array[i]<array[0]) {
                minIndex = i;
            }
        }
        System.out.println("Min index: "  + minIndex);
    }
}
