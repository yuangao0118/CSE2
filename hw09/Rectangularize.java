//HW09 Program 2 Rectangularize
//Yuan Gao
//yug216
//create methods that have the same name


import java.util.Scanner;
public class Rectangularize{
    public static void Rect(int input1){
        int n=input1;
        int position=1;
        while(n>0){ //determine line number
            while(position<=input1){ //determine the number of %
                System.out.print("%");
                position++;
            }
            position=1;
            System.out.println(" ");
            n--;
        }
    }
    public static void Rect(String input){
        int length=input.length();
        int n=0;
        while(n<length){ //determine how many lines
            System.out.println(input);
            n++;
        }
    }
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter an input");
        if(myscanner.hasNextInt()){ //determine if it's integer or string
            int input1=myscanner.nextInt(); //store value
            Rect(input1);
        }
        else{
            String input2=myscanner.next();
            Rect(input2);
        }

        
}
}