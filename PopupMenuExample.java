//Example of jPopupMenu
import javax.swing.*;
import java.awt.event.*;

public class PopupMenuExample{
	PopupMenuExample(){
		final JFrame f=new JFrame("PopupMenuExample");
		final JPopupMenu popupmenu=new JPopupMenu("Edit");
		JMenuItem cut=new JMenuItem("cut");
		JMenuItem copy=new JMenuItem("copy");
		JMenuItem paste=new JMenuItem("paste");
		popupmenu.add(cut);
		popupmenu.add(copy);
		popupmenu.add(paste);
		f.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				
				popupmenu.show();
				e.getX();
				e.getY();
			}
		});
		f.add(popupmenu);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new PopupMenuExample();
	}
}