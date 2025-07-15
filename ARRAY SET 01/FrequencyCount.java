import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to count: ");
        int num = sc.nextInt();
        int count = 0;
        for (int val : arr) {
            if (val == num) count++;
        }
        System.out.println("Frequency: " + count);
    }
}
