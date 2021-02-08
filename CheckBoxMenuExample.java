//Example of JCheckBoxMenu
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.*;

public class CheckBoxMenuExample{
	public static void main(String[] args){
		JFrame f=new JFrame("menuExample");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar=new JMenuBar();
		JMenu fileMenu=new JMenu("file");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menubar.add(fileMenu);
		JMenuItem menuItem=new JMenuItem("open",KeyEvent.VK_N);
		fileMenu.add(menuItem);
		JCheckBoxMenuItem caseMenuItem=new JCheckBoxMenuItem("option");
		caseMenuItem.setMnemonic(KeyEvent.VK_C);
		fileMenu.add(caseMenuItem);
		ActionListener aListener=new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				
				AbstractButton button= (AbstractButton) event.getSource();
				boolean selected=button.getModel().isSelected();
				String newlabel;
				Icon newIcon;
				if(selected){
					newlabel="value-1";
				}else{
					newlabel="value-2";
				}
				button.setText(newlabel);
			}
		};
		caseMenuItem.addActionListener(aListener);
		f.setJMenuBar(menubar);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}