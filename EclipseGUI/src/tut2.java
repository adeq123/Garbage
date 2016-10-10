import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tut2 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField resultField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tut2 window = new tut2();
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
	public tut2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	double num1, num2, result;
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(30, 28, 159, 47);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(217, 28, 159, 47);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try{
					
					num1 = Double.parseDouble(textFieldNum1.getText());
					num2 = Double.parseDouble(textFieldNum2.getText());
					result = num1 + num2;
					resultField.setText( Double.toString(result)); 
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Numbers only !");
				}
			}
		});
		addButton.setBounds(52, 142, 118, 41);
		frame.getContentPane().add(addButton);
		
		JButton minusButton = new JButton("Minus");
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
try{
					
					num1 = Double.parseDouble(textFieldNum1.getText());
					num2 = Double.parseDouble(textFieldNum2.getText());
					result = num1 - num2;
					resultField.setText( Double.toString(result)); 
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Numbers only !");
				}

			}
		});
		minusButton.setBounds(240, 142, 118, 41);
		frame.getContentPane().add(minusButton);
		
		JLabel resultLabel = new JLabel("The result is");
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resultLabel.setBounds(41, 194, 129, 32);
		frame.getContentPane().add(resultLabel);
		
		resultField = new JTextField();
		resultField.setBounds(217, 194, 159, 32);
		frame.getContentPane().add(resultField);
		resultField.setColumns(10);
		resultField.setEditable(false);
	}
}
