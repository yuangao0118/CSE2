//HW12 Program 1 Linear
//Yuan Gao
//yug216
//search single dimension array
import java.util.Scanner;
public  class CSE2Linear{
    public static void main(String[] args){
        Scanner myscanner= new Scanner(System.in);
        int numberofstudents=15;
        int[] a;
        a= new int[numberofstudents];
        int[] Grades;
        Grades= new int[numberofstudents];
        int i=0;
        for(i=0;i<numberofstudents;i++){
                    boolean goodinput= false;
            System.out.println("Please enter a integer from 0-100");
        while(!goodinput){
            if(myscanner.hasNextInt()){  //check if it's integer or not
                a[i]=myscanner.nextInt();
                if(Grades[i]>=0 && Grades[i]<=100){  //check the range
                    if(i==0){
                        Grades[i]=a[i];
                        goodinput=true;
                    }
                    else if(i>0 && a[i]>a[i-1]){ //compare with the first one
                          Grades[i]=a[i];
                          goodinput=true;
                    }
                    else{
                        System.out.println("Please enter an integer larger than the last grade: " + Grades[i-1]);
                        
                    }
                }
                else{
                    System.out.println("Please enter a integer between 0-100");
                }
            }
                else{
                    System.out.println("Please enter a integer");
                    myscanner.next();
                }
        }
        }  // end of the input
        for(int j=0; j<15;j++){
            System.out.print(Grades[j]+" ");
        } //end of print
        System.out.println("Enter a grade to search: ");//start for search
        int searchGrade=myscanner.nextInt();
        /*for(int k=0; k<Grades.length;k++){
            if(searchGrade==Grades[k]){
                System.out.println("Grade was found.");
                System.out.println(Grades[k] + " was found in "+ (k+1)+" iterations.");
                k=Grades.length; //get rid of the loop
            }
            else if(k==(Grades.length-1)){
                System.out.println("Grades was not found after "+ Grades.length+ " iterations.");
            }
        } //end of the linear search*/
        int iteration=0;
        int low=0; int high=Grades.length-1; //start binary search
        while(low<=high){ //find the corresponsing point
            int midpoint=low+(high-low)/2;
            if(searchGrade<Grades[midpoint]){
                high=midpoint-1;
                iteration++;
            }
            else if (searchGrade>Grades[midpoint]){
                low=midpoint+1;
                iteration++;
            }
            else{
                iteration++;
                System.out.println(Grades[midpoint]+" was found in "+ iteration+" iterations.");
                low=high+100; //to get rid of the loop
            }
        }
        if(low<(high+50)){
           System.out.println("Grades was not found after "+iteration+" iternations. ");
        }
        else{
             
        }             
        //begin of scramble
        for(int y=0;y<Grades.length;y++){
            int target=(int) (Grades.length*Math.random() ); //get a random number
            int temp=Grades[target];  //swap
            Grades[target]=Grades[y]; //swap
            Grades[y]=temp;
        } //end of swap
        for(int j=0; j<15;j++){
            System.out.print(Grades[j]+" ");
        } //end of print
         System.out.println("Enter a grade to search: ");//start for search
        int searchGrade1=myscanner.nextInt();
        for(int k=0; k<Grades.length;k++){
            if(searchGrade1==Grades[k]){
                System.out.println("Grade was found.");
                System.out.println(Grades[k] + " was found in "+ (k+1)+" iterations.");
                k=Grades.length; //get rid of the loop
            }
            else if(k==(Grades.length-1)){
                System.out.println("Grades was not found after "+ Grades.length+ " iterations.");
            }
        } //end of the search
} 
}