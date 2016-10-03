package projectcolour.util.global_properties;

import java.awt.Color;

/**
 * @author Tom
 */

public final class UtilGlobalProperties {

	/* Game FPS */
	public static final int GAME_DESIRED_FPS = 60;								//	The desired FPS for the game to run at

	/* Content Pane */
	public static final int CONTENT_PANE_WIDTH = 800;							//	The width for the content pane
	public static final int CONTENT_PANE_HEIGHT = 600;							//	The height for the content pane

	/* Player Entity */
	public static final int PLAYER_WIDTH = 15;									//	The width of the player rectangle
	public static final int PLAYER_HEIGHT = 15;									//	The height of the player rectangle
	public static final Color PLAYER_COLOUR = Color.decode("#B2EBF2");			//	The hex value colour of the player rectangle

	/* Player Movement Physics */
	public static final int PLAYER_MOVEMENT_MIN_ACCELERATION = 1;				//	The min acceleration for the player's movement
	public static final int PLAYER_MOVEMENT_MAX_ACCELERATION = 10;				//	The max acceleration for the player's movement
	public static final int PLAYER_MOVEMENT_MIN_INTERVAL = 25;					//	The min interval for the player's movement
	public static final int PLAYER_MOVEMENT_MAX_INTERVAL = 15;					//	The max interval for the player's movement

	/* Arc Entity */
	public static final float ARC_SPAWN_SIZE = 0.75f;							//	The spawn size of the arc
	public static final float ARC_SPAWN_MIN_ROTATION_SPEED = 0.075f;			//	The min spawn speed of each arc
	public static final float ARC_SPAWN_MAX_ROTATION_SPEED = 0.1f;				//	The max spawn speed of each arc
	public static final int ARC_SPAWN_START_ANGLE = 0;							//	The spawn start angle of each arc
	public static final int ARC_SPAWN_MIN_END_ANGLE = 150;						//	The min spawn end angle of each arc
	public static final int ARC_SPAWN_MAX_END_ANGLE = 300;						//	The max spawn end angle of each arc
	public static final int ARC_SPAWN_OPACITY = 0;								//	The spawn opacity of each arc
	public static final int ARC_SPAWN_MIN_STROKE_WIDTH = 50;					//	The min arc spawn stroke width
	public static final int ARC_SPAWN_MAX_STROKE_WIDTH = 75;					//	The max arc spawn stroke width
	public static final int ARC_SPAWN_MULTI_STROKE_WIDTH = 2;
	public static final int ARC_SCALE_SPEED = 1;								//	The speed at which the arc scales down
	public static final float ARC_INCREASE_ROTATION_SPEED = 0.0001f;			//	The speed at which the arc speeds up
	public static final int ARC_FADE_POSITION = 300;							//	The position at which the arc fade transition begins
	public static final int ARC_INCREASE_OPACITY_SPEED = 1;						//	The speed at which the arc fades in
	public static final int ARC_DESCREASE_OPACITY_SPEED = 1;					//	The speed at which the arc fades out
	public static final int ARC_REMOVE_POSITION = 0;							//	The position at which the arc is removed from the game

	/* Arc Waves */
	public static int ARC_WAVE_DIFFICULTLY = 0;									//	The starting difficulty of the first wave, this gets progressively higher each wave
	public static final int ARC_WAVE_SIZE = 10;									//	The amount of arcs spawned each wave
	public static final int ARC_SPAWN_INTERVAL = 3000;							//	The rate in milliseconds that the arcs spawn
	public static final int ARC_WAVE_INTERVAL = 1000;							//	The amount of milliseconds between each wave
	public static final int ARC_WAVE_UNLOCK_CONTROLS = 4;						//	After the nth arc, allo the player to move

	/* Game Debug */
	public static final boolean DEBUG_ENABLED = true;							//	If the debug should be displayed
	public static final Color DEBUG_TEXT_COLOUR = Color.decode("#00FF00");		//	The colour of the debug text
	public static final int DEBUG_SPACING = 15;									//	The amount of pixels between each debug item
	public static final int DEBUG_Y_POSITION = 10;								//	The Y position the debug starts at
	
	/* Game Debug Console */
	public static final int CONSOLE_SPACING = 15;								//	The amount of pixels between each console item
	public static final int CONSOLE_ITEMS = 10;									//	The amount of console items to display

	/* Game Background Colour */
	public static final Color GAME_BACKGROUND_COLOUR = Color.decode("#000000");	//	The background colour of the game

	private UtilGlobalProperties(){
	}
}