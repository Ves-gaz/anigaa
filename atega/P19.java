import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = in.nextInt();

        String[] names = new String[n];
        int[] grades = new int[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++)
            names[i] = in.next();

        System.out.println("Enter grades:");
        for (int i = 0; i < n; i++)
            grades[i] = in.nextInt();

        System.out.println("Student grades:");
        for (int i = 0; i < n; i++)
            System.out.println(names[i] + ": " + grades[i]);
    }
}