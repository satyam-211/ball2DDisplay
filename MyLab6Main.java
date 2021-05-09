import java.io.IOException;

import javax.swing.JFrame;

public class MyLab6Main {

	public static void main(String[] args) {
		try {
			Ball2DIO.writeRandomBall2D("test", 100);
			JFrame f = new JFrame("Ball2D Display");
			f.setSize(500, 500);
			f.add(new Ball2DDisplay(Ball2DIO.readRandomBall2D("test", 100)));
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
