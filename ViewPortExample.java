//Example of Viewport
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.*;


public class ViewPortExample{
	public static void main(String[] args){
		
		JFrame frame=new JFrame("ViewPortExample");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JLabel label=new JLabel("Label");
		label.setPreferredSize(new Dimension(1000,1000));
		
		JScrollPane scrolpane=new JScrollPane(label);
		JButton button=new JButton();
		
		scrolpane.setHorizontalScrollBarPolicy(scrolpane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrolpane.setVerticalScrollBarPolicy(scrolpane.VERTICAL_SCROLLBAR_ALWAYS);
		scrolpane.setViewportBorder(new LineBorder(Color.RED));
		
		scrolpane.getViewport().add(button,null);
		frame.add(scrolpane,BorderLayout.CENTER);
		frame.setSize(400,500);
		frame.setVisible(true);
	}
}

	
	