package Bai2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class PushCounter extends JFrame implements ActionListener {
	private JButton btnPush;
	private JLabel labelCount;
	private int count;

	public PushCounter() {
		//set frame
		setTitle("Push Counter");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.cyan);
		setSize(300,80);
		setResizable(false);
		
		//add button
		btnPush = new JButton("Push Me!!");
		labelCount = new JLabel("Pushes: 0");
		
		add(btnPush);
		add(labelCount);
		
		//add action
		btnPush.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new PushCounter().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		labelCount.setText("Pushes: " + count);
		
	}
}
