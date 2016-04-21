//HW12 Program 2 remove
//Yuan Gao
//yug216
//methods

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  } //end of source code
  public static int[] randomInput(){
  	int arraynumber=10;
  	int[] a;
  	a= new int[arraynumber];
  	for(int i=0;i<a.length;i++){
  		a[i]=(int)(Math.random()*arraynumber);
  	} //end of assign value for array
    return a;
  }
  
  public static int[] delete(int[] num,int index){
      int[] anew;
      anew=new int[9]; //define length of new array
      if (index<num.length&&index>=0){  //check if index is vaild
          for(int i=0;i<index;i++){ 
              anew[i]=num[i];
          }
          for(int j=index;j<anew.length;j++){
              anew[j]=num[j+1];
          }
          return anew;
      }
      else{
          System.out.println("invaild index");
          return num;
      }
  }   //end of delete method
  public static int[] remove(int[] num,int target){
          int count=0;
    for(int i=0;i<num.length;i++){
      if(num[i]==target){
        count=count+1;
      }
      else{
        continue;
      }
    }
    int anew2count=num.length-count;
    int[] anew2;
    anew2=new int[anew2count];
    int k=0;
    for(int j=0;j<num.length;j++){
      if(num[j]==target){
        continue;
      }
      else{
        anew2[k]=num[j];
        k++;
      }
    }
    return anew2;
  }
}
