// input square side of Pyramid and height of Pyramid
// calculate the volume 
  import java.util.Scanner;
  public class Pyramid{
  public static void main(String[] args){
      Scanner MyScanner = new Scanner(System.in);
      System.out.print ("The Square side of Pyramid is: ");
      double SquareSide=MyScanner.nextDouble();
      System.out.print ("The height of the Pyramid is: ");
      double Height=MyScanner.nextDouble();
      double Volume;
      Volume=SquareSide*SquareSide*Height/3;
      System.out.println("The Volume of this Pyramid is: "+ Volume);
      
      }    
  }