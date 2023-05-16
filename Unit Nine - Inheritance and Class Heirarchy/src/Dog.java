public class Dog extends Animal{
    // Animal is the parent class/ super class and Dog is the sub class/child class 
    /*because Dog extends Animal it gets everything that Animal has
     * 
    */
    
    

    private String breed;
    /* If you do not explicitly create/supply a constructor then java will implicitly create/supply a no argument constructor */


    /* first line of a constructor must call the parent classes constructor 
    - if you do not then java calls super()
    - if it is not there then java gets mad*/ 
    public Dog(String name, int weight,String breed){
        super(name,weight);
        this.breed = breed;

    }

    public void eat() {
        /*super.__() refers to the parents version of the method */
      super.eat();
      super.eat();
    }

    public void makeNoise(){
        System.out.println("WOOF! WOOF!");
    }


}

