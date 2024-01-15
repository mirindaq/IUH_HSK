package Bai5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class StyleOptions extends JFrame implements ItemListener {
	private JCheckBox bold;
	private JCheckBox italic;
	private JLabel text;

	public StyleOptions() {
		// set frame
		setTitle("StyleOptions");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.cyan);
		setSize(300, 140);
		setResizable(false);
		
		//add 
		text = new JLabel("Say it with style!");
		text.setFont(new Font("Helvetica", Font.PLAIN, 36));
		
		JPanel panelOp = new JPanel();
		panelOp.setLayout(new FlowLayout());
		panelOp.setBackground(Color.cyan);
		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);
		panelOp.add(bold);
		panelOp.add(italic);
		
		add(text);
		add(panelOp);
		//add action
		bold.addItemListener(this);
		italic.addItemListener(this);
		
	}

	public static void main(String[] args) {
		new StyleOptions().setVisible(true);
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		int style = Font.PLAIN;
		if ( bold.isSelected() ) {
			style += Font.BOLD;
		}
		if ( italic.isSelected() ) {
			style += Font.ITALIC;
		}
		text.setFont(new Font("Helvetica", style, 36));
	}
}
