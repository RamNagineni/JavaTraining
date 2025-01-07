import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'To Kill a Mockingbird'?",
            "What is the largest ocean on Earth?",
            "What is the square root of 64?"
        };

        String[] answers = {
            "Paris",
            "Mars",
            "Harper Lee",
            "Pacific",
            "8"
        };

        int score = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz!");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + answers[i]);
            }

            System.out.println();
        }
        System.out.println("Quiz over! Your final score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}
