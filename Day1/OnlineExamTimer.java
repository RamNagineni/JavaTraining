public class OnlineExamTimer {
    public static void main(String[] args) {
        int totalTime = 30;

        System.out.println("Exam Timer Started. Total time: " + totalTime + " minutes");

        while (totalTime > 0) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                System.err.println("Timer interrupted.");
                break;
            }

            totalTime--;

            System.out.println("Time remaining: " + totalTime + " minute(s)");
        }

        System.out.println("Time's up! The exam has ended.");
    }
}
