//Example of TextArea
import javax.swing.*;
public class TextAreaExample{
	TextAreaExample(){
		JFrame f=new JFrame("TextAreaExample");
		JTextArea area=new JTextArea("Wlcome to IIT Khkp");
		area.setBounds(100,50,100,50);
		f.add(area);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new TextAreaExample();
	}
}