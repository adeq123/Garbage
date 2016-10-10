import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class cbTutorial extends JFrame{
	
	JCheckBox show1, show2;
	JLabel label1, label2;
	
	public cbTutorial(){
	
		setLayout(new GridLayout(2,2));
		
		label1 = new JLabel ("");
		add(label1);
		
		label2 = new JLabel ("");
		add(label2);	
		
		show1 = new JCheckBox("Show first label");
		add(show1);
		
		show2 = new JCheckBox("Show second label");
		add(show2);
		
		Event e = new Event();
		show1.addItemListener(e);
		show2.addItemListener(e);
		
	}

	public class Event implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(show1.isSelected()){
				label1.setText("You selected box 1");
			}else if(!show1.isSelected())
				label1.setText("");
		
		
		if(show2.isSelected()){
			label2.setText("You selected box 2");
		}else if(!show2.isSelected())
			label2.setText("");
	}
		
	}
	
	public static void main(String[] args) {
		cbTutorial tut = new cbTutorial();
		tut.setVisible(true);
		tut.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tut.setSize(300, 300);

	}

}
