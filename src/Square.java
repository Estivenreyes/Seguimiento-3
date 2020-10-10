import processing.core.PApplet;

public class Square extends Figure {

	public Square(int posX, int posY, float size, PApplet app) {
		super(posX, posY, size, app);
		
	}

	protected void drawFigure(int posX, int posY, float size) {
		
		app.rect(posY, posY, size, size);
		if(size >= 1) {
			
			size *= 0.82f;
			
			drawFigure(posX,posY,size);
		
		}
		
	}
}
