import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Table extends JFrame{
	
	JTable table;
	
	public Table(){
		setLayout(new FlowLayout());
		
		String [] columnNames ={"Name", "Eye Color", "Gender"};
		
		Object [] [] data = {
				{"Bill", "Hazel", "Male"},
				{"Mary", "Black", "Female"},
				{"Rick", "Red", "Male"},
				{"Janice", "Yellow", "Female"},
		};
		
		table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500, 50));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	}

	public static void main(String[] args) {
		Table gui = new Table();
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setVisible(true);

	}

}
