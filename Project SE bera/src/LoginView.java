import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField userField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 204));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		userField = new JTextField();
		userField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userField.setBounds(70, 50, 286, 43);
		panel.add(userField);
		userField.setColumns(10);
		
		JLabel label = new JLabel("ชื่อผู้ใช้");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(10, 52, 63, 29);
		panel.add(label);
		
		JLabel label_1 = new JLabel("รหัสผ่าน");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(10, 109, 63, 29);
		panel.add(label_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(0, 204, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(70, 172, 100, 43);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(70, 104, 286, 43);
		panel.add(passwordField);
	}
}
