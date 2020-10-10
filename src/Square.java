import processing.core.PApplet;

public class Square extends Figure {

	private static final int PI = 0;

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
	
	public void rotationSquare (int posX, int posY, float size, int count, int rot) {
		
		if (count%2==0){
			
			app.rotate(PI/rot);
			app.rect(posX, posY, size, size);
			app.rotate(PI/rot);
		}else {
			app.rect(posX, posY, size, size);
			
		}
		
	}
}
