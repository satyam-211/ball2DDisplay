import java.awt.Color;

public class Ball2D {
	
	private int x;
	private int y;
	private int radius;
	private Color c;
	
	Ball2D(int x,int y){
		this.x=x;
		this.y=y;
		radius=20;
		c=Color.GREEN;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public Color getColor() {
		return c;
	}
	
	@Override
	public String toString() {
		return x+","+y;
	}

}
