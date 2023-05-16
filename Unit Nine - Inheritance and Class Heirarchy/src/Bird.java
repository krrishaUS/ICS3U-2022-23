public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int weight, boolean canFly){
        super(name,weight);
        this.canFly = canFly;

    }
public void makeNoise(){
    System.out.println("tweet");
}
public void Fly(){
    if (canFly)
        System.out.println("I can fly");
    else 
    System.out.println("I am dying");
    Bird budgy = new Bird("Bobby", 5, true);
    budgy.Fly();
    
}
}
