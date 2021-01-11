package ChooseShape;
import java.awt.Graphics;
import javax.swing.*;
public class Shape3 extends JPanel{
	public static void main(String[] args) {
		Shape3 panel = new Shape3();
		JFrame f = new JFrame("Shape 3");
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250,250);
		f.add(panel);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int h = getHeight();
		int w = getWidth();
		int line =15, x=0 ,y=h
				,dx = w/line
				,dy = h/line;
		for (int i = 1; i < line; i++) {
			x +=dx;
			y-=dy;
			g.drawLine(0, y, x, 0);
		}
	}
}
