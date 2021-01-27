// Swing by inheritance
import javax.swing.*;

public class Simple1 extends JFrame{
	Simple1(){
		JButton b=new JButton("Click");
		b.setBounds(100,100,100,50);
		add(b);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args){
		new Simple1();
	}
}