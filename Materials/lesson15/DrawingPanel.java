package less.lesson15;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
	private long counter; 
	@Override
	protected void paintComponent(Graphics g) {
		g.drawLine(0, 0, getWidth(), getHeight());
		System.out.println(counter);
		counter++;
		g.drawRect(100, 100, 50, 150);
		g.drawRect(100, 100, 100, 100);
		g.drawOval(100, 100, 50, 150);
		g.drawOval(100, 100, 100, 100);
		g.setColor(Color.RED);
		g.drawRect(350, 350, 50, 50);
		
		g.setColor(Color.GREEN);
		
		//g.setColor(new Color(200, 200, 200));
		g.fillRect(352, 352, 46, 46);
		
		g.drawString("STR", 420, 300);
		
		Font f = new Font(getFont().getName(), Font.BOLD, getFont().getSize() + 10);
		g.setFont(f);
		g.drawString("STR", 420, 350);
	}
}
