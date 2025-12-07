import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] grades = readArray(in);
        int pass = 0, fail = 0;

        for (int g : grades) {
            if (g >= 75) pass++;
            else fail++;
        }

        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
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