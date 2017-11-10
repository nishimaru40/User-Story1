import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.util.ArrayList;

public class ClassListView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Object[][] row;
	private static int colnum;
	private static int rownum;
	private Object[] col;
	private ArrayList<Student> reciever;

	
	public ClassListView(ArrayList<Student> stu,int row,int col) {
		
		reciever = new ArrayList<>();
		reciever = stu;
		colnum = col;
		rownum= row;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 251);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 424, 162);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Index", "Id", "Name", "Type", "Status"
			}
		));
		//row = new Object[];
		this.row = new Object[rownum][colnum];
		this.col = new Object[colnum];
		
		
		for(int i = 0 ; i < row ; i++){
			for(int j = 0 ; j < col ; j++){
				if(j == 0){
					this.row[i][j] = reciever.get(i).getIndex();
				}if(j==1)
				{
					this.row[i][j] = reciever.get(i).getId();
				}if(j==2){
					this.row[i][j] = reciever.get(i).getName();
				}if(j==3){
					this.row[i][j] = reciever.get(i).getType();
				}if(j==4){
					this.row[i][j] = reciever.get(i).getStatus();
				}
				
			}
			
		}
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(this.row, new String[] {
				"Index", "Id", "Name", "Type", "Status"}));
		scrollPane.setViewportView(table);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
}
