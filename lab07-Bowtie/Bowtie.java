//getting familiar with loop and break
//input number
//lab 07 bowtie

    public class Bowtie{
        public static  void main (String[] args){
            int nStars=9; //declear num of Stars
            int nStars1=0;
            int linenum=0;
            int nStarpinrt=0;
            int spancenum=0;
            nStars1=nStars; //use variable for loop
            while(linenum<(nStars/2+1)){
               nStarpinrt=1;
               while(nStarpinrt<=nStars1){
                   if(nStarpinrt<=linenum || nStarpinrt>nStars1-linenum){
                       System.out.print(" ");
                   }
                   else{
                       System.out.print("*");
                   }
                   nStarpinrt++;
               }
               linenum++;
               System.out.println("");
        } //end of first part
        System.out.println(linenum);//test only
            while(linenum<nStars){
                nStarpinrt=1;
                while(nStarpinrt<=nStars1){ //use if statement to control the num of star
                    
                }
                linenum++;
                System.out.println("");
            }
}
}