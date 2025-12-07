public class P6 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int sum = 0, count = 0;
        for (int n : arr ) if (n % 2 !=0) { sum += n ; count++; }
        System.out.println("Average: " + (count > 0 ? (double)sum / count : 0));

    }
}