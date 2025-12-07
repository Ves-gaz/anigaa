public class P8 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = new int[A.length];
        System.arraycopy(A, 0, B, 0, A.length);
        
        System.out.println("Array B:");
        
        for (int n : B) {
            System.out.print(n + " ");
        }
    }
}