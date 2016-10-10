import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame{

	JButton add, subtrack, multiply, divide;
	JTextField num1, num2;
	JLabel result, enter1, enter2;
	
	public Calculator(){
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		enter1 = new JLabel("1st: ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(enter1, c);
		
		enter2 = new JLabel("2nd: ");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		add(enter2, c);
		
		result = new JLabel("");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 4;
		add(result, c);
		
		num1 = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 3;
		add(num1, c);
		
		num2 = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 3;
		add(num2, c);
		
		add = new JButton("+");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		add(add, c);
		
		subtrack = new JButton("-");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		add(subtrack, c);
		
		
		multiply = new JButton("*");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = 1;
		add(multiply, c);
		
		divide = new JButton("/");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.gridwidth = 1;
		add(divide, c);
		
		Event a = new Event();
		add.addActionListener(a);
		subtrack.addActionListener(a);
		multiply.addActionListener(a);
		divide.addActionListener(a);
		
	}
	
	public class Event implements ActionListener{

		public void actionPerformed(ActionEvent a) {
			double number1, number2;
			
			try {
				number1 = Double.parseDouble(num1.getText());
				
			}catch(NumberFormatException e){
				result.setText("Illegal data 1st field");
				result.setForeground(Color.RED);
				return;
				
			}
			
			try {
				number2 = Double.parseDouble(num2.getText());
				
			}catch(NumberFormatException e){
				result.setText("Illegal data 2nd field");
				result.setForeground(Color.RED);
				return;
				
			}
			
			String op = a.getActionCommand();
			if(op.equals("+")) {
				double sum = number1 + number2;
				result.setText(number1 + " + "+ number2 + "= " + sum);
				result.setForeground(Color.RED);
			}else if(op.equals("-")){
				double diff = number1 - number2;
				result.setText(number1 + " - "+ number2 + "= " + diff);
				result.setForeground(Color.RED);
			}else if(op.equals("*")){
				double mul = number1 * number2;
				result.setText(number1 + " * "+ number2 + "= " + mul);
				result.setForeground(Color.RED);
			}else if(op.equals("/")){
				double div = number1 / number2;
				if(number2 == 0){
					result.setText("Can't divide by 0!!!!");
					result.setForeground(Color.RED);
				}else{
				result.setText(number1 + " / "+ number2 + "= " + div);
				result.setForeground(Color.RED);
				}
			}
			
		}
		
	}
	public static void main (String args[]){
		Calculator calc = new Calculator();
		calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calc.setVisible(true);
		calc.setSize(200, 175);
		calc.setTitle("Calculator");
	}
}

