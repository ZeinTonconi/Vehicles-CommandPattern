public class Motorcycle implements Vehicle{

    public Motorcycle(){
        System.out.println("Motorcycle created");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle: RUUUMM");
    }

    @Override
    public void decelerate() {
        System.out.println("Motorcycle: Slower");
    
    }

    @Override
    public void start() {
        System.out.println("Motorcycle: on");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle: off");
    }
    
}
