import java.util.Random;

public class SensorDataMonitoring {
    public static void main(String[] args) {
        int threshold = 90;

        int readingsCount = 0;
        int highestValue = Integer.MIN_VALUE;

        Random random = new Random();

        System.out.println("Starting sensor data monitoring...");

        while (true) {
            int sensorValue = random.nextInt(100);
            readingsCount++;

            if (sensorValue > highestValue) {
                highestValue = sensorValue;
            }

            System.out.println("Reading " + readingsCount + ": Sensor value = " + sensorValue);

            if (sensorValue > threshold) {
                System.out.println("Threshold exceeded! Stopping monitoring...");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Monitoring interrupted!");
            }
        }

        System.out.println("Total readings taken: " + readingsCount);
        System.out.println("Highest value recorded: " + highestValue);
    }
}
