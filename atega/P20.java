import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();

        System.out.println("Even numbers > 20:");
        for (int n : arr)
            if (n % 2 == 0 && n > 20)
                System.out.println(n);
    }
}