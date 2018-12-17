package us.penrose.robot;

import robocode.*;

public class ABot extends Robot {
	
	@Override
	public void run() {
		while(true) {
			ahead(5);
			turnLeft(5);
			fire(Rules.MAX_BULLET_POWER);
		}
	}
}
