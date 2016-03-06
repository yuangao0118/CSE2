/////////////////////////////////////////////////////////////////////////
//Yuan Gao
//Demo 0
//Hello World Java Program
//       java HelloWorld//

//   define a class
import java.util.Scanner;
public class Test{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
      int bit1,bit2,bit3,digits;
      System.out.print("Enter a one, two or three bit binary number-");
      digits=scan.nextInt();
      bit1=digits%10;
      bit2=digits/10%10;
      bit3=digits/100;
      if (digits<0 || bit1>1||bit2>1||bit3>1){
        System.out.println("Bad Int entered");
      
      }
     else {
       System.out.println("Value " + (4*bit3+2*bit2+1*bit1));
     }
  }
}