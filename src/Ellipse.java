import processing.core.PApplet;

public class Ellipse extends Figure{

	public Ellipse(int posX, int posY, float size, PApplet app) {
		super(posX, posY, size, app);
	}

	protected void drawFigure(int posX, int posY, float size) {
		
		app.ellipse(posY, posY, size, size);
		if(size >= 1) {
			
			size *= 0.82f;
			
			drawFigure(posX,posY,size);
		
		}
		
	}

}
