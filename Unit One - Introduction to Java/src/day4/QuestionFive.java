package day4;

public class QuestionFive {
    public static void main(String[] args) {
        double penny = 0.01;
        double nickels = 0.05;
        double dimes = 0.1;
        double quater = 0.25;
        int loonie = 1;
        int toonie = 2;

        double totalp = penny * 12;
        double totaln = nickels * 3;
        double totald = dimes * 10;
        double totalq = quater * 5;
        int totall = loonie * 6;
        int totalt = toonie * 4;

        double totalmoney = totalp + totaln + totald + totalq + totall + totalt;

        System.out.println("This total amount of money is" + totalmoney);



        


    }
}
