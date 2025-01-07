import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Array sorted in ascending order: " + Arrays.toString(arr));

        Integer[] arrDescending = Arrays.stream(arr)
                                         .boxed()
                                         .toArray(Integer[]::new);
        Arrays.sort(arrDescending, Collections.reverseOrder());

        System.out.println("Array sorted in descending order: " + Arrays.toString(arrDescending));
    }
}
