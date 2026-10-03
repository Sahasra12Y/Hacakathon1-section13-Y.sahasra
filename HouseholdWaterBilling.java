
import java.util.Scanner;

public class HouseholdWaterBilling {

    // 1c) Method to calculate total water consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1a) Data Types
        System.out.print("Enter number of family members: ");
        int familyMembers = scanner.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = scanner.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = scanner.nextInt();

        System.out.print("Enter water usage status (L/M/H): ");
        char waterUsageStatus = scanner.next().charAt(0);

        // Display household details
        System.out.println("\n--- Household Details ---");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterUsageStatus);

        // 1b) If-Else Condition
        int bill;

        if (waterConsumed <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("\n--- Water Bill ---");
        System.out.println("Water Bill: Rs." + bill);

        // 1c) Methods
        System.out.print("\nEnter morning water usage: ");
        int morningUsage = scanner.nextInt();

        System.out.print("Enter evening water usage: ");
        int eveningUsage = scanner.nextInt();

        int totalConsumption = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total water consumption: "
                + totalConsumption + " litres");

        scanner.close();
    }
}