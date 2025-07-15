public class ReplaceEvenWithMinusOne {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) arr[i] = -1;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
