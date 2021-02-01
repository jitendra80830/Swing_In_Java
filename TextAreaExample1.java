//An Example JTextArea with ActionListener
import javax.swing.*;
import java.awt.event.*;

public class TextAreaExample1 implements ActionListener{
	JLabel l1,l2;
	JTextArea area;
	JButton b;
	TextAreaExample1(){
		JFrame f=new JFrame();
		l1=new JLabel();
		l1.setBounds(100,40,100,50);
		l2=new JLabel();
		l2.setBounds(100,100,100,50);
		area=new JTextArea();
		area.setBounds(200,100,300,50);
		b=new JButton("cound Words");
		b.setBounds(150,300,120,50);
		b.addActionListener(this);
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String text=area.getText();
		String words[]=text.split("\\s");
		l1.setText("words :"+words.length);
		l2.setText("characters : "+text.length());
	}
	public static void main(String[] args){
		new TextAreaExample1();
	}
}
		
		