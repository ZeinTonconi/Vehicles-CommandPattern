public class GhostRider {
    
    private Command command;
    
    public GhostRider(Command command){
        this.command = command;
    }    

    public void revertAction(){
        command.revert();
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void takeAction(){
        command.execute();
    }
}
