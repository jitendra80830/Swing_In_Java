//Example of JButton (inside main)
import javax.swing.*;

public class ButtonExample{
	public static void main(String[] args){
		JFrame f=new JFrame("JFrameExamole");
		JButton b=new JButton("Click here");
		b.setBounds(100,50,100,50);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}