//getting familiar with loop and break
//input number
//lab 07 bowtie

    public class Bowtie{
        public static  void main (String[] args){
            int nStars=9; //declear num of Stars
            int nStars1=0;
            int linenum=0;
            nStars1=nStars; //use variable for loop
            while(linenum<nStars){
                if (linenum<=(nStars+1)/2){
                  while(nStars1>0){
                System.out.print("*");
                nStars1--;
            }
            linenum++;
            nStars1=nStars-2*linenum;
            System.out.println(" ");
                }
                else { 
                while(nStars1)    
        } 
    }
}
}