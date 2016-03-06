//HW06 Program 3 TextSpinner
//Yuan Gao
//yug216
//Create a infinit loop


    public class TextSpinner{
        public static void main(String[] args){
        int test=1; //create condition for the while statement
        while(test>0){
            switch(test%4){    //give the order to this loop
                case 1:
                    System.out.print("\b/");  //use \b to delete
                    break;
                case 2:
                    System.out.print("\b-");  
                    break;
                case 3:
                    System.out.print("\b\\");  //use \\ for \
                    break;
                case 0:
                    System.out.print("\b|");
                    break;
            }
            test++;
             //System.out.print(/b/b);
        }
    }
}