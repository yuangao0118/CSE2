//HW06 Program 1 Fibonacci
//Yuan Gao
//yug216
//Input two intergers for variable and one for the length of Fibonacci

    import java.util.Scanner;
    public class Fibonacci{
        public static void main(String[] args){
            Scanner MyScanner= new Scanner(System.in);
            int a0=-1,a1=0,number=0;//define three input
            boolean goodinput1 = false, goodinput2=false, goodinput3=false;
            int temp1=0, temp2=0,temp3=0;
            System.out.println("Enter the first number in the sequence: ");
           while(!goodinput1){
               System.out.println("Please enter a positive integer: ");
               if (MyScanner.hasNextInt() ){   //check if it is a integer
                   temp1 = MyScanner.nextInt();
                   if (temp1>0){   //check if it is positive
                       a0=temp1;
                       goodinput1=true;  //change for while loop
                   }
                   else{
                       System.out.println("Please enter a positive number.");
               }
               }
               else{
                   MyScanner.next();
                   System.out.println("Please enter a positive integer.");
               }
            } //end of the loop
            System.out.println("Enter the second number in the sequence: ");
             while(!goodinput2){  ///same thing for a1
               System.out.println("Please enter a positive integer: ");
               if (MyScanner.hasNextInt() ){   //check if it is a integer
                   temp2 = MyScanner.nextInt();
                   if (temp2>0){   //check if it is positive
                       a1=temp2;
                       goodinput2=true;  //change for while loop
                   }
               }
               else{
                   MyScanner.next();
               }
            } //end of the loop
             System.out.println("How many custom Fibonacci number should be printed: ");
             while(!goodinput3){  ///same thing for the number
               System.out.println("Please enter a positive integer: ");
               if (MyScanner.hasNextInt() ){   //check if it is a integer
                   temp3 = MyScanner.nextInt();
                   if (temp3>0){   //check if it is positive
                       number=temp3;
                       goodinput3=true;  //change for while loop
                   }
               }
               else{
                   MyScanner.next();
               }
            } //end of the loop
            int a2=0;
            System.out.println("The numbers are: "); 
            System.out.print(a0+", " + a1+ ", "); //in a different line
            while (number-2>0){   //define how many number we want
                 a2=a0+a1;
                 if(number-2>1){   ///to determine use "," or "."
                System.out.print(a2+ ", ");
                 }
                 else{
                     System.out.print(a2+ ".");  
                 }
                a0=a1;
                a1=a2;
                number--;
            } //end of loop
            ///System.out.println(a0+a1+number);//test only!!
        }
    }
