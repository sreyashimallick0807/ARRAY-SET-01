public class ArrayPosNeg {
    public static void main(String[] args) {
        int[] arr = {3, -2, 5, -7, 0};
        int pos = 0, neg = 0;
        for (int num : arr) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
        }
        System.out.println("Positive: " + pos + ", Negative: " + neg);
    }
}
