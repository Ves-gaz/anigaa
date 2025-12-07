import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = readArray(in);

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.println(arr[i]);
    }

    public static int[] readArray(Scanner in) {
        System.out.print("Enter size: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        return arr;
    }
}