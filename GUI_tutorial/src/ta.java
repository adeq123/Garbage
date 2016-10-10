import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ta extends JFrame{

	JTextArea textArea;
	JButton button;
	JLabel label;
	
	public ta(){
	
		setLayout(new FlowLayout());
		
		textArea = new JTextArea(5,30);
		add(textArea);
		
		button = new JButton("Click here to put text into label");
		add(button);
		
		label = new JLabel("");
		add(label);
		
		Event e = new Event();
		button.addActionListener(e);
		
		
	}
	

	public class Event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String text = textArea.getText();
			
			if(text.isEmpty()){
				label.setText("Please enter some text");
			}else
				label.setText(text);
			
		}
	}
	
	
	public static void main(String[] args) {
	
		ta gui = new ta();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(400,200);

	}

}
