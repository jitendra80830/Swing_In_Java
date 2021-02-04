//Example of JTable
import javax.swing.*;

public class TableExample{
	JFrame f;
	TableExample(){
		f=new JFrame();
		String[][] data={{"101","amit","6700"},{"aman","102","6800"},{"103","Akash","6900"}};
		String[] column={"ID","Name","Salary"};
		JTable table=new JTable(data,column);
		table.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(table);
		f.add(sp);
		f.add(table);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new TableExample();
	}
}