//Example of JLabel
import javax.swing.*;

public class LabelExample{
	public static void main(String[] args){
		JFrame f=new JFrame("JLabelExample");
		JLabel l1,l2;
		l1=new JLabel("First Label");
		l1.setBounds(50,30,100,30);
		l2=new JLabel("Second Label");
		l2.setBounds(50,100,100,50);
		f.add(l1);
		f.add(l2);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
		