 import java.util.Random; //import random number generator
import java.util.Scanner;        
        public class test2{
             public static void main(String[] args){
                Random randomGenerator=new Random();
                System.out.println("Welcome to Yuan's Game Center");
                System.out.println("Choose the game you want to play: type: guesstheBox, spinTheWheel or scrambler");
                Scanner myscanner=new Scanner(System.in);
                System.out.println("Please choose a color from black and red");
                 String temp="";
                 String color="";
                 int colornumber=0;
                 boolean validcolor=false;
                 while(!validcolor){
                  temp=myscanner.next();
                     if((temp.equals("Red"))||(temp.equals("red"))){
                         color=temp;
                         validcolor=true;
                         colornumber=5;
                     }
                     else if((temp.equals("Black"))||(temp.equals("black"))){
                      color=temp;
                      validcolor=true;
                      colornumber=0;
                     }
                     else{
                         System.out.println("Wrong input, please enter black or red");
                     }
                 } //end of color input
              System.out.println("Please enter a integer from 1-5");
              boolean validnumber=false;  //start number input
              int number=0;
              while(! validnumber){
               if(myscanner.hasNextInt()){
                  int tempnum=0; //set up a temp storage
                tempnum=myscanner.nextInt();
                if(tempnum<=5 && tempnum>=1){ //if it's between 1-5
                 number=tempnum;
                 validnumber=true;
                }
                else{
                 System.out.println("Wrong input,please enter from 1-5");
                 myscanner.next();
                }
               }
                else{
                 System.out.println("Wrong input, please enter from 1-5");
                 myscanner.next();
                }
           }
           int guestnumber=colornumber+number;
           int random2 = randomGenerator.nextInt(10)+1; //a total of ten choice
                if (guestnumber ==random2){
                    System.out.println("Congrts! You winning numer is " +color+ " "+ number);
                    }
                else{
                    System.out.println("Sorry, you lost...");
                }
}
}