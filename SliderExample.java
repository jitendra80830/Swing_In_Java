//Example of JSlider
import javax.swing.*;

public class SliderExample extends JFrame{
	public SliderExample(){
		
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
		JPanel panel=new JPanel();
		panel.add(slider);
		add(panel);
	}
	public static void main(String[] args){
		SliderExample frame=new SliderExample();
		frame.pack();
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
