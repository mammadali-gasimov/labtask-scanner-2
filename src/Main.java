import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Minimum 4 reqemli 1 eded yazin:");
        int userNumber = scanner.nextInt();
        int temp = userNumber;
        int count = 0;

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        if (count < 4) {
            System.out.println("Minimum 4 reqemli 1 eded yazin:");
            userNumber = scanner.nextInt();
        }

        int[] reversedDigits = new int[count];
        temp = userNumber;
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = temp % 10;
            temp /= 10;
        }

        for (int r : reversedDigits) {
            System.out.println(r);
        }
    }
}