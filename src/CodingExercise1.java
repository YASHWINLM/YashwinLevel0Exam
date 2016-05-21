/* Level 0 Exam: Coding  Exercise #1 */
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		Robot guy = new Robot ();
		for (int i = 1; i < 5; i++) {
			guy.setPenWidth(10);
			guy.setSpeed(10);
			guy.penDown();
			guy.move(100);
			guy.turn(90);
		}
		// 3. ask the user what color they would like the tortoise to draw
		String x=JOptionPane.showInputDialog("What color do you want?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(x.equals("blue")){
			Robot guye = new Robot ();
			for (int i = 1; i < 5; i++) {
				guye.setPenColor(0, 255, 255);
				guye.setPenWidth(10);
				guye.setSpeed(10);
				guye.penDown();
				guye.move(100);
				guye.turn(90);
			}
		}
		else if(x.equals("red")){
			Robot guye = new Robot ();
			for (int i = 1; i < 5; i++) {
				guye.setPenColor(255, 255, 255);
				guye.setPenWidth(10);
				guye.setSpeed(10);
				guye.penDown();
				guye.move(100);
				guye.turn(90);
			}
		}
		// 2. set the pen width to 10
		
		// 1. make the tortoise draw a shape
		
	}
}