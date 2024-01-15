package Bai7;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class TextStatistics extends JFrame implements ActionListener {
	private JTextArea text;
	private JButton btn;
	private JLabel labelNumber;
	private JLabel labelAve;

	public TextStatistics() {
		//frame
		setTitle("BorderDemo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout( new BoxLayout(getContentPane(), BoxLayout.Y_AXIS) );
		setLocationRelativeTo(null);
		setSize(500,700);
		setResizable(false);
		getContentPane().setBackground(new Color(.8f, 0.9f, 0.8f));
		
		//add
		text = new JTextArea();
		text.setWrapStyleWord(true);
		text.setLineWrap(true);
		JScrollPane scroll = new JScrollPane(text);
		scroll.setPreferredSize(new Dimension(300, 600));
		TitledBorder border1 = BorderFactory.createTitledBorder("Text Container");
		Border border2 = BorderFactory.createEmptyBorder(5, 30, 5, 30);
		scroll.setBorder(BorderFactory.createCompoundBorder(border2, border1));
		scroll.setBackground(new Color(.8f, 0.9f, 0.8f));

		
		JPanel panelStatis = new JPanel();
		panelStatis.setLayout(new FlowLayout());
		panelStatis.setPreferredSize(new Dimension(200,200));
		TitledBorder border3 = BorderFactory.createTitledBorder("Text Statistics");
		Border border4 = BorderFactory.createEmptyBorder(5, 130, 60, 130);
		panelStatis.setBorder(BorderFactory.createCompoundBorder(border4, border3));
		btn = new JButton("update text statistics");	
		labelNumber = new JLabel("number of words: ---");
		labelAve = new JLabel("average of words: ---");
		panelStatis.setBackground(new Color(.8f, 0.9f, 0.8f));
		panelStatis.add(btn);
		panelStatis.add(labelNumber);
		panelStatis.add(labelAve);
		
		add(scroll);
		add(panelStatis);
		//add action
		btn.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new TextStatistics().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String tmp = text.getText();
		String[] arr = tmp.split(" ");
		labelNumber.setText("number of words: " + arr.length);
		labelAve.setText("average of words: " + (tmp.length() - arr.length * 1.0) / arr.length);
	}
	
}
