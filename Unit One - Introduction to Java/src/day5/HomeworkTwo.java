package day5;


public class HomeworkTwo {
    public static void main(String[] args) {
        double length = 4.5;
        double width = 2.3;

        double area = length * width;
        double perimeter = (2 * length + 2 * width);

        System.out.println("This is the area: " + Math.round(area * 10.0) / 10.0);
        System.out.println("This is the perimeter: " + perimeter);


    }
}
