import java.util.Scanner;
class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Convert INR to USD");
        System.out.println("2. Convert USD to INR");
        System.out.println("3. Quit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                converterInrToUsd();
                break;
            case 2:
                convertUsdToInr();
                break;
            case 3:
                System.out.println("Thank you");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice.Please try again");
        }
    }

    private static void convertUsdToInr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USD amount: ");
        double amount = sc.nextDouble();
        double inr = amount * 83.5;
        System.out.println("usedAmount" + " USD is equivalent to ");
    }

    private static void converterInrToUsd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter INR amount: ");
        double amount = sc.nextDouble();
        double inr = amount / 83.5;
        System.out.println("usedAmount" + " INR is equivalent to ");

    }
}