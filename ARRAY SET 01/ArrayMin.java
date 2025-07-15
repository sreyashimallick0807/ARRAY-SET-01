public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 9};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        System.out.println("Min: " + min);
    }
}
