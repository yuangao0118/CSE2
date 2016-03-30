//HW09 Program 1 Games
//Yuan Gao
//yug216
//create method
        import java.util.Random; //import random number generator
        import java.util.Scanner;
        public class Games{
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
            public static void spinTheWheel(){
                Random randomGenerator= new Random(); //call for rondom number
                Scanner myscanner= new Scanner(System.in); //call for scanner
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
            public static void scrambler(String input){
                String word = input;
                int length= word.length();
                int number=0; 
                Random random = new Random();//create a random object
                String a =""; String b="";
                while(number<50){
                    int randomNum=random.nextInt(length);
                    a=word.substring(0,randomNum);
                    b=word.substring(randomNum,length);
                    word=b+a;
                    number++;
                }
                System.out.println("Your new word is "+ word);
            }
            public static void main(String[] args){
                System.out.println("Welcome to Yuan's Game Center");
                System.out.println("Choose the game you want to play: type: guesstheBox, spinTheWheel or scrambler");
                Scanner myscanner= new Scanner(System.in);
                Random randomGenerator= new Random();
                String Gametype=myscanner.next(); //user input of game name
                switch(Gametype){
                        case "guesstheBox" :
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
                            break;
                        case "spinTheWheel" :
                            spinTheWheel();
                            break;
                        case "scrambler" :
                            System.out.println("Enter a word for scrambling");
                            String input = myscanner.next();
                            scrambler(input);
                            break;
                        default:
                            System.out.println("I don't have this game");
                            break;
                    }
} 
}