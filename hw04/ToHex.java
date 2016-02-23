//HW04 ToHex
//Yuan Gao
//yug216
//Input RGB number from (0-255) output hexdecimal number

   import java.util.Scanner; //firt line import scanner
   public class ToHex{
       public static void main(String[] args){
           Scanner myScanner = new Scanner(System.in); // define scanner
           System.out.print ("Please enter three numbers representing RGB Value "); //how to do three in a line
           //int R=MyScanner.nextInt(); //Input value of R
           //int G=MyScanner.nextInt(); //Input value of G
           //int B=MyScanner.nextInt(); //Input value of B
           int R,G,B = 0;
           int temp =0;
           if (myScanner.hasNextInt()){   //check if the input is integer
               temp=myScanner.nextInt(); 
           
                if (temp<=255&&temp>=0){     ///check if the integer is between 0-255
                    R=temp;
                }
           
               else{ 
                   System.out.println("Sorry, you must enter values between 0-255.");
                    return;
               }
           }    
           else {
               System.out.println("Sorry, you input must consist of integers.");
                return;
          }
          if (myScanner.hasNextInt()){   //check if the input is integer
               temp=myScanner.nextInt(); 
           
                if (temp<=255&&temp>=0){     ///check if the integer is between 0-255
                    G=temp;
                }
           
               else{ 
                   System.out.println("Sorry, you must enter values between 0-255.");
                    return;
               }
           }    
           else {
               System.out.println("Sorry, you input must consist of integers.");
                return;
          }
          if (myScanner.hasNextInt()){   //check if the input is integer
               temp=myScanner.nextInt(); 
           
                if (temp<=255&&temp>=0){     ///check if the integer is between 0-255
                    B=temp;
                }
           
               else{ 
                   System.out.println("Sorry, you must enter values between 0-255.");
                    return;
               }
           }    
           else {
               System.out.println("Sorry, you input must consist of integers.");
                return;
          } //ended for data validation
          String ROutput="",GOutput="",BOutput=""; //define output
          String RResult="",RReminder=""; //define Result and reminder for tempory output
          if (R>9){
              if (R%16>9){      //last digit for R
              switch (R%16 ){
                  case 10:
                      RReminder="A";
                      break;
                  case 11:
                      RReminder="B";
                      break;
                  case 12:
                      RReminder="C";
                      break;
                  case 13:
                      RReminder="D";
                      break;
                  case 14:
                      RReminder="E";
                      break;
                  case 15:
                      RReminder="F";
                      break;
              }
            }
            else {
                RReminder="" + R%16;
            }  // end of reminder test
          
            if (R/16>9){        //first digit for R
            switch (R/16){
              case 10:
                  RResult="A";
                  break;
              case 11:
                  RResult="B";
                  break;
              case 12:
                  RResult="C";
                  break;
              case 13:
                  RResult="D";
                  break;
              case 14:
                  RResult="E";
                  break;
              case 15:
                  RResult="F";
                  break;
                }
        
            }
            else {
            RResult="" + R/16;
            } //End of result test
            ROutput= RResult+RReminder;
          //System.out.println(ROutput);   //used for test only
          }
          else {
              ROutput="0"+R;
              //System.out.println(ROutput);  //used for test only                                   
          }// ended for R output
          //GOutput
          String GResult="",GReminder=""; //define Result and reminder for tempory output G
           if (G>9){      
              if (G%16>9){       //last digit for G
              switch (G%16 ){
                  case 10:
                      GReminder="A";
                      break;
                  case 11:
                      GReminder="B";
                      break;
                  case 12:
                      GReminder="C";
                      break;
                  case 13:
                      GReminder="D";
                      break;
                  case 14:
                      GReminder="E";
                      break;
                  case 15:
                      GReminder="F";
                      break;
              }
            }
            else {
                GReminder="" + G%16;
            }  // end of reminder test
          
            if (G/16>9){         //first digit for G
            switch (G/16){
              case 10:
                  GResult="A";
                  break;
              case 11:
                  GResult="B";
                  break;
              case 12:
                  GResult="C";
                  break;
              case 13:
                  GResult="D";
                  break;
              case 14:
                  GResult="E";
                  break;
              case 15:
                  GResult="F";
                  break;
                }
            }
            else {
            GResult="" + G/16;
            } //End of result test
            GOutput= GResult+GReminder;
          // System.out.println(GOutput);  //used for test only
          }
          else {
              GOutput="0"+G;
              //System.out.println(GOutput); //used for test only finsihed for G                                    
          } //finsihed for G
          // produce B output
          String BResult="",BReminder=""; //define temopry part for B
           if (B>9){
              if (B%16>9){
              switch (B%16 ){
                  case 10:
                      BReminder="A";
                      break;
                  case 11:
                      BReminder="B";
                      break;
                  case 12:
                      BReminder="C";
                      break;
                  case 13:
                      BReminder="D";
                      break;
                  case 14:
                      BReminder="E";
                      break;
                  case 15:
                      BReminder="F";
                      break;
              }
            }
            else {
                BReminder="" + B%16;
            }  // end of reminder test
            if (B/16>9){
            switch (B/16){
              case 10:
                  BResult="A";
                  break;
              case 11:
                  BResult="B";
                  break;
              case 12:
                  BResult="C";
                  break;
              case 13:
                  BResult="D";
                  break;
              case 14:
                  BResult="E";
                  break;
              case 15:
                  BResult="F";
                  break;
                }
        
            }
            else {
            BResult="" + B/16;
            } //End of result test
            BOutput= BResult+BReminder;
          //System.out.println(BOutput); //usd for test only
          }
          else {
              BOutput="0"+B;
              //System.out.println(BOutput);  //used for test only                                     
          } //end of Generate B
          String Hexadecimal ="";
          Hexadecimal=ROutput+GOutput+BOutput;
          System.out.println("The decimal numbers R: "+R+ ", G: " + G + " B: "+ B + ", is represented in hexadecimal as: " +Hexadecimal);
       
     }
   }
