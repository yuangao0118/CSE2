//HW07 Program 2 Triangles
//Yuan Gao
//yug216
//use loop and input

    import java.util.Scanner;
     public class Triangles{
        public static void main(String[] args){
            Scanner myscanner = new Scanner(System.in);
            System.out.print("Enter a number between 5 and 30 : ");
            Integer Num=0,tempN=0;
            boolean Numacceptable= false; //Test for if the input is valid
            while (! Numacceptable){
                if (myscanner.hasNextInt()){
                    tempN=myscanner.nextInt(); //store length
                    if (tempN<=30 && tempN>=5){
                    Numacceptable= true;
                    Num=tempN;
                    }
                    else{
                     System.out.println("Wrong Input,please enter a interger between 5-30");
                     System.out.println("Enter a number between 5 and 30 : ");
                     tempN=0;
                    }
                }
                else{
                    System.out.println("Wrong Input,please enter a interger");
                    System.out.println("Enter a number between 5 and 30 :");
                    myscanner.next();
                }
            }
            ///System.out.println(Num); //test only!!!
            System.out.println("For loop:"); 
            int linenum=1, i=0; //define variable
            for(linenum=1;linenum<=Num;linenum++){
                for(i=0;i<linenum;i++){
                System.out.print(linenum);
            }
                System.out.println("");
            }
            int j=0;
            linenum=0;
            for(j=1;j<=Num-1;j++){
                for(linenum=0;linenum<Num-j;linenum++){ //define line
                    System.out.print(Num-j);  // print number
                }
                    System.out.println("");
            } ///end of the for loop
            System.out.println("");
            System.out.println("While loop: "); //Beginning of while loop
            int a=0,b=0, linenumW=1;
            while(a<Num){
                b=0; //reset the amount
                while(b<linenumW){
                    System.out.print(linenumW);
                    b++;
                }
                System.out.println("");
                a++;
                linenumW++;
            } //end of first half for while loop
            while(linenumW-Num<Num){
                int c=0;
                while(c<Num-(linenumW-Num)){
                    System.out.print(2*Num-linenumW);
                    c++;
                }
                System.out.println("");
                linenumW++;
            } //end of while loop part
            System.out.println("");
            System.out.println("Do-While loop: "); //beginning of do-while loop
            int d=0,e=0, linenumD=1; //define variable
            do{
                e=0; //reset e
                do{
                    System.out.print(linenumD);
                    e++;
                }
                while(e<linenumD);
                System.out.println("");
                linenumD++;
                d++;
            }
            while(d<Num); //end of do-while first part
            do{
                int f=0;  //declear and reset f
                do{
                System.out.print(2*Num-linenumD);
                f++;
                }
                while(f<Num-(linenumD-Num)); //determine how many number needed
                System.out.println("");
                linenumD++;
            }
            while (linenumD-Num<Num);
}
}