import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LotteryNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lottery numbers to generate: ");
        int n = scanner.nextInt();

        int min = 1;
        int max = 50;

        if (n > (max - min + 1)) {
            System.out.println("Cannot generate " + n + " unique numbers in the given range.");
            return;
        }

        HashSet<Integer> lotteryNumbers = new HashSet<>();

        Random random = new Random();

        while (lotteryNumbers.size() < n) {
            int number = random.nextInt(max - min + 1) + min;
            lotteryNumbers.add(number);
        }

        System.out.println("Generated lottery numbers: " + lotteryNumbers);
    }
}
