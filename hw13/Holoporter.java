//HW12 Program 1 Holoporter
//Yuan Gao
//yug216
//multiple dimension array
import java.util.Scanner;
public class Holoporter{
    public static String[][][] SoRandom(){
        String[] a;
        int i=(int)(Math.random()*9+1); //length for inner array
        a=new String[i];
        String [][] b;
        int j=(int)(Math.random()*9+1);
        b=new String [i][j];
        String [][][] c;
        int k=(int)(Math.random()*9+1);
        c= new String [i][j][k];
        return c;
    }
    public static String Coder(){
        String output=""; //define output
        String selection= "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //define character selection
        int N=selection.length();
        for(int i=1;i<=2;i++){ //run twice
            int selectionnum=(int)(Math.random()*N);
            char c=selection.charAt(selectionnum);
            output=output+c;
        }
        
        int firstdig=(int)(Math.random()*9);
        int seconddig=(int)(Math.random()*9);
        int thirddig=(int)(Math.random()*9);
        int fourthdig=(int)(Math.random()*9);
        output= output+firstdig+seconddig+thirddig+fourthdig;
        return output;
    }
    public static void print(String[][][] input){
        for (int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                 System.out.print("[ ");
                for(int k=0;k<input[i][j].length;k++){
                    System.out.print(input[i][j][k]+" , ");
                }
                System.out.print("] ");
                if(j+1==input[i].length){
                    continue;
                }
                else{
                    System.out.print("|");
            }
            }
                    System.out.print("---");
        }
    }
    public static String[][][] holoport(String[][][] original , String[][][] newitem){
        if(original.length<=newitem.length){
            for(int i=0;i<original.length;i++){
                if(original[i].length<=newitem[i].length){
                    for(int j=0;j<original[i].length;j++){
                        if(original[i][j].length<=newitem[i][j].length){
                            for(int k=0;k<original[i][j].length;k++){
                                newitem[i][j][k]=original[i][j][k];
                            }
                            for(int k=original[i][j].length;k<newitem[i][j].length;k++){
                                newitem[i][j][k]="$$$$$$";
                            }
                        }
                        else{  //ori[i][j].length>new[i][j].length
                            for(int k=0;k<newitem[i][j].length;k++){
                                newitem[i][j][k]=original[i][j][k];
                            }
                        }
                    }
                    for(int j=original[i].length;j<newitem[i].length;j++){ //filled with $$$$$$
                        for(int k=0;k<newitem[i][j].length;k++){
                            newitem[i][j][k]="$$$$$$";
                        }
                    }
                }
                else{ //ori[i].length>new[i].length
                    for(int j=0;j<newitem[i].length;j++){
                        if(original[i][j].length<=newitem[i][j].length){
                            for(int k=0;k<original[i][j].length;k++){
                                newitem[i][j][k]=original[i][j][k];
                            }
                            for( int k=original[i][j].length;k<newitem[i][j].length;k++){
                                newitem[i][j][k]="$$$$$$";
                            }
                        }
                        else{  //ori[i][j].length>new[i][j].length
                            for(int k=0;k<newitem[i][j].length;k++){
                                newitem[i][j][k]=original[i][j][k];
                            }
                        }
                    }
                }
            }
            for(int i=original.length;i<newitem.length;i++){  //fill with $$$$$$$
                for(int j=0;j<newitem[i].length;j++){
                    for(int k=0;k<newitem[i][j].length;k++){
                        newitem[i][j][k]="$$$$$$";
                    }
                }
            }
        }
        else{  //ori.length>new.length
            for(int i=0;i<newitem.length;i++){
                if(original[i].length<=newitem[i].length){
                    for(int j=0;j<original[i].length;j++){
                        if(original[i][j].length<=newitem[i][j].length){
                            for(int k=0;k<original[i][j].length;k++){
                                newitem[i][j][k]=original[i][j][k];
                            }
                            for(int k=original[i][j].length;k<newitem[i][j].length;k++){
                                newitem[i][j][k]="$$$$$$";
                            }
                        }
                        else{  //ori[i][j].length>new[i][j].length
                            for(int k=0;k<newitem[i][j].length;k++){
                                newitem[i][j][k]=original[i][j][k];
                            }
                        }
                    }
                    for(int j=original[i].length;j<newitem[i].length;j++){ //filled with $$$$$$
                        for(int k=0;k<newitem[i][j].length;k++){
                            newitem[i][j][k]="$$$$$$";
                        }
                    }
                }
                else{ //ori[i].length>new[i].length
                    for(int j=0;j<newitem[i].length;j++){
                        if(original[i][j].length<=newitem[i][j].length){
                            for(int k=0;k<original[i][j].length;k++){
                                newitem[i][j][k]=original[i][j][k];
                            }
                            for(int k=original[i][j].length;k<newitem[i][j].length;k++){
                                newitem[i][j][k]="$$$$$$";
                            }
                        }
                        else{  //ori[i][j].length>new[i][j].length
                            for(int k=0;k<newitem[i][j].length;k++){
                                newitem[i][j][k]=original[i][j][k];
                            }
                        }
                    }
                }
            }
        }
    return newitem;
    }
    public static void Sampling(String[][][] Objects, String code){
        boolean found=false;
        
        for(int i=0; i<Objects.length;i++){
            for(int j=0;j<Objects[i].length;j++){
                for(int k=0;k<Objects[i][j].length;k++){
                    if(code.equals(Objects[i][j][k])){
                        System.out.println("( "+i+" , "+j+" , "+k+" )");
                        found=true;
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        if(!found){
            System.out.println("Code not found.");   
        }
    }
    public static void Percentage(String[][][] transferred , String[][][]old){
        double newlength=transferred.length*transferred[0].length*transferred[0][0].length;
        double oldlength=old.length*old[0].length*old[0][0].length;
        double percent=((newlength-oldlength)/oldlength)*100/100*100;
        System.out.println("Percentage is : "+percent+"%");
    }
    public static String[][][] Frankenstein(String[][][] newarray){
        String small=""; String big="";
        for(int i=0;i<newarray.length;i++){
            for(int j=0; j<newarray[i].length;j++){
                for(int k=0;k<newarray[i][j].length;k++){
                    for(int o=0;o<k;o++){
                        small=newarray[i][j][o];
                        big=newarray[i][j][k];
                        char a=small.charAt(0); int aa=(int) a;
                        char b=small.charAt(1); int bb=(int) b;
                        char c=small.charAt(2); int cc=(int) c;
                        char d=small.charAt(3); int dd=(int) d;
                        char e=small.charAt(4); int ee=(int) e;
                        char f=small.charAt(5); int ff=(int) f;
                        
                        char A=big.charAt(0); int AA=(int) A;
                        char B=big.charAt(1); int BB=(int) B;
                        char C=big.charAt(2); int CC=(int) C;
                        char D=big.charAt(3); int DD=(int) D;
                        char E=big.charAt(4); int EE=(int) E;
                        char F=big.charAt(5); int FF=(int) F;
                        
                         if(aa>AA){
                            String temp=newarray[i][j][k];
                            newarray[i][j][k]=newarray[i][j][o];
                            newarray[i][j][o]=temp;
                        }
                        else if(aa==AA){
                            if(bb>BB){
                                 String temp=newarray[i][j][k];
                                newarray[i][j][k]=newarray[i][j][o];
                                newarray[i][j][o]=temp;
                            }
                            else if(bb==BB){
                                if(cc>CC){
                                     String temp=newarray[i][j][k];
                                     newarray[i][j][k]=newarray[i][j][o];
                                     newarray[i][j][o]=temp;
                                }
                                else if(cc==CC){
                                    if(dd>DD){
                                         String temp=newarray[i][j][k];
                                        newarray[i][j][k]=newarray[i][j][o];
                                        newarray[i][j][o]=temp;
                                    }
                                    else if(dd==DD){
                                        if(ee>EE){
                                             String temp=newarray[i][j][k];
                                            newarray[i][j][k]=newarray[i][j][o];
                                            newarray[i][j][o]=temp;
                                        }
                                        else if(ee==EE){
                                            if(ff>FF){
                                                 String temp=newarray[i][j][k];
                                                newarray[i][j][k]=newarray[i][j][o];
                                                newarray[i][j][o]=temp;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < newarray.length-1; i++) {
        	for(int j = 0; j<newarray[i].length-1; j++){
		
	        	int currentMin = newarray[i][j].length;
	        	int currentMinIndex = j;
	        	int h=0;
		        for (h= j + 1; h<newarray.length; h++) {
		        	if (currentMin > newarray[i][h].length) {
			       	currentMin = newarray[i][h].length;
				    currentMinIndex = h;
		    	    }
		        }
		        // Swap newarray[i] with newarray[currentMinIndex] if necessary;
		        if (currentMinIndex != j) {
		            String[] temp = newarray[i][h];
	            	newarray[i][currentMinIndex] = newarray[i][j];
	            	newarray[i][j] = temp;
	        	}
	        }
        }     
        
        return newarray;
    }
    public static void main(String[] args){
        String[][][] myarray;
        myarray=SoRandom();
        //System.out.println("Original: "+myarray.length+" "+ myarray[0].length+" "+ myarray[0][0].length); //test only
        //String out=Coder();  //test only
        //System.out.println(out);  //test only
        for(int i=0;i<myarray.length;i++){ //outer level
            for(int j=0;j<myarray[i].length;j++){ //secondary level
                for(int k=0;k<myarray[i][j].length;k++){ //for the most inner
                    String temp=Coder();
                    String lastone=temp;
                    boolean unique=false;
                    while(!unique){
                    if(temp.equals(lastone)){
                        unique=false;
                        temp=Coder();
                    }
                    else{
                        unique=true;
                    }
                }
                    myarray[i][j][k]=temp; //assign value
                }
            }   
        }
        print(myarray);
        String[][][] holder;
        holder=SoRandom();
        System.out.println(" ");
        System.out.println(holder.length+" "+ holder[0].length+" "+ holder[0][0].length); //test only
        String[][][] transferreditem;
        transferreditem=holoport(myarray,holder);
        //print(transferreditem); //testonly!!!
        Scanner myscanner=new Scanner(System.in); 
        String temp = "";
        String code = "";
        boolean validinput = false;
        System.out.println("Please enter a code XXYYYY: ");
        while(!validinput){
            
            temp = myscanner.next();
            int a = (int)temp.charAt(0);
            int b = (int)temp.charAt(1);
            int c = (int)temp.charAt(2);
            int d = (int)temp.charAt(3);
            int e = (int)temp.charAt(4);
            int f = (int)temp.charAt(5);
            if((a>=65 && a<=90)&&(b>=65 && b<=90)&&(c>=48 && c<=57)&&(d>=48 && d<=57)&&(e>=48 && e<=57)&&(f>=48 && f<=57)){
                validinput = true;
                code = temp;
            }
            else{
                System.out.println("Invalid input, please enter again: ");
            }
        }
        if(validinput){
            Sampling(transferreditem, code);
        }
        Percentage(transferreditem, myarray);
        String[][][] reorder;
        reorder=Frankenstein(myarray);
        print(reorder);
    }
}