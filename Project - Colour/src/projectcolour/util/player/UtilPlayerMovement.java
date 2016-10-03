package projectcolour.util.player;

import static projectcolour.util.global_properties.UtilGlobalProperties.*;

/**
 * @author Tom
 */

public final class UtilPlayerMovement {

	private static int interval;
	private static int acceleration;
	private static boolean enabled;
	private static boolean moveUp;
	private static boolean moveDown;
	private static boolean moveLeft;
	private static boolean moveRight;

	private UtilPlayerMovement(){
	}

	public static int getInterval(){
		return interval;
	}

	public static void setInterval(int Interval){
		interval = Interval;
	}

	public static void decrementInterval(){
		if(interval > PLAYER_MOVEMENT_MAX_INTERVAL)
			interval--;
	}

	public static int getAcceleration(){
		return acceleration;
	}

	public static void setAcceleration(int Acceleration){
		acceleration = Acceleration;
	}

	public static void incrementAcceleration(){
		if(acceleration < PLAYER_MOVEMENT_MAX_ACCELERATION)
			acceleration++;
	}

	public static boolean isEnabled(){
		return enabled;
	}

	public static void setEnabled(boolean Enabled){
		enabled = Enabled;
	}

	public static boolean isMoveUp(){
		return moveUp;
	}

	public static void setMoveUp(boolean MoveUp){
		moveUp = MoveUp;
	}

	public static boolean isMoveDown(){
		return moveDown;
	}

	public static void setMoveDown(boolean MoveDown){
		moveDown = MoveDown;
	}

	public static boolean isMoveLeft(){
		return moveLeft;
	}

	public static void setMoveLeft(boolean MoveLeft){
		moveLeft = MoveLeft;
	}

	public static boolean isMoveRight(){
		return moveRight;
	}

	public static void setMoveRight(boolean MoveRight){
		moveRight = MoveRight;
	}
}