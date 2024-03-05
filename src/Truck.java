public class Truck implements Vehicle{
    public Truck(){
        System.out.println("Truck created");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck: RUUUMM");
    }

    @Override
    public void decelerate() {
        System.out.println("Truck: Slower");
    
    }

    @Override
    public void start() {
        System.out.println("Truck: on");
    }

    @Override
    public void stop() {
        System.out.println("Truck: off");
    }
    
}
