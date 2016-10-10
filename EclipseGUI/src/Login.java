import java.awt.EventQueue;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection connection = null;
	private JTextField userNameField;
	private JPasswordField passwordField;
	
	public Login() {
		initialize();
		connection = sqliteConnection.dbConnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1020, 793);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel userNameLabel = new JLabel("User name");
		userNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		userNameLabel.setBounds(276, 129, 72, 14);
		frame.getContentPane().add(userNameLabel);
		
		JLabel pwdLabel = new JLabel("Password");
		pwdLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pwdLabel.setBounds(276, 211, 72, 14);
		frame.getContentPane().add(pwdLabel);
		
		userNameField = new JTextField();
		userNameField.setBounds(358, 114, 153, 45);
		frame.getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		JButton loginButton = new JButton("");
		loginButton.setIcon(new ImageIcon(Login.class.getResource("/images/ok.png")));
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					String query = "select * from EmployeeInfo where username = ? and password = ?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, userNameField.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs = pst.executeQuery();
					
					int count = 0;
					while(rs.next()){
						count++;
						
					}
					if(count == 1){
						JOptionPane.showMessageDialog(null, "Username and password is correct!");
						frame.dispose();
						EmployeeInfo emp = new EmployeeInfo();
						emp.setExtendedState(emp.getExtendedState() | JFrame.MAXIMIZED_BOTH);
						emp.setVisible(true);
					}else if(count > 1){
						JOptionPane.showMessageDialog(null, "Duplicate user and password!");
					}else{
						JOptionPane.showMessageDialog(null, "Username or password not correct!");
					}
					rs.close();
					pst.close();
				}catch (Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		loginButton.setBounds(521, 172, 72, 72);
		frame.getContentPane().add(loginButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(358, 185, 153, 45);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/icon.png")));
		lblNewLabel.setBounds(10, 69, 256, 265);
		frame.getContentPane().add(lblNewLabel);
	}
}
