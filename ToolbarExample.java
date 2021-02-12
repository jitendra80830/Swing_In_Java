//Example of Toolbar
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.JComboBox;

public class ToolbarExample{
	public static void main(String[] args){
		JFrame frame=new JFrame("ToolbarExample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JToolBar toolbar=new JToolBar();
		toolbar.setRollover(true);
		JButton button=new JButton("File");
		toolbar.add(button);
		toolbar.addSeparator();
		toolbar.add(new JButton("Edit"));
		toolbar.add(new JComboBox(new String[] {"opt-1","opt-12","opt-3","opt-4"}));
		Container contentpane=frame.getContentPane();
		contentpane.add(toolbar,BorderLayout.NORTH);
		
		JTextArea textarea=new JTextArea();
		JScrollPane pane=new JScrollPane(textarea);
		contentpane.add(pane,BorderLayout.EAST);
		frame.setSize(400,500);
		frame.setVisible(true);
	}
}
		