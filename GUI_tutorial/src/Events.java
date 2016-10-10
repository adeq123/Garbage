
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Events extends JFrame{
	
	private JLabel label1;
	private JLabel label2;
	private JButton button1;
	private JButton button2;
	private int x = 0, y = 0;
	
	public Events(){
		
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Label1");
		add(label1);
		
		label2 = new JLabel("Label2");
		add(label2);
		
		button1 = new JButton("Click on button");
		add(button1);

		button2 = new JButton("Click on button");
		add(button2);
		
		event e = new event();
		button1.addActionListener(e);
		
		event2 e2 = new event2();
		button2.addActionListener(e2);
		
	}
	
	public class event implements ActionListener{
			

		@Override
		public void actionPerformed(ActionEvent e) {
		if(x==0){
				label1.setText(" What ever you want");
				x=1;
		}else{
			label1.setText("");
			x=0;
		}
		}
	}
	
	public class event2 implements ActionListener{
			

		@Override
		public void actionPerformed(ActionEvent e2) {
			if(x==0){
				label2.setText(" Different text");
				y=1;
		}else{
			label2.setText("");
			y=0;
		}
			
	}
	}
	
	public static void main(String[] args) {
		
		Events gui = new Events();
		gui.setVisible(true);
		gui.setSize(300,100);
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setTitle("Event GUI");

	}

}
