import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\t\t\tWelcome To Vending Machine\t\t\t");
            System.out.println("\nSN.\t\tItems\t\tPrice");
            System.out.println("\n1.\t\tWater\t\tRs.25 \n2.\t\tWaiWai\t\tRs.20 \n3.\t\tOreo\t\tRs.25\n4.\t\tKurkure\t\tRs.20");
            System.out.println("\nEnter Your choice (1, 2, 3, or 4):");

            int choice;
            double price, change = 0;
            choice = input.nextInt();

            // Check for invalid choices
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid Choice. Please select a valid option.");
                continue; // Go back to the start of the loop
            }

            switch (choice) {
                case 1:
                    System.out.println("\nYou have chosen Water.");
                    System.out.println("Kindly Pay Rs. 25.");
                    price = input.nextDouble();
                    if (price > 25) {
                        change = price - 25;
                        System.out.println("Collect Your Item and change of Rs." + change + " in Next Window.");
                    } else if (price == 25) {
                        System.out.println("Collect Your Item in Next Window.");
                    } else {
                        System.out.println("Please pay enough money.");
                    }
                    break;

                case 2:
                    System.out.println("\nYou have chosen WaiWai.");
                    System.out.println("Kindly Pay Rs. 20.");
                    price = input.nextDouble();
                    if (price > 20) {
                        change = price - 20;
                        System.out.println("Collect Your Item and change of Rs." + change + " in Next Window.");
                    } else if (price == 20) {
                        System.out.println("Collect Your Item in Next Window.");
                    } else {
                        System.out.println("Please pay enough money.");
                    }
                    break;

                case 3:
                    System.out.println("\nYou have chosen Oreo.");
                    System.out.println("Kindly Pay Rs. 25.");
                    price = input.nextDouble();
                    if (price > 25) {
                        change = price - 25;
                        System.out.println("Collect Your Item and change of Rs." + change + " in Next Window.");
                    } else if (price == 25) {
                        System.out.println("Collect Your Item in Next Window.");
                    } else {
                        System.out.println("Please pay enough money.");
                    }
                    break;

                case 4:
                    System.out.println("\nYou have chosen Kurkure.");
                    System.out.println("Kindly Pay Rs. 20.");
                    price = input.nextDouble();
                    if (price > 20) {
                        change = price - 20;
                        System.out.println("Collect Your Item and change of Rs." + change + " in Next Window.");
                    } else if (price == 20) {
                        System.out.println("Collect Your Item in Next Window.");
                    } else {
                        System.out.println("Please pay enough money.");
                    }
                    break;
            }
        }
    }
}
