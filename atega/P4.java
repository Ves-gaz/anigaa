public class P4 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 2};
        int min = arr[0], max = arr[0];
        for (int n: arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}