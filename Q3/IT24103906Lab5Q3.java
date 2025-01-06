import java.util.Scanner;

public class Main {
    private static final int ROOM_CHARGE_PER_DAY = 48000;
    private static final int DISCOUNT_10 = 10;
    private static final int DISCOUNT_20 = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int numberOfDays = endDate - startDate;
        int totalAmount = ROOM_CHARGE_PER_DAY * numberOfDays;
        int discount = 0;

        if (numberOfDays >= 3 && numberOfDays <= 4) {
            discount = DISCOUNT_10;
        } else if (numberOfDays >= 5) {
            discount = DISCOUNT_20;
        }

        if (discount > 0) {
            totalAmount -= (totalAmount * discount / 100);
        }

        System.out.println("Room charge per day: Rs " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount to be paid: Rs " + totalAmount);
    }
}
