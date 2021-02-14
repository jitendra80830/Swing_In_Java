//Java Programming Create A Calculater
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener{
	//create a frame
	static JFrame frame;
	
	//create a textfield
	static JTextField text;
	
	//Store operation and operands
	String s0,s1,s2;
	
	//Deafault consructor
	Calculator(){
		s0=s1=s2="";
	}
	//main function
	public static void main(String[] args){
		//create a frame
		frame = new JFrame("Calculator");
		try{
			//set look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
		//create a object of class
		Calculator c=new Calculator();
		
		//create a textfield
		text =new JTextField(16);
		//set the textfield to non editable
		text.setEditable(false);
		
		//cretae numbers button and operation
		JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,be,beq,beq1;
		//create a numbers button
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		
		//create equal button
		beq1 = new JButton("=");
		
		//create operation button
		ba = new JButton("+");
		bs = new JButton("-");
		bm = new JButton("*");
		bd = new JButton("/");
		beq = new JButton("C");
		//create . button
		be = new JButton(".");
		//create a panel
		JPanel panel = new JPanel();
		
		//add Action Listener
		ba.addActionListener(c);
		bs.addActionListener(c);
		bm.addActionListener(c);
		bd.addActionListener(c);
		b0.addActionListener(c);
		b1.addActionListener(c);
		b2.addActionListener(c);
		b2.addActionListener(c);
		b3.addActionListener(c);
		b4.addActionListener(c);
		b5.addActionListener(c);
		b6.addActionListener(c);
		b7.addActionListener(c);
		b8.addActionListener(c);
		b9.addActionListener(c);
		be.addActionListener(c);
		beq.addActionListener(c);
		beq1.addActionListener(c);
		//add Elements in panel
		panel.add(text);
		panel.add(ba);
		panel.add(bs);
		panel.add(bm);
		panel.add(bd);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b0);
		panel.add(be);
		panel.add(beq);
		panel.add(beq1);
		
		//set Background of panel
		panel.setBackground(Color.blue);
		
		//add panel to frame
		frame.add(panel);
		frame.setSize(200,200);
		frame.show();
	}
	public void actionPerformed(ActionEvent e){
	}
}
		
		
		
		
		
