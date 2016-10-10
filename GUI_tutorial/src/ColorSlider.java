import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class ColorSlider extends JFrame{
	
	JSlider redSlider, greenSlider, blueSlider;
	
	
	JLabel redLabel, greenLabel, blueLabel;
	
	JPanel colorPanel, sliders, labels;
	
	public ColorSlider (){
		
		redSlider = new JSlider(0,255,0);
		greenSlider = new JSlider(0,255,0);
		blueSlider = new JSlider(0,255,0);
		
		redLabel = new JLabel("Red = 0");
		greenLabel = new JLabel("Green = 0");		
		blueLabel = new JLabel("Blue = 0");
		
		Event e = new Event();
		redSlider.addChangeListener(e);
		greenSlider.addChangeListener(e);
		blueSlider.addChangeListener(e);
		
		colorPanel = new JPanel();
		colorPanel.setBackground(Color.black);
		
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(1,3,3,3));
		
		sliders = new JPanel ();
		labels = new JPanel();
		
		pane.add(sliders);
		pane.add(labels);
		pane.add(colorPanel);
		
		sliders.setLayout(new GridLayout(3,1,2,2));
		sliders.add(redSlider);
		sliders.add(greenSlider);
		sliders.add(blueSlider);
		
		labels.setLayout(new GridLayout(3,1,2,2));
		labels.add(redLabel);
		labels.add(greenLabel);
		labels.add(blueLabel);
		
	}
	
	public class Event implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			
			int r = redSlider.getValue();
			int g = greenSlider.getValue();
			int b = blueSlider.getValue();
			
			redLabel.setText("Red = "+r);
			blueLabel.setText("Blue = "+b);
			greenLabel.setText("Green = "+g);
			
			colorPanel.setBackground(new Color(r,g,b));
		}

		
	}

	public static void main(String[] args) {
		
		ColorSlider gui = new ColorSlider();
		gui.setVisible(true);
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setSize(300,110);
		gui.setTitle("Color changer");


	}

}
