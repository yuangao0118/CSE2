// Cyclometer program 
// Input: time in seconds and number of rotations of the front wheel
// print out time,distance, count 

public class Cyclometer{
    public static void main(String []args){
// Input data
    int secsTrip1=480; //trip 1 time in seconds
    int secsTrip2=3220; //trip 2 time in seconds
    int countsTrip1=1561; //trip 1 count
    int countsTrip2=9037; //trip 2 count
// intermediate variables
    double wheelDiameter=27.0; //Wheel diamater
    double PI=3.14159 ;
    double feetPerMile=5280 ; //feet mile conversion
    double inchesPerFoot=12 ; //inch foot conversion
    double secondsPerminuter=60; // second minute conversion
    double distanceTrip1, distanceTrip2, totalDistances; //define Distance
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerminuter)+
        " minutes and had "+ countsTrip1 +" counts.");
    System.out.println("Trip 2 took "+ (secsTrip2/secondsPerminuter) +" minutes and had "
        + countsTrip2 +" counts.");
//calculate the distance of trip 1, trip 2 and combined
//make sure to convert unit 
    distanceTrip1=countsTrip1*wheelDiameter*PI;
//above distance in inches
    distanceTrip1/=inchesPerFoot*feetPerMile; //given distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistances=distanceTrip1+distanceTrip2;
//Print out distances
    System.out.println("Trip 1 was "+ distanceTrip1 + " miles");
    System.out.println("Trip 2 was "+distanceTrip2+ " miles");
    System.out.println("The total distance was "+ totalDistances +" miles");
  }
}