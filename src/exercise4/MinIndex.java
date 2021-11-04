package exercise4;

import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter array length: ");
        int size = input.nextInt();
        double array[] = new double[size];
        double minValue = 1.7976931348623157E308;

        for (int i = 0; i < size; i++) {
            //System.out.println("Enter value for " + i + " element: ");
            array[i] = input.nextDouble();
            if (array[i] < minValue) {
                minValue = array[i];
            }

        }
        System.out.println("Min index: "  + minValue);
    }
}
