package DrawPanel;

import javax.swing.JFrame;

public class DrawPanelTest{
	public static void main(String[] args) {
		DrawPanel panel = new DrawPanel();
		JFrame f = new JFrame();
		
		f.setVisible(true);
		f.setSize(250,250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(panel);
	}
}