        import java.util.Random; //import random number generator
        import java.util.Scanner;
        public class test3{
        public static String scrambler( Random random, String input){
            char a[] = input.toCharArray();
            int n=0;
            int length=input.length();
            while(n<length){
                int i= random.nextInt(input.length); //swap letters
                char temp=a[n]; a[n]=a[i]; a[i]=temp;
                n++;
            }
            return new String(a);
        }
        public static void main(String[] args){
                Scanner myscanner= new Scanner(System.in);
                String input= myscanner.next();
                System.out.println(input);
                Random r= new Random();
                String word="";
                word=scrambler(r,input);
                System.out.println(word);
}
}