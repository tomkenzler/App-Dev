package projectcolour.util.player;

import projectcolour.entities.EntityPlayer;
import projectcolour.util.display.UtilContentPane;
import static projectcolour.util.global_properties.UtilGlobalProperties.*;

/**
 * @author Tom
 */

public final class UtilPlayer {

	private static EntityPlayer player;

	private UtilPlayer(){
	}

	public static void init(){
		player = new EntityPlayer(UtilContentPane.getWidthCentre() - (PLAYER_WIDTH / 2), UtilContentPane.getHeightCentre() - (PLAYER_HEIGHT / 2), PLAYER_WIDTH, PLAYER_HEIGHT, PLAYER_COLOUR);
	}

	public static void moveUp(int Acceleration){
		player.setY(player.getY() - (1 + Acceleration));
	}

	public static void moveDown(int Acceleration){
		player.setY(player.getY() + (1 + Acceleration));
	}

	public static void moveLeft(int Acceleration){
		player.setX(player.getX() - (1 + Acceleration));
	}

	public static void moveRight(int Acceleration){
		player.setX(player.getX() + (1 + Acceleration));
	}

	public static int getX(){
		return player.getX();
	}

	public static void setX(int X){
		player.setX(X);
	}

	public static void resetX(){
		player.setX(UtilContentPane.getWidthCentre() - (PLAYER_WIDTH / 2));
	}

	public static int getY(){
		return player.getY();
	}

	public static void setY(int Y){
		player.setY(Y);
	}

	public static void resetY(){
		player.setY(UtilContentPane.getHeightCentre() - (PLAYER_HEIGHT / 2));
	}

	public static void resetXY(){
		resetX();
		resetY();
	}

	public static int getWidth(){
		return player.getWidth();
	}

	public static void setWidth(int Width){
		player.setWidth(Width);
	}

	public static int getHeight(){
		return player.getHeight();
	}

	public static void setHeight(int Height){
		player.setHeight(Height);
	}
}