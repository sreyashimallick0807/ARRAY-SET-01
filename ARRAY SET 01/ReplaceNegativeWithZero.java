public class ReplaceNegativeWithZero {
    public static void main(String[] args) {
        int[] arr = {4, -3, -1, 7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
