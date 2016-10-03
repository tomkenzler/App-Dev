package projectcolour.controllers;

import java.awt.Color;
import java.awt.image.BufferedImage;
import projectcolour.util.player.UtilPlayer;
import static projectcolour.util.global_properties.UtilGlobalProperties.*;

/**
 * @author Tom
 */

public final class CollisionController {

	private CollisionController(){
	}

	public static void validate(BufferedImage Canvas){

		checkTop(Canvas, UtilPlayer.getX(), UtilPlayer.getY(), UtilPlayer.getWidth());
		checkRight(Canvas, UtilPlayer.getX() + UtilPlayer.getWidth(), UtilPlayer.getY(), UtilPlayer.getHeight());
		checkBottom(Canvas, UtilPlayer.getX(), UtilPlayer.getY() + UtilPlayer.getHeight(), UtilPlayer.getWidth());
		checkLeft(Canvas, UtilPlayer.getX(), UtilPlayer.getY(), UtilPlayer.getHeight());		

	}

	private static void checkPoint(BufferedImage Canvas, int PointX, int PointY){

		try {
			Color colour = new Color(Canvas.getRGB(PointX, PointY), true);
			int r = colour.getRed();
			int g = colour.getGreen();
			int b = colour.getBlue();

			/* Let's ignore the player's and background colour */
			if((r != PLAYER_COLOUR.getRed() && g != PLAYER_COLOUR.getGreen() && b != PLAYER_COLOUR.getBlue()) &&
				(r != GAME_BACKGROUND_COLOUR.getRed() && g != GAME_BACKGROUND_COLOUR.getGreen() && b != GAME_BACKGROUND_COLOUR.getBlue()))
				resetGame();	
		} catch(ArrayIndexOutOfBoundsException e){
			DebugController.addConsoleMessage("Error player out of bounds!", "");
		}
	}

	private static void checkTop(BufferedImage Canvas, int PointX, int PointY, int Distance){
		for(int i = 0; i < Distance; i++)
			checkPoint(Canvas, PointX + i, PointY);
	}

	private static void checkRight(BufferedImage Canvas, int PointX, int PointY, int Distance){
		for(int i = 0; i < Distance; i++)
			checkPoint(Canvas, PointX, PointY + i);
	}

	private static void checkBottom(BufferedImage Canvas, int PointX, int PointY, int Distance){
		for(int i = 0; i < Distance; i++)
			checkPoint(Canvas, PointX + i, PointY);
	}

	private static void checkLeft(BufferedImage Canvas, int PointX, int PointY, int Distance){
		for(int i = 0; i < Distance; i++)
			checkPoint(Canvas, PointX, PointY + i);
	}

	private static void resetGame(){

		UtilPlayer.resetXY();
		ArcController.reset();
		ARC_WAVE_DIFFICULTLY = 0;

	}
}