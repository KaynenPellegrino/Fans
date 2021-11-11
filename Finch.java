package Code.Fans.Navigation;
//Needs a package declaration to move to another folder

import com.birdbraintechnologies.Finch;

/**
* Created by:
* Date:
* A file for FANS program
*/

public class Finch
{
public static void main(final String[] args)
   {
   // Instantiating the Finch object
   Finch myFinch = new Finch();

   // Write some code here!
   while(!myFinch.isBeakDown()) {
	   if(mtFinch.isObstacleLeftSide()) {
		   myFinch.setWheelVelocities(-255,-255,750);
		   myFinch.setWheelVelocities(100,-255,500);
	   }
	  
	   else if(myFinch.isObstacleRightSide()) {
		   myFinch.setWheelVelocities(-255,-255,750);
		   myFinch.setWheelVelocities(-255,100,500)
	   }
	   
	   else {
		   myFinch.setWheelVelocities(255,255);
	   }
   }
   double temperature = myFinch.getTemperature();   
           
           double tempThreshold = 22;
        	  
           if (myFinch.getTemperature() > tempThreshold) {
        		   myFinch.setLED (255,0,0)
           }
           
           else if (myFinch.getTemperature <= 16){
        	  myFinch.setLED (0,255,0)
           }
           
           else {myFinch.setLED (255,255,0)
           }
           
       }
   // Always end your program with finch.quit()
   myFinch.quit();
   System.exit(0);
   }
}
