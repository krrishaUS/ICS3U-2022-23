package day5;

public class HomeworkFive {
    public static void main(String[] args) {
        int wins = 110;
        int loss = 44;
        double gamestotal = wins + loss;

        double winPercent = Math.round((wins/gamestotal * 0.01) / 0.01);
        System.out.println("This is the winning percentage: " + winPercent);
    }
}
