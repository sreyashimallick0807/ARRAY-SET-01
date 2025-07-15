public class CopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copy = original.clone();
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
