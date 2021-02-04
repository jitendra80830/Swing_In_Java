//Example of JComboBox
import javax.swing.*;

public class JComboBoxExample{
	JFrame f;
	JComboBoxExample(){
		f=new JFrame("JComboBoxExample");
		String country[]={"India","Aus","U.s.a","England"};
		JComboBox cb=new JComboBox(country);
		cb.setBounds(50,50,90,20);
		f.add(cb);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new JComboBoxExample();
	}
}