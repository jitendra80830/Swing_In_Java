//Example of Swing
import javax.swing.*;

public class FirstSwingExample{
	public static void main(String[] args){
		//Creating instance of jframe
		JFrame frame=new JFrame();
		//creating instance of jbutton
		JButton button=new JButton("Click");
		//x-axis,y=axis,width and height
		button.setBounds(130,100,100,40);
		frame.add(button);
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
