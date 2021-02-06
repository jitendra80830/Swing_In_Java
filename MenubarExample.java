//Example of JMenubar
import javax.swing.*;

public class MenubarExample{
	JMenu menu,submenu;
	JMenuItem l1,l2,l3,l4,l5;
	MenubarExample(){
		JFrame f=new JFrame("Example of JMenu");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("menu");
		submenu=new JMenu("submenu");
		l1=new JMenuItem("Apple");
		l2=new JMenuItem("Orange");
		l3=new JMenuItem("Papaya");
		l4=new JMenuItem("Guava");
		l5=new JMenuItem("Coconut");
		menu.add(l1);
		menu.add(l2);
		menu.add(l3);
		menu.add(l4);
		submenu.add(l5);
		mb.add(menu);
		
		menu.add(submenu);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new MenubarExample();
	}
}
		
		