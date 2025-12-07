public class P2 {
    public static void main(String[] args){
        int[] arr = {1, 7, 7, 3, 7, 4, 5, 6, 7, 7};
        int count = 0;
        for (int n : arr) if (n == 7) count++;
        System.out.println("7 appears " + count + " times");
    }
}