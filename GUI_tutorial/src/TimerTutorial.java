import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
import javax.swing.*;

public class TimerTutorial extends JFrame{
	
	JLabel promptLabel, timerLabel;
	int counter;
	JTextField tf;
	JButton button;
	Timer timer;
	
	public TimerTutorial (){
		setLayout(new GridLayout(2 ,2 ,5 ,5));
		
		promptLabel = new JLabel("Enter seconds: ", SwingConstants.CENTER);
		add(promptLabel);
		
		tf = new JTextField(5);
		add(tf);
		
		timerLabel = new JLabel("Waiting... ", SwingConstants.CENTER);
		add(timerLabel);	
		
		button = new JButton("Start timing");
		add(button);
		
		Event e = new Event();
		button.addActionListener(e);
		
	}
	
	public class Event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String text1 = tf.getText();
			int count;
			if(text1.isEmpty()){
				count= 0;
			}else{
				count = (int) (Double.parseDouble(text1));
			}
			timerLabel.setText("Time left:" + count);
			
			TimeClass  tc  = new TimeClass(count);
			timer = new Timer(1000, tc);
			timer.start();
		}
		
	}
	
	public class TimeClass implements ActionListener{
		
		int counter;
		
		public TimeClass(int counter){
			this.counter = counter;
		}
		
		public void actionPerformed(ActionEvent tc){
			counter--;
			
			if(counter >= 1) {
				timerLabel.setText("Time left: " + counter);
			}else {
				timer.stop();
				timerLabel.setText("Done!");
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	public static void main(String[] args) {
		
		TimerTutorial gui = new TimerTutorial();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setTitle("Timer Program");
		gui.setSize(250, 100);
	}

}
