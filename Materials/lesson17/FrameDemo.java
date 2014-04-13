package lessons.lesson17;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = null;
		//panel = new FlowLayoutPanel();
		//panel = new BorderLayoutPanel();
		//panel = new TaskPanel();
		//panel = new GridLayoutPanel();
		//panel = new BoxLayoutPanel();
		panel = new BoxLayoutAndBoxPanel();
		frame.add(panel);
		frame.setVisible(true);
	}
}
