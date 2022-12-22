package gofish;

import java.util.Scanner;

public class goFish {
   private static final int NUM_SUITS = 4;
   private static final String HEARTS = "H";
   private static final String CLUBS = "C";
   private static final String SPADES = "S";
   private static final String DIAMONDS = "D";
   private static final int NUM_VALUES = 13;
   private static final String JACK = "J";
   private static final String ACE = "A";
   private static final String QUEEN = "Q";
   private static final String KING = "K";
   private static final int NUM_FACE = 13;
   private static final int RESET_CARDS = 5;
   private static final in MAX_SCORE = 10;
   static final Scanner in = new Scanner(System.in);
   public static void main(String[] args) {
   boolean stillPlaying = true;
   boolean isHidden = true;
     String cards1;
     String cards2;
     String cards3;
     String cards4;
     int score1 = 0;
     int score2 = 0;
     int score3 = 0;
     int score4 = 0;
     int beginIndex = 1;
     int randomPlayer = (int)(Math.random()*4)+1;
     String randomCard;

     cards1 = getHand(); 
     cards2 = getHand();
     cards3 = getHand();
     cards4 = getHand();

     System.out.println("Original hand: " + cards1);

     while(score1 < 10 && score2 < 10 && score3 < 10 && score4 < 10){
      String temp = checkPairs(cards1);
      cards1 = parseHand(temp);
      score1 += parseScore(temp);
      temp = checkPairs(cards2);
      cards2 = parseHand(temp);
      score2 += parseScore(temp);   
      temp = checkPairs(cards3);
      cards3 = parseHand(temp);
      score3 += parseScore(temp);   
      temp = checkPairs(cards4);
      cards4 = parseHand(temp);
      score4 += parseScore(temp);   

      System.out.println("New hand: " + cards1);
      System.out.println("Your score: " + score1);
      System.out.println("Player 2 score: " + score2);
      System.out.println("Player 3 score: " + score3);
      System.out.println("Player 4 score: " + score4);
      if (score>= MAX_SCORE){
         if (score1>=MAX_SCORE){
            System.out.println("You win!");
         }else if(score2>=MAX_SCORE){
            System.out.println("Player 2 wins!");
         }else if(score3>=MAX_SCORE){
            System.out.println("Player 3 wins!");
         }else if(score4>=MAX_SCORE){
            System.out.println("Player 4 wins!");
         }

      }

      System.out.println("Requested Card (Please follow the format [card number,suit]): ");
      String face = in.nextLine();
      System.out.println("From requested player: ");
      String player = in.nextLine();
      boolean valid = checkInput(player);
      while(!valid){
         System.out.println("From requested player (either Player 1, 2, or 3): ");
         player = in.nextLine();
         valid = checkInput(player);
         in.nextLine();
      }
      
      in.nextLine();
      String suit;
      String card;
      if(player.equals("2") && cards2.contains(face)){
         suit = cards2.charAt(cards2.indexOf(face)+1) + "";
         card = face + suit;
         cards1 += card;
         cards2 = cards2.replaceFirst(card,"");
         System.out.println("You got " + card + " from " + player);
         }else if (player.equals("3")&& cards3.contains(face)){
            suit = cards3.charAt(cards3.indexOf(face)+1) + "";
         card = face + suit;
         cards1 += card;
         cards3 = cards3.replaceFirst(card,"");
         }else if (player.equals("4")  && cards4.contains(face)){
            suit = cards4.charAt(cards4.indexOf(face)+1) + "";
            card = face + suit;
            cards1 += card;
            cards4 = cards4.replaceFirst(card,"");
         }else{
            card = getCard();
            cards1 += card;
            System.out.println("Player says \"go fish\" " + card);

         }
         for(int i = 2; i<5; i++){
            while (randomPlayer == i){
               randomPlayer = (int)(Math.random() * 4) + 1;
            }
            String hand;
            if (i==2)
            hand = cards2;
            else if (i==3)
            hand = cards3;
            else
            hand = cards4;

         }   
      }
      if(score1 == 10 || score2==10 || score3==10 || score4==10){
         System.out.println("GAME OVER");
         playAgain();
      }
   }

private static boolean checkInput(String request) {
   while(true){
      if("123".indexOf(request)>=0){
         return true;
      }else 
      return false;
   }
   }

private static int parseScore(String hand){
   return Integer.parseInt(hand.substring(hand.indexOf('~') + 1));

}
private static String parseHand(String hand){
   return hand.substring(0, hand.indexOf("~"));
}
private static String getHand() {
   String result = "";
   for (int i=0; i<5; i++){
   result += getCard();
   }
   return result;

}
private static String getCard(){
   return getFace() + getSuit();
}

private static String getFace() {
   int randomNumber = (int)(Math.random() * NUM_FACE) + 1;
   if (randomNumber==1)
   return "A";
   else if (randomNumber==10)
   return "X";
   else if (randomNumber==11)
   return "J";
   else if (randomNumber==12)
   return "Q";
   else if (randomNumber==13)
   return "K";
   else
   return "" + randomNumber;
}
private static boolean playAgain() {
   
   while (true) {
      System.out.print("Play Again ([Y]es/[N]o): ");
      String result = in.nextLine().toLowerCase();

      if (result.equals("y") || result.equals("yes"))
         return true;
      else if (result.equals("n") || result.equals("no"))
         return false;
   }

}
private static String getValue() {
   int iValue = (int) (Math.random() * NUM_VALUES) + 1;

   if (iValue == 1)
      return ACE;
   else if (iValue == 11)
      return JACK;
   else if (iValue == 12)
      return QUEEN;
   else if (iValue == 13)
      return KING;
   else
      return "" + iValue;
}
private static String getSuit() {
   int randomNumber = (int)(Math.random() * NUM_SUITS) + 1;
   if (randomNumber==1)
   return "H";
   else if (randomNumber==2)
   return "C";
   else if (randomNumber==3)
   return "S";
   else 
   return "D"; 
   }
   private static String checkPairs (String hand){
      int count = 0;
      for (int i = 0; i < hand.length()-1; i+=2){
         String c = hand.charAt(i) + "";
         String temp = hand.substring(hand.indexOf(c) + 2);
         if (temp.contains(c)){
            count++;
            hand = hand.substring(0, i) + temp.substring(0, temp.indexOf(c))+ temp.substring(temp.indexOf(c)+2);
            i = RESET_CARDS;
         }

         }
      return hand + "~" + count;

      }
      private static String displayHand(string hand){
         String spaces = " ";
         for(int i = 0;i<cards2.length; i++){
           


         }
      }
    
   }




 
    
          
  
