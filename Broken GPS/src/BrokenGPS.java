/*    Broken GPS

/**Purpose: To write a program for a broken GPS that goes to random directions every 5 minutes.
 * 
 * Date: 01/27/2015
 * Class: CSC 201
 * Professor: Mr. Tanes
 * Author: Misheel Ganbat
 * */
/*               
Algorithm
-(a,b) is a plane of intersection with four directions that car is able to go (North, West, South, East)
-assume North as A to the right and South as B to the left
-assume West as C left and East as D right
-find the intersection length
-use math.random to generate values for where the car might go with a, b values
-find out the driving time for a, b after every hour
*/

public class BrokenGPS{
	public static void main (String []args)
	{
		// initialize variables of speed, distance, and driving time
		int speed =60;
		double distance=0;
		int drivingTime =60;
		// driving time is calculated
		int intersectionTime=5;
		int direction=0;
		int a=0;
		int b=0;
		// the length of intersection is calculated by dividing driving time by intersection time and then dividing the answer by speed
		int intersLength=speed/(drivingTime/intersectionTime);
	for (int i=0;i<drivingTime/intersectionTime;i++){
		direction =(int)(Math.random()*4+1);
		//uses the outcome of Math.random and stores them into different directions
		if (direction==1) b+=intersLength;
		else if (direction==2) a+=intersLength;
		else if (direction==3) b-=intersLength;
		else   a-=intersLength;
	}
	//shows the answer to the user of where the car might go 
	System.out.println("the position of the car is : ");
	System.out.println( "");
	if( a>=0 && b>=0){
	System.out.println("a= "+a +" East"+" b= "+b + " North" );
	System.out.println("");
}else if( a<0 && b>=0){
	System.out.println("a= "+a+" West"+" b= "+b + " North" );
	System.out.println("");
}
else if( a<0 && b<0){
	System.out.println("a= "+ a +" West"+" b= "+b + "South" );
	System.out.println("");
}
else if( a>=0 && b<0){
	System.out.println("a= "+a +" East"+" b= "+b + " South" );
	System.out.println("");
}
	distance= (double)Math.round(Math.sqrt(Math.pow(a,2)+Math.pow(b,2))*100)/100;
	System.out.println("distance= "+distance +" miles");
	System.out.println("");
	}

}

