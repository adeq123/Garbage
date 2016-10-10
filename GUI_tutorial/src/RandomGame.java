import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RandomGame extends JFrame{
	
	int randomNum, guess;
	private JButton button;
	private JTextField field;
	private JLabel promptlabel;
	private JLabel resultlabel;
	private JLabel randomlabel;
		
	public RandomGame(){
		
		setLayout(new FlowLayout());
		promptlabel = new JLabel("Enter random number from 1 to 10");
		add(promptlabel);
		
		field = new JTextField(5);
		add(field);
		
		button = new JButton("Guess!");
		add(button);
		
		resultlabel = new JLabel("");
		add(resultlabel);
		
		randomlabel = new JLabel("");
		add(randomlabel);
		
		Event e = new Event();
		button.addActionListener(e);
		
	}
	
	public class Event implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
		randomNum = (int)( Math.random() * 10 + 1);	
		try{
			guess = (int) Double.parseDouble(field.getText());
		if(randomNum == guess){
			resultlabel.setText("You won the game !");
		}else
			resultlabel.setText("You loose...");
		randomlabel.setText("Random number was: "+randomNum);
			}catch (Exception ex){
				randomlabel.setText("Please enter number only!");
			}
		}
	}
	public static void main(String[] args) {
		RandomGame game = new RandomGame();
		game.setVisible(true);
		game.pack();
		game.setSize(300, 200);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
