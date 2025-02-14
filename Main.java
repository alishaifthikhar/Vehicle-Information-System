import java.util.Scanner;

class VehicleInformationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create a new Car");
        Car car = new Car("Toyota", "Corolla", 2020);
        System.out.print("Enter number of doors: ");
        car.setNumberOfDoors(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter fuel type (petrol, diesel, electric): ");
        car.setFuelType(scanner.nextLine());
        
        System.out.println("\nCreate a new Motorcycle");
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2021);
        System.out.print("Enter number of wheels: ");
        motorcycle.setNumberOfWheels(scanner.nextInt());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter motorcycle type (sport, cruiser, off-road): ");
        motorcycle.setMotorcycleType(scanner.nextLine());
        
        System.out.println("\nCreate a new Truck");
        Truck truck = new Truck("Volvo", "FH16", 2019);
        System.out.print("Enter cargo capacity (in tons): ");
        truck.setCargoCapacity(scanner.nextDouble());
        scanner.nextLine();  // Consume newline
        System.out.print("Enter transmission type (manual, automatic): ");
        truck.setTransmissionType(scanner.nextLine());

        System.out.println("\nVehicle Details:");
        System.out.println("Car - Make: " + car.getMake() + ", Model: " + car.getModel() + 
                           ", Year: " + car.getYearOfManufacture() + ", Doors: " + car.getNumberOfDoors() + 
                           ", Fuel: " + car.getFuelType());
        System.out.println("Motorcycle - Make: " + motorcycle.getMake() + ", Model: " + motorcycle.getModel() + 
                           ", Year: " + motorcycle.getYearOfManufacture() + ", Wheels: " + motorcycle.getNumberOfWheels() + 
                           ", Type: " + motorcycle.getMotorcycleType());
        System.out.println("Truck - Make: " + truck.getMake() + ", Model: " + truck.getModel() + 
                           ", Year: " + truck.getYearOfManufacture() + ", Cargo Capacity: " + truck.getCargoCapacity() + 
                           " tons, Transmission: " + truck.getTransmissionType());

        scanner.close();
    }
}
