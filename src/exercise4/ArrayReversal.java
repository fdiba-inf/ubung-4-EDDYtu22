package exercise4;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = input.nextInt();
        char array[] = new char[size];
        char arrayRev[] = new char[size];
        int i;
        int r;
        for (i = 0; i < size; i++) {
            array[i] = input.next().charAt(0);
        }
        System.out.print("Reversed symbols: [");
        i = size - 1;
        for (r = 0; r < arrayRev.length; r++) {
            arrayRev[r] = array[i];
            if (r <= arrayRev.length - 2) {
                System.out.print(arrayRev[r] + ", ");


            } else {
                System.out.print(arrayRev[r]);
            }
            i--;

        }
        System.out.print("]");
    }
}
