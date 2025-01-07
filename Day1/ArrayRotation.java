import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of positions to rotate: ");
        int positions = scanner.nextInt();

        rotateArray(arr, positions);

        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArray(int[] arr, int positions) {
        int n = arr.length;
        positions = positions % n;

        int[] temp = new int[n];

        for (int i = 0; i < positions; i++) {
            temp[i] = arr[n - positions + i];
        }

        for (int i = 0; i < n - positions; i++) {
            temp[positions + i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
