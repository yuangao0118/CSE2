//practice random,if statement and switch statement
// do a random number, then use if and switch to assign value
  
  public class CardGenerator{
      public static void main(String[] args){
          int CardNumber = (int) (Math.random()*(52)+1);//generate random number
          String Suitcolor="";// define suit color
          if (CardNumber <= 13){
              Suitcolor="Diamondes";
          }
          else if (CardNumber <= 26){
              Suitcolor="Clubs";
          }
          else if (CardNumber <=39){
              Suitcolor="Hearts";
          }
          else Suitcolor="Spades";
          String SuitIdentity=""; //define Suit identity
          switch(CardNumber %13){  /////use reminder to determine identitiy
              case 1: ///use : not ;
              SuitIdentity="Ace"; ///remember ;
              break;
              case 2:
              SuitIdentity="2";
              break;
              case 3:
              SuitIdentity="3";
              break;
              case 4:
              SuitIdentity="4";
              break;
              case 5:
              SuitIdentity="5";
              break;
              case 6:
              SuitIdentity="6";
              break;
              case 7:
              SuitIdentity="7";
              break;
              case 8:
              SuitIdentity="8";
              break;
              case 9:
              SuitIdentity="9";
              break;
              case 10:
              SuitIdentity="10";
              break;
              case 11:
              SuitIdentity="Jack";
              break;
              case 12:
              SuitIdentity="Queen";
              break;
              case 0:
              SuitIdentity="King";
              break;
          }
          System.out.println("You picked the " + SuitIdentity + " of " + Suitcolor); //final result
      }
  }
  