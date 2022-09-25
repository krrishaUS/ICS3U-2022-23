package day5;

public class HomeworkFour {
    public static void main(String[] args) {
        int minutes = 525600;
        int seconds = minutes * 60;
        double lightSpeed = 300000000;

        double distance = seconds * lightSpeed;
        System.out.println("Distance travelled by a light beam in a year: " + distance + "m/s");

    }
}
