//An Example with AcvtionListener
import javax.swing.*;
import java.awt.event.*;

public class ButtonExample1{
	public static void main(String[] args){
		JFrame f=new JFrame("ButtonExample");
		final JTextField tf=new JTextField();
		tf.setBounds(50,50,150,50);
		JButton b=new JButton("Click here");
		b.setBounds(50,100,90,30);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae){
				tf.setText("Welcome to NPTEL");
				
			}
	});
	
	f.add(b);
	f.add(tf);
	f.setSize(400,500);
	f.setLayout(null);
	f.setVisible(true);
	}
}	