package Bai6;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class BorderDemo extends JFrame {
	public BorderDemo() {
		// set frame
		setTitle("BorderDemo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,2,5,5));
		setLocationRelativeTo(null);
		setSize(380, 300);
//		setResizable(false);
		
		//add panel
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("Line Border"));
		panel1.setBorder( BorderFactory.createLineBorder(Color.red,4));
		
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("Etched Border"));
		panel2.setBorder( BorderFactory.createEtchedBorder());
		
		JPanel panel3 = new JPanel();
		panel3.add(new JLabel("Raised Bevel Border"));
		panel3.setBorder( BorderFactory.createRaisedBevelBorder());
		
		JPanel panel4 = new JPanel();
		panel4.add(new JLabel("Lowered Bevel Border"));
		panel4.setBorder( BorderFactory.createLoweredBevelBorder());
		
		JPanel panel5 = new JPanel();
		panel5.add(new JLabel("Titled Border"));
		panel5.setBorder( BorderFactory.createTitledBorder("Title"));
		
		JPanel panel6 = new JPanel();
		panel6.add(new JLabel("Titled Border(Right)"));
		TitledBorder title=  BorderFactory.createTitledBorder("Title");
		title.setTitleJustification(TitledBorder.RIGHT);
		panel6.setBorder( title);
		
		
		JPanel panel7 = new JPanel();
		panel7.add(new JLabel("Compound Border"));
		Border b1 = BorderFactory.createEtchedBorder();
		Border b2 = BorderFactory.createLineBorder(Color.BLUE,2);
		panel7.setBorder( BorderFactory.createCompoundBorder(b1, b2));
		
		
		JPanel panel8 = new JPanel();
		panel8.add(new JLabel("Matte Border"));
		panel8.setBorder(BorderFactory.createMatteBorder(1, 4 , 1, 1, Color.red));
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
		add(panel8);
	}
	
	public static void main(String[] args) {
		new BorderDemo().setVisible(true);
	}

}
