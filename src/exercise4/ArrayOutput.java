package exercise4;

import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        String space = " ";
        String spacenext = " ";


        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for " + i + " element: ");
            array[i] = input.nextInt();
        }
        System.out.println(array[0]);
        for (int i = 1; i < array.length; i++) {

            System.out.println(spacenext + array[i]);
            spacenext = spacenext + space;


        }


    }
}
