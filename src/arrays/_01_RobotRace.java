package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	int xLocation = 0;
	int smallY = 950;
	int winner = 0;
	//2. create an array of 5 robots.
		Robot[] rList = new Robot[5];
	//3. use a for loop to initialize the robots.
		for(int i = 0; i < rList.length; i++) {
			xLocation += 940/6;
			rList[i] = new Robot(xLocation, 540);
			rList[i].setSpeed(200);
			rList[i].miniaturize();
		}
	//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		Random r = new Random();
		while(smallY > 0) {
		for(int i = 0; i < rList.length; i++) {
			
			rList[i].move(r.nextInt(10));
			if(rList[i].getY() < smallY) {
				smallY = rList[i].getY();
				winner = i+1;
			}
		}
		}
		System.out.println("The Winner is " + winner);
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
