package standard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class FrameGame extends JFrame{
	
	public final static int FRAME_WIDTH = 400;
	public final static int FRAME_HIGHTH = 400;	
	
	public FrameGame(){


		
		setSize(FRAME_WIDTH, FRAME_HIGHTH);
		Container container = this.getContentPane();
		
		PaintingPanel lowerPanel = new PaintingPanel();
		ButtonPanel upperPanel = new ButtonPanel();
		

		container.add(lowerPanel);
		container.add(upperPanel, BorderLayout.NORTH);
		
	}
	
	public class PaintingPanel extends JPanel{
	
		private ArrayList <Ellipse2D.Double> CircleList;
		public final double CIRCLE_RADIOUS = 20;
		
		public PaintingPanel(){
			
		this.addMouseListener(new MouseClick());
		CircleList = new ArrayList<Ellipse2D.Double>();
		
	}
		/**
		 * This method paint all the circles on the Paneø
		 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
		 */
		public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		for(int i = 0; i < CircleList.size(); i++)
			{
			g2.draw(CircleList.get(i));

			}
	}
	
	
		/**
		 * Event Class used to listen the mouse buttons
		 * @author RoguskiA
		 *
		 */
		public class MouseClick implements MouseListener{
		
	

			/**
			 * This method add a new circle to the CircleList when mouse is clicked once
			 */
			public void mouseClicked(java.awt.event.MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1)
					addCircle (new Point2D.Double(e.getX(), e.getY()));
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				Ellipse2D.Double circle;
				if((e.getButton() == MouseEvent.BUTTON3) && ((circle = checkIfOnCircle(e.getX(),e.getY()))!= null)){
					CircleList.remove(circle);
					repaint();
					
				}
				
			}
		
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		
		/**
		 * This method add a new circle to the list in the circleCentre and with radius of CIRCLE_RADIOUS
		 * @param circle Centre, a Point2D which indicates the centre of the circle
		 */
			public void addCircle(Point2D circleCentre) {
				
				Ellipse2D.Double kolo = new Ellipse2D.Double(circleCentre.getX(), circleCentre.getY(), this.CIRCLE_RADIOUS, this.CIRCLE_RADIOUS );
				CircleList.add(kolo);
				repaint();
				
			}
		/**
		 * The method checks if the coordinates int x, int y are within any of the corcle on CircleList
		 * @param x, int, x coordinate to be checked
		 * @param y, int, y coordinate to be checkecd
		 * @return true if x, y are within any of the circles on the plane
		 */
		public Ellipse2D.Double checkIfOnCircle(int x, int y) {
			for(int i = 0; i < CircleList.size(); i++)
			{
				if(CircleList.get(i).contains(new Point(x, y)))
				{
					return CircleList.get(i);
									}
			}
			return null;
		}
	}
	public class ButtonPanel extends JPanel{
		
		public ButtonPanel(){
		
			
			JButton cursor1 = new JButton("Cursor one");
			JButton cursor2 = new JButton("Cursor two");
			JButton cursor3 = new JButton("Cursor three");
	
			cursor1.addActionListener(new Event());
			cursor2.addActionListener(new Event());
			cursor3.addActionListener(new Event());
			
			add(cursor1);
			add(cursor2);
			add(cursor3);
			
		}
	
		public class Event implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Cursor one")){
					
				FrameGame.this.setCursor(Cursor.CROSSHAIR_CURSOR);
					
				}else if(e.getActionCommand().equals("Cursor two")){
					
					FrameGame.this.setCursor(Cursor.MOVE_CURSOR);
					
				}else if(e.getActionCommand().equals("Cursor three")){
					
					FrameGame.this.setCursor(Cursor.HAND_CURSOR);
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		FrameGame gra = new FrameGame();
		gra.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gra.setVisible(true);
	}

}

