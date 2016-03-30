//getting familiar with methods
//yug216
//lab09

    import java.util.Random;
    import java.util.Scanner;
    public class Method{
         public static String Adjective(int Randomnum){
                String Adj="";
                switch(Randomnum){
                    case 0:
                        Adj="beatiful";
                        break;
                    case 1:
                        Adj="tough";
                        break;
                    case 2: 
                        Adj="happy";
                        break;
                    case 3:
                        Adj="angry";
                        break;
                    case 4:
                        Adj="sad";
                        break;
                    case 5:
                        Adj="stupid";
                        break;
                    case 6:
                        Adj="cold";
                        break;
                    case 7:
                        Adj="demanding";
                        break;
                    case 8:
                        Adj="tired";
                        break;
                    case 9:
                        Adj="brave";
                         break;
                }
                return Adj;
            }
        public static String Subject(int Randomnum){
                String Subject="";
                switch(Randomnum){
                    case 0:
                        Subject="cat";
                        break;
                    case 1:
                        Subject="dog";
                        break;
                    case 2: 
                        Subject="father";
                        break;
                    case 3:
                        Subject="mother";
                        break;
                    case 4:
                        Subject="lion";
                        break;
                    case 5:
                        Subject="NPC";
                        break;
                    case 6:
                        Subject="boss";
                        break;
                    case 7:
                        Subject="tiger";
                        break;
                    case 8:
                        Subject="fox";
                        break;
                    case 9:
                        Subject="ele";
                         break;
                }
                return Subject;
            }
             public static String Verb(int Randomnum){
                String Verb="";
                switch(Randomnum){
                    case 0:
                        Verb="hitted";
                        break;
                    case 1:
                        Verb="caught";
                        break;
                    case 2: 
                        Verb="threw";
                        break;
                    case 3:
                        Verb="climbed";
                        break;
                    case 4:
                        Verb="ran";
                        break;
                    case 5:
                        Verb="talked";
                        break;
                    case 6:
                        Verb="walked";
                        break;
                    case 7:
                        Verb="lied";
                        break;
                    case 8:
                        Verb="passed";
                        break;
                    case 9:
                        Verb="swam";
                         break;
                }
                return Verb;
            }
             public static String Object1(int Randomnum){
                String Object1="";
                switch(Randomnum){
                    case 0:
                        Object1="wall";
                        break;
                    case 1:
                        Object1="ladder";
                        break;
                    case 2: 
                        Object1="blake";
                        break;
                    case 3:
                        Object1="G-dragon";
                        break;
                    case 4:
                        Object1="garden";
                        break;
                    case 5:
                        Object1="map";
                        break;
                    case 6:
                        Object1="cup";
                        break;
                    case 7:
                        Object1="Ex-boyfriend";
                        break;
                    case 8:
                        Object1="lake";
                        break;
                    case 9:
                        Object1="Ex-girlfriend";
                         break;
                }
                return Object1;
            }
        public static void main (String[] args ){
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(10);
            //System.out.println(randomInt); //test only
            String Adj1=Adjective(randomInt);
           // System.out.println(Adj1); //tesy only
            randomInt = randomGenerator.nextInt(10); // for a new random number
           // System.out.println(randomInt); //test only
            String Subject=Subject(randomInt);
           // System.out.println(Subject); //test only
            randomInt = randomGenerator.nextInt(10); //another randow number
            //System.out.println(randomInt); //test only
            String Verb=Verb(randomInt);
            //System.out.println(Verb); //test only
            randomInt = randomGenerator.nextInt(10); //another randow number
           // System.out.println(randomInt); //test only
            String Object1=Object1(randomInt);
           // System.out.println(Object1); //test only
            randomInt = randomGenerator.nextInt(10); // for a new random number
            String Adj2=Adjective(randomInt);
            randomInt = randomGenerator.nextInt(10); // for a new random number
            String Adj3=Adjective(randomInt);
            boolean anothersentence=true;
            while(anothersentence){
                System.out.println("The " + Adj1+" "+Adj2+ " " +Subject+ " "+Verb+" the "+ Adj3+ " " +Object1);
                System.out.println("Would you like this sentence? If No. Type No");
                Scanner myscanner = new Scanner(System.in);
                String input=myscanner.next();
                if(input.equals("No")){
                    anothersentence=true;
                }
                else{
                    anothersentence=false;
                }
            }
}
}