//HW03 Calculate Pyramid volume
//Yuan Gao
//yug216
// input square side of Pyramid and height of Pyramid
// calculate the volume 
  import java.util.Scanner; //import Scanner
  public class Pyramid{
  public static void main(String[] args){
      Scanner MyScanner = new Scanner(System.in);
      System.out.print ("The Square side of Pyramid is: "); //ask for input
      double SquareSide=MyScanner.nextDouble();
      System.out.print ("The height of the Pyramid is: "); //ask for input
      double Height=MyScanner.nextDouble();
      double Volume;
      Volume=SquareSide*SquareSide*Height/3; //function
      System.out.println("The Volume of this Pyramid is: "+ Volume);
      
      }    
  }