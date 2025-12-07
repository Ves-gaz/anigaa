import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();

        System.out.print("Value to check: ");
        int value = in.nextInt();

        int count = 0;
        for (int n : arr) {
            if (n == value) count++;
        }

        if (count >= 3)
            System.out.println("Appears at least 3 times.");
        else
            System.out.println("Does NOT appear 3 times.");
    }
}