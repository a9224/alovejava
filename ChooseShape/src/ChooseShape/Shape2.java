package ChooseShape;
import java.awt.*;
import javax.swing.*;
public class Shape2 extends JPanel{
	public static void main(String[] args) {
		Shape2 panel = new Shape2();
		JFrame f = new JFrame("Shape 2");
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250,250);
		f.add(panel);
	}
	private void drawFan(Graphics g, int l, int x0, int y0, int sx, int sy, int ex,
			int ey) {
		// TODO Auto-generated method stub
		l = 15;
		int x = sx, y =sy;
		int dx = (ex - sx)/l,
				dy = (ey - sy)/l;
		for (int i = 1; i < l; i++) {
			x += dx;
			y +=dy;
			g.drawLine(x0, y0, x, y);
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int h = getHeight();
		int w = getWidth();
		drawFan(g, 15, 0, 0, 0, h, w, 0);
		drawFan(g, 15, w, 0, 0, 0, w, h);
		drawFan(g, 15, 0, h, 0, 0, w, h);
		drawFan(g, 15, w, h, 0, h, w, 0);
	}
}
