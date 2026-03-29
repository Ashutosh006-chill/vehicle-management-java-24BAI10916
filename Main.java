import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FleetManager fleet = new FleetManager();

        System.out.println("=====================================");
        System.out.println("   Vehicle Fleet Management System   ");
        System.out.println("=====================================");

        while (true) {
            System.out.println("\n1. Register New Vehicle");
            System.out.println("2. View Entire Fleet");
            System.out.println("3. Exit System");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Brand (e.g., Toyota): ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter Model Name (e.g., Camry): ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Manufacturing Year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter Base Price: ");
                    double price = scanner.nextDouble();

                    Vehicle newVehicle = new Vehicle(brand, model, year, price);
                    fleet.registerVehicle(newVehicle);
                    System.out.println("\n[+] Success: Vehicle registered to the fleet!");
                    break;
                case 2:
                    System.out.println("\n--- Current Fleet List ---");
                    if (fleet.getFleetSize() == 0) {
                        System.out.println("[-] The fleet is currently empty.");
                    } else {
                        for (Vehicle v : fleet.fetchAllVehicles()) {
                            System.out.println(v.toString());
                        }
                    }
                    System.out.println("--------------------------");
                    break;
                case 3:
                    System.out.println("\nShutting down system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\n[!] Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
