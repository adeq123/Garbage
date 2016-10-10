import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class MainWindow extends JFrame{
	
	JMenuBar menuBar;
	JMenu help;
	JMenuItem about;
	
	public MainWindow(){
		setLayout (new FlowLayout());
		
		menuBar = new JMenuBar();
		add(menuBar);
		
		help = new JMenu("Help");
		menuBar.add(help);
		
		about = new JMenuItem("About");
		help.add(about);
		
		setJMenuBar(menuBar);
		
		Event e = new Event();
		about.addActionListener(e);
	}
	
	public class Event implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			HelpWindow gui = new HelpWindow(MainWindow.this);
			gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			gui.setSize(300, 100);
			gui.setLocation(300, 300);
			gui.setVisible(true);
			gui.setTitle("Help Window");
			
			
		}
		
	}



public static void main (String args[]){
	
		MainWindow gui = new MainWindow();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300, 100);
		gui.setLocation(300, 300);
		gui.setVisible(true);
		gui.setTitle("Main Window");
		
}
	
}