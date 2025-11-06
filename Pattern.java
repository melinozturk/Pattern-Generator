//Melin Ozturk
//10/30/2025
//This program will produce different patterns based on the methods being called by using while, do ... while and for loops.

public class Pattern{
    //pre condition :  Each method written should accept an argument that will determine how many lines of the pattern are shown on the screen. 
    //postcondition : The patterns shown in the directions document will match exactly with the ones that my code outputs. 

    public static void stars(int rows){ // use while loops
       // code goes here
        int stars = 1;
        String star = "*";

        while (stars<= rows){
          System.out.println(star);
          star+="**";
          stars+=1;
        }

       }
    
      public static void main(String []args){
       //testing goes here
       System.out.println("Stars:");
      stars(7);
      System.out.println("Triangle:");
       triangle(9);
       System.out.println("Odds:");
       odds (9);
       System.out.println("EO:");
       //eo(11);
       System.out.println("Pyramid:");
       //pyramid  (5);

    }
     public static void triangle(int rows){ // use do ... while or while loops
       // code goes here
       /*int triangle = 1;
       String number = "1";
       int count = 1;*/

       int currentNumber = 1;
       
       while (currentNumber < rows+1) {
        for (int i = 0; i < currentNumber; i++) {
          String convertedNumber = String.valueOf(currentNumber);
          System.out.print(convertedNumber);
        }

        System.out.println();
        currentNumber += 1;
       }

    }
    
     public static void odds(int start){ // use for loops
       // code goes here
       if (start%2==0)
           start--; //minus one because we need to make it odd even if its even. 
       for (int i = start; i >= 1; i-=2) {
        for (int count = 0; count < i; count++) {
          System.out.print(i);
        }

        System.out.println();
       }
    }
    
      public static void eo(int maxE){ // use loops of your choice
        // code goes here
        String letter = "e";
        if (maxE%2==0)
        letter="o";
        else letter ="e";

        for (int first=1; i<=maxE ; first++)




        int Counted = 0;

        for (int i = 0; i <= maxE*2; i--) {
          int CountQuantity = i+1;
          boolean IsReversing = i >= maxE;

          if (IsReversing) {
            CountQuantity = maxE - (i-maxE);
          }
          
          String GoalLetter = "";

          if (CountQuantity % 2 == 0) {
            GoalLetter = "E";
          } else {
            GoalLetter = "O";
          }

          for (int index = 0; index < CountQuantity; index++) {
            System.out.print(GoalLetter);
          }

          System.out.println();
        }
    }
     
     public static void pyramid(int rows){
       // code goes here
       int pyramid = 1;

    }
   
}
