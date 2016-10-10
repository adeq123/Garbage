import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Random extends JFrame{
	
	JPanel panel;
	
	public Random(){
		
		panel = new JPanel();
		panel.setBackground(randomColor());
		add(panel);
		
		Event e = new Event();
		panel.addMouseListener(e);
		
	}

	private Color randomColor() {
		
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		
		return new Color(r,g,b);
	}
	
public class Event implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		panel.setBackground(randomColor());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public static void main(String args []){
	Random gui = new Random();
	gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
	gui.setSize(200, 200);
	gui.setVisible(true);
}
}
