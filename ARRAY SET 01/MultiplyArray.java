public class MultiplyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        System.out.println("Product: " + product);
    }
}
