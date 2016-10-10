import java.awt.*;
import javax.swing.*;

public class HelpWindow extends JDialog{
	
	JLabel label;
	public HelpWindow(JFrame frame){
		super(frame, "HelpWindow", true);
		setLayout (new FlowLayout());
		
		label = new JLabel ("ble ble ble");
		add(label);
	}

}
