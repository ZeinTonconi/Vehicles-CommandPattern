public class AccelerateMotorcycle implements Command {
    private Motorcycle motorcycle;
    public AccelerateMotorcycle(Motorcycle motorcycle){
        this.motorcycle = motorcycle;
    }
    @Override
    public void execute() {
        motorcycle.accelerate();
    }
    @Override
    public void revert() {
        motorcycle.decelerate();
    }
    
}
