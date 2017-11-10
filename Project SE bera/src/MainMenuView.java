import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainMenuView extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	public static String week;
	public static String ratioString[];
	private StudentCollectors collect;
	private ClassListView classList;


	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuView frame = new MainMenuView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainMenuView() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(59, 28, 606, 551);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel buttonPanel = new JPanel();

		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setBounds(41, 112, 488, 318);
		panel.add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(2, 2, 0, 0));

		JButton editBtn = new JButton("4");
		/*editBtn.setHorizontalAlignment(SwingConstants.CENTER);
		editBtn.setVerticalAlignment(SwingConstants.BOTTOM);*/
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Not Complete yet");
	
			}
		});
		editBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		editBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon("wrench-icon.png");
		Image image = icon.getImage().getScaledInstance(60, 60, 0);
		icon = new ImageIcon(image);
		editBtn.setIcon(icon);
		editBtn.setForeground(Color.BLACK);
		editBtn.setBackground(new Color(0, 204, 153));
		editBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonPanel.add(editBtn);

		JButton showScoreBtn = new JButton("แก้ไขตาราง");
		ImageIcon table = new ImageIcon("table.png");
		Image tableImg = table.getImage().getScaledInstance(50, 50, 0);
		table = new ImageIcon(tableImg);
		showScoreBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		showScoreBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		showScoreBtn.setIcon(table);
		showScoreBtn.setForeground(Color.BLACK);
		showScoreBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		showScoreBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		showScoreBtn.setBackground(new Color(0, 204, 153));
		buttonPanel.add(showScoreBtn);

		JButton showListBtn = new JButton("2");
		ImageIcon tableIcon2 = new ImageIcon("table2.png");
		Image img2 = tableIcon2.getImage().getScaledInstance(50, 50, 0);
		
		tableIcon2 = new ImageIcon(img2);
		showListBtn.setIcon(tableIcon2);
		showListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					classList.setVisible(true);
				}catch (NullPointerException ea){
					JOptionPane.showMessageDialog(null, "You are not upload file yet.Please Upload File First");
				}
				
			}
		});
		showListBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		showListBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		showListBtn.setForeground(Color.BLACK);
		showListBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		showListBtn.setBackground(new Color(0, 204, 153));
		buttonPanel.add(showListBtn);

		JButton ratioEditBtn = new JButton("3");
		ratioEditBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RatioEditView ratio = new RatioEditView();
				ratio.setVisible(true);
			}
		});
		ratioEditBtn.setForeground(Color.BLACK);
		ratioEditBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ratioEditBtn.setBackground(new Color(0, 204, 153));
		buttonPanel.add(ratioEditBtn);

		JPanel userPanel = new JPanel();
		userPanel.setForeground(SystemColor.menu);
		userPanel.setBackground(Color.WHITE);
		userPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "User", TitledBorder.LEADING,
				TitledBorder.TOP, null, Color.BLACK));
		userPanel.setBounds(39, 11, 190, 90);
		panel.add(userPanel);
		userPanel.setLayout(null);

		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(26, 24, 120, 19);
		nameLabel.setBackground(Color.BLACK);
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		userPanel.add(nameLabel);

		JLabel statusLabel = new JLabel("Status");
		statusLabel.setBounds(26, 54, 65, 14);
		userPanel.add(statusLabel);

		JPanel saveLoadPanel = new JPanel();
		saveLoadPanel.setBounds(345, 27, 184, 56);
		panel.add(saveLoadPanel);
		saveLoadPanel.setLayout(new GridLayout(0, 2));

		JButton saveBtn = new JButton("Save");
		saveLoadPanel.add(saveBtn);
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		saveBtn.setForeground(Color.BLACK);
		saveBtn.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		saveBtn.setBackground(new Color(0, 204, 102));

		JButton loadBtn = new JButton("Load");
		ImageIcon key = new ImageIcon("key.png");
		Image keyImg = key.getImage().getScaledInstance(50, 50, 0);
		key = new ImageIcon(keyImg);
		saveLoadPanel.add(loadBtn);
		loadBtn.setForeground(Color.BLACK);

		loadBtn.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		loadBtn.setBackground(new Color(0, 204, 102));

		JButton logoutBtn = new JButton("");
		logoutBtn.setBounds(455, 472, 74, 56);
		panel.add(logoutBtn);
		logoutBtn.setForeground(Color.WHITE);
		logoutBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		logoutBtn.setBackground(Color.RED);
		logoutBtn.setIcon(key);
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					JFileChooser chooser = new JFileChooser();
					chooser.setFileFilter(new FileNameExtensionFilter("CSV File", "csv"));
					if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

						try {
							collect = new StudentCollectors(chooser.getSelectedFile());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						collect.printStudentList();
						classList = new ClassListView(collect.getStudents(), collect.getStudents().size(), 5);

					}
				}catch(Exception eaa){
					JOptionPane.showMessageDialog(null, "Your selected file is invalid.");
				}
				
			}
		});
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
