//Example of JRadioButton
import javax.swing.*;

public class RadioButtonExample{
	JFrame f;
	RadioButtonExample(){
		f=new JFrame("RadioButtonExample");
		JRadioButton r1=new JRadioButton("A Male");
		JRadioButton r2=new JRadioButton("B Female");
		r1.setBounds(100,100,100,30);
		r2.setBounds(100,150,100,30);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		f.add(r1);
		f.add(r2);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new RadioButtonExample();
	}
}