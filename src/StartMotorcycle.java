public class StartMotorcycle implements Command {
    
    private Motorcycle motorcycle;

    public StartMotorcycle(Motorcycle motorcycle){
        this.motorcycle = motorcycle;
    }

    @Override
    public void execute() {
        motorcycle.start();
    }

    @Override
    public void revert() {
        motorcycle.stop();
    }    
    
}
