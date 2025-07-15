import java.util.*;
public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Index: " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Not found");
    }
}
