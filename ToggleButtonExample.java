//Example of ToggleButton
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

public class ToggleButtonExample extends JFrame implements ItemListener{
	public static void main(String[] args){
		new ToggleButtonExample();
	}
	private JToggleButton button;
	
	ToggleButtonExample(){
		setTitle("JToggleButton with ItemListener Example");
		setLayout(new FlowLayout());
		setJToggleButton();
		setAction();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void setJToggleButton(){
		button=new JToggleButton("ON");
		add(button);
	}
	private void setAction(){
		button.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent eve){
		if(button.isSelected())
			button.setText("OF");
		else
			button.setText("ON");
	}
}
		