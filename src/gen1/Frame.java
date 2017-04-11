package gen1;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame {
	
	private volatile int howManyRec;
	
	public Frame(String title) {
		super(title);
		
		howManyRec = 0;
		
		JPanel listPane = new JPanel();
		listPane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		
		JLabel howManyLab = new JLabel("Number of records:");
		JTextField howMany = new JTextField("0");
		
		
		JButton generate = new JButton("Generate");
		generate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(howMany.getText().matches("[0-9]*")) {
					howManyRec = Integer.parseInt(howMany.getText());
					new Generator(howManyRec);
				} else {
					System.out.println("Wrong input");
				}
			}
		});
		
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		
		c.ipadx = 20;
		
		c.gridy = 0;
		c.gridx = 0;
		howManyLab.setFont(new Font("Arial", Font.BOLD, 16));
		listPane.add(howManyLab, c);
		
		c.ipadx = 100;
		c.ipady = 15;
		
		c.gridy = 0;
		c.gridx = 2;
		howMany.setFont(new Font("Arial", Font.PLAIN, 16));
		listPane.add(howMany, c); 
		
		c.gridy = 2;
		listPane.add(generate, c);
		
		add(listPane);
	}
}
