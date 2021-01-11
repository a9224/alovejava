package ChooseShape;
import java.awt.event.*;
import javax.swing.*;
public class ChooseShape extends JPanel{
	public static void main(String[] args) {
		ChooseShape panel = new ChooseShape();
		JFrame f = new JFrame("Login Example");
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(350,200);
		f.add(panel);
		
		JLabel user = new JLabel("User");
		user.setBounds(10, 20, 80, 25);
		f.add(user);
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		f.add(userText);
		
		JLabel passtext = new JLabel("Password");
		passtext.setBounds(10, 50, 80, 25);
		f.add(passtext);
		JPasswordField pass = new JPasswordField();
		pass.setBounds(100, 50, 165, 25);
		f.add(pass);
		
		JButton b = new JButton("Login");
		b.setBounds(44, 90, 80, 25);
		JLabel text = new JLabel();
		text.setBounds(10, 99, 200, 100);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				text.setText("Welcome to A love Java");
			}
		});
		f.add(text);
		f.add(b);
		
	}
}
