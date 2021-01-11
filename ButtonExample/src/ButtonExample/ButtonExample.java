package ButtonExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonExample{
	public static void main(String[] args) {
		JFrame f = new JFrame("Button Example");
		JButton b = new JButton("Click Here");
		JLabel l = new JLabel();
		l.setBounds(10, 110, 200, 100);
		b.setBounds(50, 100, 95, 30);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				l.setText("Welcome to A ❤ JAVA");
				
			}
		});
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250,250);
		f.setLayout(null);
		f.add(l);
		f.add(b);
	}
}
