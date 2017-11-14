import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RatioEditView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField homeText;
	private JTextField qText;
	private JTextField midText;
	private JTextField finalText;

	public RatioEditView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel tablePanel = new JPanel();
		contentPane.add(tablePanel, BorderLayout.CENTER);
		tablePanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 404, 53);
		tablePanel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"\u0E04\u0E30\u0E41\u0E19\u0E19\u0E40\u0E01\u0E47\u0E1A", "\u0E2A\u0E2D\u0E1A\u0E22\u0E48\u0E2D\u0E22", "\u0E2A\u0E2D\u0E1A\u0E01\u0E25\u0E32\u0E07\u0E20\u0E32\u0E04", "\u0E2A\u0E2D\u0E1A\u0E1B\u0E25\u0E32\u0E22\u0E20\u0E32\u0E04"
			}
		));
		Object points[][] = new Object[1][4];
		points[0][0] = PointCriteriaController.getQuiz()+"%";
		points[0][1] = PointCriteriaController.gethomeWork()+"%";
		points[0][2] = PointCriteriaController.getMidTest()+"%";
		points[0][3] = PointCriteriaController.getFinalTest()+"%";
		
		
		
		DefaultTableModel mod = new DefaultTableModel(points,new String[]{
			"Quiz","การบ้านย่อย","สอบกาลางภาค","สอบปลายภาค"	
		});
		scrollPane.setViewportView(table);
		table.setModel(mod);
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PointCriteriaController.setCriteria(Integer.parseInt(qText.getText()), Integer.parseInt(homeText.getText()), Integer.parseInt(midText.getText()), Integer.parseInt(finalText.getText()));
				if(PointCriteriaController.isCorrect()){
					table.setValueAt(PointCriteriaController.getQuiz()+"%", 0, 0);
					table.setValueAt(PointCriteriaController.gethomeWork()+"%", 0, 1);
					table.setValueAt(PointCriteriaController.getMidTest()+"%", 0, 2);
					table.setValueAt(PointCriteriaController.getFinalTest()+"%", 0, 3);
					
				}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdate.setBounds(10, 75, 404, 42);
		tablePanel.add(btnUpdate);
		
		JLabel homeLabel = new JLabel("คะแนนเก็บ");
		homeLabel.setBounds(38, 159, 65, 14);
		tablePanel.add(homeLabel);
		
		JLabel quizLabel = new JLabel("สอบย่อย");
		quizLabel.setBounds(38, 134, 46, 14);
		tablePanel.add(quizLabel);
		
		JLabel midLabel = new JLabel("สอบกลางภาค");
		midLabel.setBounds(38, 184, 65, 14);
		tablePanel.add(midLabel);
		
		JLabel finalLabel = new JLabel("สอบปลายภาค");
		finalLabel.setBounds(38, 209, 65, 14);
		tablePanel.add(finalLabel);
		
		homeText = new JTextField();
		homeText.setBounds(136, 156, 86, 20);
		tablePanel.add(homeText);
		homeText.setColumns(10);
		
		qText = new JTextField();
		qText.setBounds(136, 131, 86, 20);
		tablePanel.add(qText);
		qText.setColumns(10);
		
		midText = new JTextField();
		midText.setBounds(136, 181, 86, 20);
		tablePanel.add(midText);
		midText.setColumns(10);
		
		finalText = new JTextField();
		finalText.setBounds(136, 206, 86, 20);
		tablePanel.add(finalText);
		finalText.setColumns(10);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
