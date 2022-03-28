package Assignments;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Score extends JFrame implements ActionListener{


	Score(String username, int score){
		setBounds(600,150,750,550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Assignments/icons/Score.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(0, 200, 300, 250);
		add(l1);
	
		JLabel l2 = new JLabel("Thankyou "+ username + " to attend");
		l2.setBounds(45, 30, 700, 30);
		l2.setFont(new Font("RALEWAY", Font.PLAIN,26));
		add(l2);
		
		JLabel l3 = new JLabel("Your score is " + score);
		l3.setBounds(350, 200, 300, 30);
		l3.setFont(new Font("RALEWAY", Font.PLAIN,30));
		add(l3);
		
		JButton b1 = new JButton("Attempt Again");
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.setBounds(400, 270, 120, 30);
		add(b1);
	}
	
	public static void main(String[] args) {
		new Score("", 0).setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
		new Simple().setVisible(true);
	}

}
