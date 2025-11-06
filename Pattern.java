//Melin Ozturk
//10/30/2025
//This program will produce different patterns based on the methods being called by using while, do ... while and for loops.

public class Pattern{
    //pre condition :  Each method written should accept an argument that will determine how many lines of the pattern are shown on the screen. 
    //postcondition
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
       // testing goes here
       stars(7);
       triangle(9);
       odds (5);
       eo(11);
       pyramid  (5);

    }
     public static void triangle(int rows){ // use do ... while or while loops
       // code goes here
       int triangle = 1;
       String number ="1";
       int count = 1;

       while (triangle rows)



    }
    
     public static void odds(int start){ // use for loops
       // code goes here
    }
    
      public static void eo(int maxE){ // use loops of your choice
        // code goes here
        String letter = "e";
        if (maxE%2==0)
        letter="o";
    }
     
     public static void pyramid(int rows){
       // code goes here
    }
   
}
