import java.util.Scanner;

public class Car {
    private String type;
    private String brand;
    private String name;
    private String license;
    private int topSpeed;
    private int gasCapacity;
    private int wheels;
    private int entertainmentSystem;

    public Car(String type, String brand, String name, String license, int topSpeed, int gasCapacity, int wheels, int entertainmentSystem) {
        this.type = type;
        this.brand = brand;
        this.name = name;
        this.license = license;
        this.topSpeed = topSpeed;
        this.gasCapacity = gasCapacity;
        this.wheels = wheels;
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getGasCapacity() {
        return gasCapacity;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEntertainmentSystem() {
        return entertainmentSystem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = {
            new Car("SUV", "Mitsubishi", "Triton", "B 1928 WIB", 150, 55, 4, 2),
            // Add more car options here if needed
        };

        while (true) {
            System.out.println("|-----|");
            System.out.println("| No  | 1 | --");
            System.out.println("| Type | Car | Name Triton |");
            System.out.println("|-----|");
            System.out.println("Pick a vehicle number to test drive [ Enter '0' to exit ] : ");

            // Handle non-integer inputs
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume the non-integer input
            }
            int userInput = scanner.nextInt();

            if (userInput == 0) {
                break;
            }

            if (userInput >= 1 && userInput <= cars.length) {
                Car selectedCar = cars[userInput - 1];
                System.out.println("You have chosen the " + selectedCar.getType() + " " + selectedCar.getBrand() + " " + selectedCar.getName() + " with license plate " + selectedCar.getLicense());
                System.out.println("Top speed: " + selectedCar.getTopSpeed() + " mph");
                System.out.println("Gas capacity: " + selectedCar.getGasCapacity() + " gallons");
                System.out.println("Wheels: " + selectedCar.getWheels());
                System.out.println("Entertainment System: " + selectedCar.getEntertainmentSystem());
                System.out.println("Turning on entertainment system...");
            } else {
                System.out.println("Invalid choice. Please pick a valid option.");
            }
        }

        scanner.close();
    }
}
