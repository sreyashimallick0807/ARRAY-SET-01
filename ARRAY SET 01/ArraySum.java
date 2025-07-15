public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
