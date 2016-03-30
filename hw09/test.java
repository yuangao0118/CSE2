        import java.util.Random; //import random number generator
        import java.util.Scanner;
        public class test{
            public static String guesstheBox(int input){
                Random randomGenerator= new Random();
                int random1 = randomGenerator.nextInt(3)+1;
                        if(input==random1){
                            System.out.println("You win a prize!! You get $100!");
                        }
                        else{
                            System.out.println("Sorry, You lost...");
                        }
                        String result="";
                        return result;
                    }
              public static void main(String[] args){
                System.out.println("Welcome to Yuan's Game Center");
                System.out.println("Choose the game you want to play: type: guesstheBox, spinTheWheel or scrambler");
                Scanner myscanner= new Scanner(System.in);
                System.out.println("Please choose a number from 1,2,3");
                             boolean validinput=false;
               while(!validinput){
                   if(myscanner.hasNextInt()){
                       int temp1=myscanner.nextInt();//store value
                       if((temp1==1) || (temp1==2) || (temp1==3)){
                           int input=temp1;
                           guesstheBox(input);
                           validinput=true;
                       }
                       else{
                           System.out.println("Wrong input, enter again");
                           temp1=0;
                       }
                   }
                   else{
                       System.out.println("Wrong inout");
                       myscanner.next();
                   }
               }
                            
}
}
