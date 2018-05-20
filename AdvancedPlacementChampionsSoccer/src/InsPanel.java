import processing.core.PImage;
import processing.core.PApplet;

/**
 * Represents the screen where the player can begin the game
 * @author Tony Yu
 * @version 5/10/18
 *
 */
public class InsPanel extends DrawingSurface {

	private PImage background;

	public InsPanel() {
		background = new PImage();
	}
	public void setup() {
		background = loadImage("INSTRUCTIONS.png");
	}

	public void settings() {
		size(1280, 800, P2D);
	}

	public void draw() {			
		clear();
		image(background, 0, 0, width, height);
	}

	public void mouseClicked() {
		if (mouseButton == LEFT) {
			PApplet.main("PlayerSelect");

		}
	}
}