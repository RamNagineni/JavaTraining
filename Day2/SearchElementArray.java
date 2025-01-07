import java.util.Scanner;

public class SearchElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int position = -1; // Default value if element is not found
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                position = i; // Element found, save its index
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element " + target + " found at position: " + position);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
