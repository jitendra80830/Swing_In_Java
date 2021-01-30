//Example of JTextField
import javax.swing.*;

public class TextFieldExample{
	public static void main(String[] args){
		JFrame f=new JFrame("JTextFieldExample");
		JTextField tf1,tf2;
		tf1=new JTextField("WelCome to IIT Khrp");
		tf1.setBounds(100,10,200,50);
		tf2=new JTextField("Awt tutorial");
		tf2.setBounds(100,100,100,40);
		f.add(tf1);
		f.add(tf2);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
		