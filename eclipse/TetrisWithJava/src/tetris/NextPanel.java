package tetris;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// The next panel(with grid)
public class NextPanel extends JPanel {	
	private static int rows = 4;
	private static int cols = 4;
	private JButton[][] cells;
	
	// Constructor
	public NextPanel(){
		setLayout(new GridLayout(rows, cols));//Grid layouts x and y are SWAPPED!
		this.cells = new JButton[cols][rows];
		for (int y = 0; y < rows; y++){
                for (int x = 0; x < cols; x++){
                        cells[x][y] = new JButton(" ");
                        //tmp[x][y] = Color.DARK_GRAY;
                        cells[x][y].setBackground(Color.DARK_GRAY);
                        add(cells[x][y]);
                        cells[x][y].setEnabled(false);
                }//end inner for
        }
	}
	
	// Get the cells
	public JButton[][] getCells(){
		return this.cells;
	}
}