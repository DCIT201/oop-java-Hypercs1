public class VehicleRentalManagementSystem {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Add vehicles
        agency.addVehicle(new Car("C001", "Toyota Corolla", 50, true));
        agency.addVehicle(new Motorcycle("M001", "Yamaha R3", 30, true));
        agency.addVehicle(new Truck("T001", "Ford F150", 100, 2.5));

        // Display available vehicles
        System.out.println("Available Vehicles:");
        agency.displayAvailableVehicles();

        // Rent a vehicle
        Customer customer = new Customer("CU001", "John Doe");
        agency.rentVehicle("C001", customer, 3);

        // Display available vehicles again
        System.out.println("\nAvailable Vehicles after renting:");
        agency.displayAvailableVehicles();
    }
}
