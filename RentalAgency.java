import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;

    public RentalAgency() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void displayAvailableVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailableForRental()) {
                System.out.println(vehicle.getModel() + " (ID: " + vehicle.getVehicleId() + ")");
            }
        }
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                double cost = vehicle.calculateRentalCost(days);
                System.out.println("Vehicle rented successfully to " + customer.getName() + ". Total cost: " + cost);
                vehicle.setAvailable(false);
                return;
            }
        }
        System.out.println("Vehicle not available for rental.");
    }
}
