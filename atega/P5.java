public class P5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int n : arr) {
            if (n == 3) break;
            System.out.println(n);
        }
    }
}