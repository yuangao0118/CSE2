//HW07 Program 1 Twisty
//Yuan Gao
//yug216
//use loop and input

    import java.util.Scanner; //import scanner
    public class Twisty{
        public static void main(String[] args){
            Scanner myscanner = new Scanner(System.in);
            System.out.print("Input your desired length : ");
            Integer Length=0, Width=0, tempL=0, tempW=0;
            boolean LengthAcceptable= false, WidthAcceptable= false; //Test for if the input is valid
            while (! LengthAcceptable){
                if (myscanner.hasNextInt()){
                    tempL=myscanner.nextInt(); //store length
                    if (tempL<=80 && tempL>0){
                    LengthAcceptable= true;
                    Length=tempL;
                    }
                    else{
                     System.out.println("Wrong Input,please enter a interger between 1-80");
                     System.out.println("Input your desired length : ");
                     tempL=0;
                    }
                }
                else{
                    System.out.println("Wrong Input,please enter a interger");
                    System.out.println("Input your desired length : ");
                    myscanner.next();
                }
            }
            ////////System.out.println(Length); //Test only
            System.out.println("Input your desired Width : ");
            while (! WidthAcceptable){       //Test for Width
                if (myscanner.hasNextInt()){
                    tempW=myscanner.nextInt(); //store width
                    if (tempW>0){
                        if(tempW<Length){
                            WidthAcceptable= true;
                            Width=tempW;
                        }
                        else{
                            System.out.println("Wrong Input, please enter an integer smaller than length.");
                            System.out.println("Input your desired width: ");
                            tempW=0;
                        }            
                    }
                    else{
                     System.out.println("Wrong Input,please enter a interger greater than 0");
                     System.out.println("Input your desired width : ");
                     tempW=0;
                    }
                }
                else{
                    System.out.println("Wrong Input,please enter a interger");
                    System.out.println("Input your desired Width : ");
                    myscanner.next();
                }
            }
            ///System.out.println(Width); //Test only end of Input part
            int a=0; //define variable
            while(a<Width){
                int linenum=1, position=1;
                for(position=1;position<=Length;position++){  //compare position with length
                     if(((position+2*Width-a)%(2*Width))==(Width+1)){
                      System.out.print("\\");   // do \\ first to cover #, then do # to cover /
                    }
                    else if((position-2*Width+a)%(2*Width)==0 || position%(2*Width)==1+a){
                      System.out.print("#");  
                    }      //determine the condition for each symbol
                    else if(position%(2*Width)==Width-a){
                      System.out.print("/");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(""); //change to next line
                a++; //use a to determine total height
            } //end of the outter loop
            
}
}