public class Zoo {
    public static void main(String[] args) {
        Animal ani = new Animal ("Max", 50);
        ani.eat();
        ani.makeNoise();
        ani.getWeight();
        System.out.println(ani.getWeight());

        Dog doggy = new Dog("Ralph", 100,"Sheep Dog");
        doggy.makeNoise();
        doggy.eat();
        System.out.println(doggy.getWeight());






        
    }

}
