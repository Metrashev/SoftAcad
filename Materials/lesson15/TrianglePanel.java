package less.lesson15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TrianglePanel extends JPanel {
	private int side;
	
	public TrianglePanel(int side) {
		this.side = side;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		int w = getWidth() / 2;
		int h = getHeight() / 2;
		int[] xPoints = {w, w + side, w};
		int[] yPoints = {h, h, h + side};
		
		g.setColor(Color.RED);
		g.fillPolygon(xPoints, yPoints, 3);
	}
}
