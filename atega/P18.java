import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = readArray(in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Array has duplicates.");
                    return;
                }
            }
        }

        System.out.println("No duplicates.");
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