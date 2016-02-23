// Lab03-chech 
// ask the user to give input and calculate the cost per person
  import java.util.Scanner;
  public class Check{
      public static void main(String[] args){
          Scanner MyScanner = new Scanner( System.in );
          System.out.print (" Enter the original cost of the check in the form xx.xx: ");
          double checkCost= MyScanner.nextDouble();
          System.out.print(" Enter the percentage tip that you wish to pay as a whole number (in the form xx):");
          double tipPercent = MyScanner.nextDouble();
          tipPercent /=100; //convert into decimal
          System.out.print( "enter the number of people who went out to dinner: ");
          int numPeople = MyScanner.nextInt();
          double totalCost;
          double costPerPerson;
          int dollars;
          int dimes, pennies; //storing digits
          totalCost= checkCost * (1+tipPercent);
          costPerPerson = totalCost/numPeople;
          dollars=(int)costPerPerson; //get rid of decimal
          dimes=(int)(costPerPerson*10)%10; //% returns reminder
          pennies=(int)(costPerPerson*100)%10;
          System.out.println(" Each person in the group owes $" + 
          dollars + "." + dimes + pennies);
      }
  }