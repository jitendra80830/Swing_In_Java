//Swing Example with Constructor
import javax.swing.*;

public class Simple{
	JFrame frame;
	Simple(){
		frame=new JFrame();
		JButton button=new JButton("Click");
		button.setBounds(100,50,100,50);
		frame.add(button);
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new Simple();
	}
}