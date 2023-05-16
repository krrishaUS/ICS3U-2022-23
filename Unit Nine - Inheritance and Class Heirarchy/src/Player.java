public class Player {
    private Weapon weapon;
    private Axe weapon1;

    public Player(){
        weapon = new Axe();
        // Sword sword = new Weapon
    }
    public void useWeapon(){

    weapon.attack();

    }
    public void switchWeapon(String weapon){
        if (weapon.equals("Sword"))
        this.weapon = new Sword();
        else if (weapon.equals("Axe"))
        this.weapon = new Axe();

}
}
/* polymorphism is a reference to different weapons within one class */