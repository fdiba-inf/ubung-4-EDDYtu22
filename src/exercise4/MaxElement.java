package exercise4;

import java.util.Scanner;


public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter array length: ");
        int size = input.nextInt();
        double array[] = new double[size];
        double maxValue = 2.2250738585072014E-308;

        for (int i = 0; i < size; i++) {
            //System.out.println("Enter value for " + i + " element: ");
            array[i] = input.nextDouble();
            if (array[i] > maxValue) {
                maxValue = array[i];
            }

        }
        System.out.println("Max number: "  + maxValue);
    }
}
