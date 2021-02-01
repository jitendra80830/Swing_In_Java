//Exmaple of JPasswordField
import javax.swing.*;
public class PasswordFieldExample{
	public static void main(String[] args){
		JFrame f=new JFrame();
		JPasswordField pf=new JPasswordField();
		JLabel l1=new JLabel("password");
		l1.setBounds(20,100,80,30);
		pf.setBounds(100,100,100,30);
		f.add(l1);
		f.add(pf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
		