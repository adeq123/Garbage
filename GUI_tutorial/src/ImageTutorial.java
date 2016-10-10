import java.awt.*;
import javax.swing.*;

public class ImageTutorial extends JFrame{
	
	private ImageIcon image;
	private JLabel label;
	
	public ImageTutorial(){
		
		image = new ImageIcon(getClass().getResource("pigeony.jpg"));
	
		label = new JLabel(image);
		add(label);
		
	}
	
	public static void main(String[] args) {
		ImageTutorial gui = new ImageTutorial();
		gui.setVisible(true);
		gui.pack();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

}
