package tetris;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints ;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Test {
	static final int frameWidth = 600;
	static final int frameHeight = 1000;
	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setTitle("Test for grid");
		
		BorderLayout bl = new BorderLayout();
		frame.setLayout(bl);
		
		// Set the background color to black
		frame.getContentPane().setBackground(Color.black);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(frameWidth, frameHeight);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(((int) screenSize.getWidth() - frameWidth) / 1, 50, frameWidth, frameHeight);
		
		GridPanel gp = new GridPanel();
		frame.add(gp, BorderLayout.CENTER);

		frame.setResizable(false);
		frame.setVisible(true);
	}
}