//Example of JSeparator
import javax.swing.*;

public class SeparatorExample{
	JMenu menu,submenu;
	JMenuItem l1,l2,l3,l4,l5;
	SeparatorExample(){
		JFrame f=new JFrame("SeparatorExample");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Menu");
		submenu=new JMenu("submenu");
		l1=new JMenuItem("Item1");
		l2=new JMenuItem("Item2");
		l3=new JMenuItem("Item3");
		menu.add(l1);
		menu.add(l2);
		submenu.add(l3);
		menu.add(submenu);
		menu.addSeparator();
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new SeparatorExample();
	}
}