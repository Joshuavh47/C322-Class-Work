public class User extends Observable implements Observer{
    Screen screen;
    String name;
    public String toString(){
        return this.name;
    }
    public User(String name){
        this.name = name;
        this.screen = new Screen(this);
    }
    public void update(Observable thing, Object message){
        System.out.println(this.name + " hears " + thing + " saying: " + message);
        String output = String.format("%s says: %s", thing, message);
        screen.addMessage(output);
    }
    public void broadcast(String message){
        System.out.println(this.name + " says: " + message);
        String output = String.format("You (%s) say: %s",this.name,message);
        screen.addMessage(output);
        setChanged();
        notifyObservers(message);
        clearChanged();
    }
}