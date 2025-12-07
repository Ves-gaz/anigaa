public class P7 {
    public static void main(String[] args) {
        int [] arr = {-1, 2, -3};
        for (int i = 0; i < arr.length; i++)arr[i] = Math.abs(arr[i]);
        for (int n : arr) System.out.print(n + " ");
    }
}