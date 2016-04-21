//create array
//yug216
//lab10
import java.util.Scanner;
public  class Array{
    public static void main(String[] args){
        Scanner myscanner= new Scanner(System.in);
        int NumStudents=(int) (Math.random() *6+5);
        System.out.println("Enter "+ NumStudents + " student names:");
        
        String[] Students;
        Students= new String[NumStudents];
        int i=0;
        for(i=0; i<NumStudents;i++){ //enter each name
            Students[i]=myscanner.next();
        }
        int[] Studentsscore;
        Studentsscore= new int[NumStudents];
        int j=0;
        for(j=0;j<NumStudents;j++){ //determine each score for each student
            Studentsscore[j]=(int) (Math.random()*101);
        }
        int z=0;
        for(z=0;z<NumStudents;z++){
            System.out.println(Students[z]+" : "+ Studentsscore[z]);
        }
}
}