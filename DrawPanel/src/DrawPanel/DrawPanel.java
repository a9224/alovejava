package DrawPanel;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int w = getWidth();
		int h = getHeight();
		
		g.drawLine(0, 0, w, h);
		g.drawLine(0, h, w, 0);

	}
}