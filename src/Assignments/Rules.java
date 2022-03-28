package Assignments;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{

	JButton b1,b2;
	String username;
	Rules(String username){
		this.username = username;
		setBounds(600,200,800,650);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
	
		JLabel l1 = new JLabel("Welcome "+  username  + " to Your Assignments");
		l1.setForeground(new Color(30,144,255));
		l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
		l1.setBounds(50,20,700,30);
		add(l1);
		
		JLabel l2 = new JLabel("Ruless are here.");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l2.setBounds(20,90,600,350);
		l2.setText(
				"<html>"+
						"1.  something somethingsomethingsomething something something something something something " + "<br><br>"+
						"1.  something somethingsomethingsomething something something something something something " + "<br><br>"+
						"1.  something somethingsomethingsomething something something something something something " + "<br><br>"+
						"1.  something somethingsomethingsomething something something something something something " + "<br><br>"+
						"1.  something somethingsomethingsomething something something something something something " + "<br><br>"+
						"1.  something somethingsomethingsomething something something something something something " + "<br><br>"+
					"</html>"
				);
		add(l2);
		
		b1 = new JButton("Back");
		b1.setBounds(250,500,100,30);
		b1.setBackground(new Color(30,144,255));
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Start");
		b2.setBounds(400,500,100,30);
		b2.setBackground(new Color(30,144,255));
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == b1){
            this.setVisible(false);
            new Simple().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
            
        }
	}
	
	public static void main(String[] args) {

		new Rules("");
		
	}

}
