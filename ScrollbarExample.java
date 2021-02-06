//Example of JScrollbar
import javax.swing.*;

public class ScrollbarExample{
	ScrollbarExample(){
		JFrame f=new JFrame("ScrollbarExample");
		JScrollBar s=new JScrollBar();
		s.setBounds(100,100,50,100);
		f.add(s);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new ScrollbarExample();
	}
}
		