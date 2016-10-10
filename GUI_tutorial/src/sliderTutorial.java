import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class sliderTutorial extends JFrame{

	JSlider slider;
	JLabel label;
	
	public sliderTutorial(){
		setLayout(new FlowLayout());
		slider = new JSlider(JSlider.HORIZONTAL, 0,20,0);
		slider.setMajorTickSpacing(5);
		slider.setPaintTicks(true);
		add(slider);
		
		label = new JLabel("Current value: 0");
		add(label);
		Event e = new Event();
		slider.addChangeListener(e);
		

	}
	
	public class Event implements ChangeListener{
		
		public void stateChanged(ChangeEvent e) {
			int value = slider.getValue();
			label.setText("Current value: "+value);
		}
	}

	public static void main (String args []){
		
		sliderTutorial gui = new sliderTutorial();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(400, 200);
		gui.setTitle("Slider Tutorial");
	}


}
 