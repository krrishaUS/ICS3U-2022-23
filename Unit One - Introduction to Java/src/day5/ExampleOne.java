package day5;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        //readign data from the keyboard 
        // not on first quest
        // not on AP exam
        Scanner in = new Scanner(System.in);

        double radius;

        System.out.print("Please enter the radius: ");
        radius = in.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle of radius" + radius + "is" + area);

        in.close();
    
    }
}
