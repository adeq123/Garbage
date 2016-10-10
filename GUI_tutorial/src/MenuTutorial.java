import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuTutorial extends JFrame{

	private JMenuBar menubar;
	private JMenu file;
	private JMenuItem exit;
	
	public MenuTutorial(){
		
		setLayout(new FlowLayout());
		
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		file = new JMenu("File");
		menubar.add(file);
		
		exit = new JMenuItem("EXIT");
		file.add(exit);
		
		Event e = new Event();
		exit.addActionListener(e);
		
		
	}
	
	public class Event implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
		System.exit(0);
			
		}
		
	}
	 
	public static void main(String[] args) {
		MenuTutorial menu = new MenuTutorial();
		menu.setVisible(true);
		menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
		menu.setSize(200, 200);
	}

	

}
