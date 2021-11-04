package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];


        for (int index = 0; index < size; index++) {
            System.out.print("Enter value for " + index + " element: ");
            array[index] = input.nextInt();

        }
        System.out.println("Numbers: " + Arrays.toString(array));


    }
}
