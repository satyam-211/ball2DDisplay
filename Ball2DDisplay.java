import java.awt.Graphics;

import javax.swing.JComponent;

public class Ball2DDisplay extends JComponent {

	private Ball2D[] balls;

	Ball2DDisplay(Ball2D[] balls) {
		this.balls = balls;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < balls.length; i++) {
			g.setColor(balls[i].getColor());		
			g.fillOval(balls[i].getX(), balls[i].getY(), balls[i].getRadius(), balls[i].getRadius());
		}
	}
}
