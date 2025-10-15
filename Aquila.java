package Aquilas;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Aquila - a robot by (your name here)
 */
public class Aquila extends Robot
{
	/**
	 * run: Aquila's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(150);
			turnRight(180);
			turnLeft(90);
			ahead(400);
			back(80);
			turnRadarRight(200);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
		ahead(50); 
		turnRight(180);
		
	}
	// esquivar 
	private void esquivar() {
        back(0);
        turnRight(45);
        ahead(100);
    }


	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(50);
		ahead(300);
		turnGunRight(90);
		turnRadarRight(360);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
		turnRight(270);
		ahead(450);
	}
	// afastar da parede
	 private void afastarDaParede() {
        back(50);
        turnRight(90);
        ahead(150);
    }	
}
