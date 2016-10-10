import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Beeper extends JFrame{
	
	private JButton button;
	private JLabel label;
	int counter = 0, x = 0;
	String s;
	
	public Beeper(){
		setLayout(new FlowLayout());
		
		button = new JButton("Click me for sound");
		add(button);
		
		label = new JLabel();
		add(label);
		
		Event e = new Event();
		button.addActionListener(e);
		
	}

	public class Event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			counter++;
			
			if(x == 0) {
				s = "time";
			}else{
				s = "times";
			}
			label.setText("You have clicked " + counter + " " + s);
			x = 1;
			
		}
		
	}
	public static void main(String[] args) {

		Beeper beep = new Beeper();
		beep.setVisible(true);
		beep.setSize(200, 200);
		beep.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
