//Example of JSplinner
import javax.swing.*;

public class SpinnerExample{
	public static void main(String[] args){
		JFrame frame=new JFrame("SpinnerExample");
		SpinnerNumberModel value=new SpinnerNumberModel(5,0,10,1);
		
		JSpinner spinner =new JSpinner(value);
		spinner.setBounds(100,100,50,30);
		frame.add(spinner);
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
		