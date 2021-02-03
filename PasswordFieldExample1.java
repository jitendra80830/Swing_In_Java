//Example of JPasswordField with ActionListener
import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldExample1{
	public static void main(String[] args){
		JFrame f=new JFrame();
		final JLabel lable=new JLabel();
		lable.setBounds(20,115,100,50);
		final JPasswordField value=new JPasswordField();
		value.setBounds(100,75,100,30);
		JLabel l1=new JLabel("username");
		l1.setBounds(20,20,80,30);
		JLabel l2=new JLabel("password");
		l2.setBounds(20,75,80,30);
		JButton b=new JButton("Log in");
		b.setBounds(100,20,80,30);
		final JTextField text=new JTextField();
		text.setBounds(100,20,100,30);
		f.add(lable);
		f.add(value);
		f.add(l1);
		f.add(l2);
		f.add(b);
		f.add(text);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String data="username"+text.getText();
				data+="password"+new String(value.getPassword());
				lable.setText(data);
			}
		});
	}
}
		