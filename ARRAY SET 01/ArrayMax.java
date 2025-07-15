public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 9};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Max: " + max);
    }
}
