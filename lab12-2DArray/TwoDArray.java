//create 2D-array
//yug216
//lab12
import java.util.Scanner;

public class TwoDArray{
    public static void main(String[] args){
        Scanner myscanner=new Scanner(System.in);
        int arraylength=0;
        System.out.println("Please enter the size of the main array");
        arraylength=myscanner.nextInt();
        int[] mainarray;
        mainarray=new int[arraylength];
        int [][] mainarray=new int[arraylength][];
        for(int i=0;i<arraylength;i++){
            mainarray[i]=new int[(int)Math.random()*arraylength];
        }
        for(int j=0;j<arraylength;j++){
            for(int k=0;k<mainarray[j].length;k++){
                mainarray[j][k]=((int)Math.random()*20+1);
            }
        }
        for(int i=0;i<arraylength;i++){
            for(int j=0;j<mainarray[i].length;j++){
                System.out.print(mainarray[i][j]+" ");
            }
            System.out.println("");
        }
        
        
}
}