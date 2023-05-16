public class Animal{
    private String name;
    private int weight;
    private int age;


    public Animal (String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }

    public void eat(){
        weight++;
    }

    public void makeNoise(){
        System.out.println("zzz.......");

    }
    
}