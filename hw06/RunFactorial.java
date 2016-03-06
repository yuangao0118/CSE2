//HW06 Program 2 Factorial
//Yuan Gao
//yug216
//Calculate factorial between 9 and 16

    import java.util.Scanner;
    public class RunFactorial{
        public static void main(String[] args){
            Scanner MyScanner= new Scanner(System.in);
            int a0=-1;//define input
            boolean goodinput = false;
            int temp=0;
            System.out.println("Please enter an integer between 9 and 16: ");
           while(!goodinput){
               if (MyScanner.hasNextInt() ){   //check if it is a integer
                   temp = MyScanner.nextInt();
                   if (temp<=16 && temp>=9){   //check if it is between 9 and 16
                       a0=temp;
                       goodinput=true;  //change for while loop
                   }
                   else{
                       System.out.println("Invaild input, enter again!");
               }
            }
               else{
                   MyScanner.next();
                   System.out.println("Invaild input, enter again!");
               }
            } //end of the loop
            System.out.println("Input accepted: ");
            int a0original=a0; //keep value for original a0
            int result=1; //default value for result
            while(a0>0){
                result=result*a0; //do the calculation
                a0--; //a0 decrease
            }
            System.out.println(a0original +"! = "+result);
        }
    }
            