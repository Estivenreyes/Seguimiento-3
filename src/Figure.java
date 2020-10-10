import processing.core.PApplet;

public class Figure {

	protected PApplet app;
	int posX;
	int posY;
	float size;
	
	
	public Figure (int posX, int posY, float size, PApplet app) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.size = size;
		
	}
}
