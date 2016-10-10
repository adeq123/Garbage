import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MouseMover extends JFrame{
	
	private JLabel label1, label2, label3, label4, lablel5, errorlabel;
	private JTextField tf1, tf2, tf3, tf4;
	JButton button;
	
	public MouseMover(){
		setLayout(new GridLayout(5, 2, 5, 5));
		
		label1 = new JLabel("Enter number of movements:");
		add(label1);
		
		tf1 = new JTextField();
		add(tf1);
		
		label2 = new JLabel("Enter delay between movements");
		add(label2);	
		
		tf2 = new JTextField();
		add(tf2);
		
		label3 = new JLabel("Wnter screen width  in pixels");
		add(label3);
		
		tf3 = new JTextField();
		add(tf3);
		
		label4 = new JLabel("Wnter screen height  in pixels");
		add(label4);
		
		tf4 = new JTextField();
		add(tf4);	
		
		button = new JButton ("Start");
		add(button);
		
		errorlabel = new JLabel ("");
		add(errorlabel);
		
		Event e = new Event();
		button.addActionListener(e);
	}
	
	public class Event implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			try {
			int num = (int) Double.parseDouble(tf1.getText());
			int delay = (int) Double.parseDouble(tf2.getText());
			int width = (int) Double.parseDouble(tf3.getText());
			int heigth = (int) Double.parseDouble(tf4.getText());
			
			if(num <= 0 || delay <= 0 || width <= 0 || heigth <= 0){
				errorlabel.setText("Please enter positive values");
			}else {
				errorlabel.setText("");
				
				try{
					Robot rob = new Robot();
					
					for(int i=0; i< num; i++){
						rob.mouseMove((int) (Math.random()*width), (int) (Math.random() * heigth));
						rob.delay(delay);
					}
				}catch (AWTException ex){
					System.exit(0);
				}
			}
			
			
			}catch (Exception ex){
				errorlabel.setText("Numbers only");
			}
		
		}
	}
	public static void main (String args[]){
		MouseMover mover = new MouseMover();
		mover.setVisible(true);
		mover.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mover.pack();
		mover.setTitle("Mouse Mover");
		
	}
}
