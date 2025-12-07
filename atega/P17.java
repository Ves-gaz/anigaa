import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = readArray(in);
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > highest) {
                second = highest;
                highest = n;
            } else if (n > second && n != highest) {
                second = n;
            }
        }

        System.out.println("Second highest: " + second);
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