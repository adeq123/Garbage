
import javax.swing.*;
import java.awt.*;

public class FirstGui extends JFrame{

	private JLabel label;
	private JButton button;
	private JTextField textfield;
	
	public FirstGui(){
		
	setLayout(new FlowLayout());
	
	label = new JLabel("I am a Label");
	add(label);
	
	button = new JButton("Click me");
	add(button);
	
	textfield = new JTextField(15);
	add(textfield);
	}
	
	public static void main(String args[]){
	FirstGui gui = new FirstGui();
	gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
	gui.setVisible(true);
	gui.setTitle("okienko");
	gui.setSize(200,100);
	}
}
