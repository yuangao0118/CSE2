//getting familiar with loop
//input length
import java.util.Scanner;
public class TwistGenerator {
    public static void main (String[]args){
        Scanner MyScanner = new Scanner(System.in);
        int length=-1;
        System.out.println("Please put a positive interger: ");
        while (MyScanner.hasNextInt() == false){          //check if it's int
            System.out.println("Wrong input, Re-enter");
            String a=MyScanner.next();
        }
        length=MyScanner.nextInt();
        while(length<=0){                 //check if it's positive
            System.out.println("Please enter a value >0");
            length=MyScanner.nextInt();
        }
        
    }
}