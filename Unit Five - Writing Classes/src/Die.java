public class Die {
    // private attributes are only visible in the class 
    // attributes define the current state of this class
    // attributes - info about the current state of the die at any particular time 
    private int numSides;
    private int topSide;

    public int getTopSide() {
        return topSide;
    }
    public Die(int numberOfSides){
        this.numSides = numberOfSides; // "this" refers to this particular instance of the class
        this.roll();


    }
    public Die(){
        this.numSides = 6;
        roll();
    }
    /* if you do not explicity write your own constructor, Java will implicitly supply one that takes no arguments and calles your parents constructor */

    public void roll() {
        topSide = (int)(Math.random()*numSides) + 1;

    } 
    public String toString(){
        return "" + this.topSide;
    }


}
