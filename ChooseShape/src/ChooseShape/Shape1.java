package ChooseShape;
import java.awt.Graphics;
import javax.swing.*;
public class Shape1 extends JPanel{
	public static void main(String[] args) {
		
		Shape1 panel = new Shape1();
		JFrame f = new JFrame("Shape 1");
		
		f.setVisible(true);
		f.setResizable(false);
		f.setSize(250,250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(panel);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int height = getHeight();  // total height
		int width = getWidth();   // total width
		int lineNum = 15;
		int x,dx,y,dy;
		x = 0;
		y = height;
		dx = width / lineNum;
		dy = height / lineNum;
		for (int i = 0; i <= lineNum; i++) {
			x = x + dx;
			y = y - dy;
			g.drawLine(0, 0, x, y);
		}
	}
}

