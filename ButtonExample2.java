//Displaying image on the Button
import javax.swing.*;

public class ButtonExample2{
	ButtonExample2(){
		JFrame f=new JFrame("ButtonExample");
		JButton b=new JButton(new ImageIcon("C:\\Users\\jitendra kumar\\Pictures\\icon.png"));
		b.setBounds(100,100,100,50);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new ButtonExample2();
	}
}