import java.util.List;

public class RideVehicle {

    public static void main(String[] args) {

        List<Vehicle> vehicles = List.of(new Motorcycle(), new Truck());

        Command startAllVehicles = new StartAllVehicles(vehicles);
        
        GhostRider ghostRider = new GhostRider(startAllVehicles);

        ghostRider.takeAction();
        ghostRider.revertAction();

        ghostRider.setCommand(new AccelerateMotorcycle(new Motorcycle()));

        ghostRider.takeAction();
        ghostRider.revertAction();

    }    
}
