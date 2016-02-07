// HW 02 Calculate tax and total price
// Yuan Gao
// yug216
// think about variable type and the steps

public class Arithmetic{
    public static void main(String []args){
//Input data
    int numPants=3; //Number of pairs of pants
    double pantsPrice=34.98; //Cost per pants
    int numShirts=2; //Number of Sweatshirts
    double shirtPrice=24.99; //Cost per shirt
    int numBelts=1; //Number of belts
    double beltPrice=33.99; // cost of a belt
    double paSalesTax= 0.06; // PA tax rate
// Define variable
    double totalCostOfPants; // total cost for pants before tax
        totalCostOfPants= (numPants*pantsPrice) ; 
    double taxonPants; //total tax on pants
        taxonPants=paSalesTax*totalCostOfPants*100/100;
        System.out.println(" pants total cost= " + totalCostOfPants);
        System.out.println(" Total tax on pants= " + taxonPants);
    double totalCostOfShirts; // total cost of Shirt before tax
        totalCostOfShirts=numShirts*shirtPrice;
    double taxonShirts; //total tax on Shirts
        taxonShirts=paSalesTax*totalCostOfShirts*100/100;
        System.out.println(" Shirts total cost= " + totalCostOfShirts);
        System.out.println(" Total tax on Shirts= " + taxonShirts);
    double totalCostOfBelt; //total cost for Belts before tax
        totalCostOfBelt=numBelts*beltPrice;
    double taxonBelts; //Total tax on belts
        taxonBelts=paSalesTax*totalCostOfBelt*100/100;
        System.out.println(" Belts total cost= " + totalCostOfBelt);
        System.out.println(" Total tax on Belts= " + taxonBelts);
    double totalCostAll; //total cost before tax
        totalCostAll=totalCostOfBelt+totalCostOfShirts+totalCostOfPants;
        System.out.println(" Total Cost of Purchase before tax= " + totalCostAll);
    double totalSalesTax;    //total sales tax
        totalSalesTax=totalCostAll*paSalesTax*100/100;
        System.out.println( " Total Sales Tax= " + totalSalesTax);
    double totalpaidforTranscation; //toal cost plus tax
        totalpaidforTranscation=totalCostAll+totalSalesTax;
        System.out.println(" Total Transaction Cost= "+ totalpaidforTranscation);
        
    }
    
}