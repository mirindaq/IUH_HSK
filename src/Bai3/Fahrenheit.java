package Bai3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Fahrenheit extends JFrame implements ActionListener {
	private JTextField text;
	private JLabel lblOut;

	public Fahrenheit() {
		// set frame
		setTitle("Fahrenheit");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout( new FlowLayout());
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.yellow);
		setSize(300, 100);
		setResizable(false);
		
		//add 
		JLabel lblIn = new JLabel("Enter Fahrenheit temperature: ");
		text = new JTextField(3);
		lblOut = new JLabel("Temperature in Celsius: --");
		
		add(lblIn);
		add(text);
		add(lblOut);
		//add action
		
		text.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Fahrenheit().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double x = Double.parseDouble(text.getText());
		lblOut.setText("Temperature in Celsius: " + (x - 32) * 5 / 9);
		
	}
}
