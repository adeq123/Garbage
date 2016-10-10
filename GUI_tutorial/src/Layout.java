import java.awt.*;
import javax.swing.*;

public class Layout extends JFrame{

	JButton button1, button2, button3;
	JLabel label1, label2, label3;
	
	public Layout(){
		setLayout(new GridLayout(2,3));
		
		button1 = new JButton("Button 1");
		add(button1);
		button2 = new JButton("Button 2");
		add(button2);
		button3 = new JButton("Button 3");
		add(button3);
		
		label1 = new JLabel("Label 1");
		add(label1);
		label2 = new JLabel("Label 2");
		add(label2);
		label3 = new JLabel("Label 3");
		add(label3);
		
	}
	public static void main(String[] args) {
		
		Layout layout = new Layout();
		layout.setDefaultCloseOperation(EXIT_ON_CLOSE);
		layout.setVisible(true);
		layout.pack();
		layout.setTitle("Layout");
	}

}
