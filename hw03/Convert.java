// Convert Meter to inches
// input meter and convert to inches
  import java.util.Scanner;
  public class Convert{
      public static void main(String[] args){
          Scanner MyScanner = new Scanner(System.in);
          System.out.print ("Enter the distance in meters: ");
          double DistanceInMeter=MyScanner.nextDouble();
          double MetertoInches; //meter to inches converison
          MetertoInches=39.37;
          double DistanceInInch;
          DistanceInInch=MetertoInches*DistanceInMeter;
          System.out.println(DistanceInMeter + " meters is " + DistanceInInch + " Inches.");
          
      }
  }