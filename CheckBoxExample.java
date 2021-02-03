//Example of JChebox
import javax.swing.*;

public class CheckBoxExample{
	CheckBoxExample(){
		JFrame f=new JFrame("CheckBoxExample");
		JCheckBox checkbox =new JCheckBox("c++");
		checkbox.setBounds(100,100,50,50);
		JCheckBox checkbox1=new JCheckBox("java",true);
		checkbox1.setBounds(100,150,50,50);
		f.add(checkbox);
		f.add(checkbox1);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new CheckBoxExample();
	}
}