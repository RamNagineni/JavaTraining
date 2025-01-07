import java.util.Scanner;
import java.util.HashSet;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr) {
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            uniqueElements.add(arr[i]);
        }

        System.out.println("Unique elements in the array:");
        for (Integer element : uniqueElements) {
            System.out.print(element + " ");
        }
    }
}
