import java.util.Scanner;

public class SimpleBankingApp {

    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void deposit() {
        System.out.print("Enter the deposit amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter the withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal not possible.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
