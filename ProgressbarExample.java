//Example of JPrograessbar
import javax.swing.*;

public class ProgressbarExample extends JFrame{
	JProgressBar jb;
	int i=0,num=0;
	ProgressbarExample(){
		jb=new JProgressBar(0,2000);
		jb.setBounds(40,40,160,30);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(250,150);
		setLayout(null);
		
	}
	public void iterate(){
		while(i<=2000){
			jb.setValue(i);
			i=i+20;
			try{
				Thread.sleep(i);
			}
			catch(Exception e){}
		}
	}
	public static void main(String[] args){
		ProgressbarExample m=new ProgressbarExample();
		m.setVisible(true);
		m.iterate();
	}
}
		
		