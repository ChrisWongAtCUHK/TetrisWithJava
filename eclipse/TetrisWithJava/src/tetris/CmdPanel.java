package tetris;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

// The cmd panel
public class CmdPanel extends JPanel {

	private JButton startButton;
	private JButton stopButton;
	
	// Constructor
	public CmdPanel(){
		setLayout(new BorderLayout());
		setBackground(Color.darkGray);
		startButton = new JButton("start");
		startButton.setFont(new Font("Courier", Font.BOLD, 20));
		startButton.setForeground(Color.white);
		add(startButton, BorderLayout.NORTH);
		
		stopButton = new JButton("stop");
		stopButton.setFont(new Font("Courier", Font.BOLD, 20));
		stopButton.setForeground(Color.white);
		add(stopButton, BorderLayout.SOUTH);
	}
	
	// Accessor to startButton
	public JButton getStartButton(){
		return this.startButton;
	}
	
	// Accessor to stopButton
	public JButton getStopButton(){
		return this.stopButton;
	}
}