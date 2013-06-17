package tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints ;
import java.awt.Insets ;

import javax.swing.JLabel;
import javax.swing.JPanel;

// The info panel
public class InfoPanel extends JPanel {
	public InfoPanel(){
		GridBagConstraints gcInfo = new GridBagConstraints();
		gcInfo.weighty = 1;
		setBackground(Color.orange);
		setLayout(new GridBagLayout());
		
		gcInfo.fill = GridBagConstraints.BOTH;
		gcInfo.insets = new Insets(0 ,0 ,0 ,0);
		gcInfo.gridx = 0;
		gcInfo.gridy = 0;
		gcInfo.gridwidth = 1;
		gcInfo.gridheight = 1;
		
		// Left
		JLabel left = new JLabel("Left: left", JLabel.CENTER);
		Main.setComponent(left, new Font("Courier", Font.BOLD, 20), Color.white);
		Main.addComponent(gcInfo, this, left, GridBagConstraints.BOTH, 0, 0);	
		
		// Right
		JLabel right = new JLabel("Right: right", JLabel.CENTER);
		Main.setComponent(right, new Font("Courier", Font.BOLD, 20), Color.white);
		Main.addComponent(gcInfo, this, right, GridBagConstraints.BOTH, 0, 1);

		// Rotate
		JLabel rotate = new JLabel("Rotate: rotate", JLabel.CENTER);
		Main.setComponent(rotate, new Font("Courier", Font.BOLD, 20), Color.white);
		Main.addComponent(gcInfo, this, rotate, GridBagConstraints.BOTH, 0, 2);
		
		// Down
		JLabel down = new JLabel("Down: down", JLabel.CENTER);
		Main.setComponent(down, new Font("Courier", Font.BOLD, 20), Color.white);
		Main.addComponent(gcInfo, this, down, GridBagConstraints.BOTH, 0, 3);
	}
}