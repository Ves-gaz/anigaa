import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();

        System.out.println("Even-index elements:");
        for (int i = 0; i < size; i += 2)
            System.out.println(arr[i]);
    }
}