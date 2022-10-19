package assignment;

import java.util.Scanner;

public class BayviewGlenPool {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Input length: ");
        int length = in.nextInt();

        System.out.print("Input width: ");
        int width = in.nextInt();

        System.out.print("Input depth of the shallow end: ");
        int shallow = in.nextInt();

        System.out.print("Input depth of the deep end: ");
        int deep = in.nextInt();

        System.out.print("Input length of the slope: ");
        int slope = in.nextInt();

        System.out.print("Input length of the shallow end: ");
        int shallowLength = in.nextInt();

        System.out.print("Input price per m^2: ");
        int price = in.nextInt();

        double transitionHeight = deep - shallow;
        double transitionLength = Math.sqrt(slope*slope - transitionHeight*transitionHeight);
        double deepLength = length - shallowLength - transitionLength;
        double volume = (width * shallow * shallowLength + width * deep * deepLength + transitionLength * shallow * width + 0.5 * width * transitionLength * transitionHeight)*900;
        double SA = shallow * shallowLength * 2 + shallowLength * width + (shallow * transitionLength +transitionLength *(deep-shallow)/2)*2 + slope * width + deep * deepLength * 2 + deepLength * width + width * deep + width * shallow;
        double cost = SA * price;

        double roundedVolume = Math.round(volume*100)/100;
        double roundedCost = Math.round(cost*100)/100;
        double roundedSA = Math.round(SA*100)/100;

        System.out.println("This is the price: " + roundedCost + "in m^2");
        System.out.println("This is the water volume for 90% of the pool: "+ roundedVolume);
        System.out.println("The surface area is: "+ roundedSA);
    }
    

        

    

}
