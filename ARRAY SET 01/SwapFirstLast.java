public class SwapFirstLast {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
