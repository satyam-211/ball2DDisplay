import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ball2DIO {

	static final private int maxValueX = 500;
	static final private int maxValueY = 500;

	public static void writeRandomBall2D(String fileName, int numBalls) throws IOException {
		File file = new File(fileName);

		file.createNewFile();
		Random random = new Random();
		FileWriter fileWriter = new FileWriter(file);
		for (int i = 0; i < numBalls; i++) {
			int varX = random.nextInt(maxValueX);
			int varY = random.nextInt(maxValueY);
			fileWriter.write(varX + "," + varY + "\n");
		}
		fileWriter.close();

	}

	public static Ball2D[] readRandomBall2D(String fileName, int numLines) throws NumberFormatException, IOException {

		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str;
		String words[] = null;
		Ball2D[] balls = new Ball2D[numLines];

		int i = 0;
		while ((str = bufferedReader.readLine()) != null && i < numLines) {
			words = str.split(",");
			int varX = Integer.parseInt(words[0]);
			int varY = Integer.parseInt(words[1]);
			Ball2D ball = new Ball2D(varX, varY);
			balls[i] = ball;
			i++;
		}
		return balls;

	}

}
