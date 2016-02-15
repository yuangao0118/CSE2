//HW03 Convert
//Yuan Gao
//yug216
//Convert Meter to inches
// input meter and convert to inches
  import java.util.Scanner; //first line, import scanner
  public class Convert{
      public static void main(String[] args){
          Scanner MyScanner = new Scanner(System.in); //define scanner
          System.out.print ("Enter the distance in meters: ");
          double DistanceInMeter=MyScanner.nextDouble();
          double MetertoInches; //meter to inches converison
          MetertoInches=39.3701; //conversion
          double DistanceInInch=0;
          DistanceInInch=MetertoInches*DistanceInMeter*100/100;
          System.out.println(DistanceInMeter + " meters is " + DistanceInInch + " Inches.");
          
      }
  }