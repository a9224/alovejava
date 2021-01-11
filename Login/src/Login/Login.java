package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel{
	public static void main(String[] args) {
		Login panel = new Login();
		JFrame f = new JFrame("Login");
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(350,200);
		f.add(panel);
		
		JLabel user = new JLabel("User");
		user.setBounds(10, 20, 80, 25);
		f.add(user);
		JTextField t = new JTextField(20);
		t.setBounds(100, 20, 165, 25);
		f.add(t);
		
		JLabel pass = new JLabel("Password");
		pass.setBounds(10, 50, 80, 25);
		f.add(pass);
		
		JPasswordField p = new JPasswordField();
		p.setBounds(100, 50, 165, 25);
		f.add(p);
		
		JButton b = new JButton("Login");
		b.setBounds(44, 90, 80, 25);
		JLabel text = new JLabel();
		text.setBounds(10, 99, 200, 100);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				text.setText("Welcome to Java Class");
			}
		});
		
		f.add(text);
		f.add(b);
	}
}
