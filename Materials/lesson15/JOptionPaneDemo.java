package less.lesson15;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {
	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "Hi!");
//		JOptionPane.showMessageDialog(null, "smt 2", "title here", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "smt 2", "title here", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "smt 2", "title here", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "smt 2", "title here", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "smt 2", "title here", JOptionPane.PLAIN_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "msg", "title", JOptionPane.ERROR_MESSAGE, null);
		
		String result;
//		result = JOptionPane.showInputDialog("Write smt");
//		result = JOptionPane.showInputDialog("abc?");
//		Car car = new Car("BMW");
//		result = JOptionPane.showInputDialog(car);
		
//		Car[] cars = {
//				new Car("BMW"),
//				new Car("Merc"),
//				new Car("Ford"),
//				new Car("Renault"),
//				new Car("VW")
//		};
//		
//		Object o = JOptionPane.showInputDialog(null, "Choose one", "Choose a car", JOptionPane.QUESTION_MESSAGE, null, cars, cars[3]);
//		System.out.println(o);
		
//		int i = JOptionPane.showConfirmDialog(null, "msg");
//		System.out.println(i);
//		if(i == JOptionPane.NO_OPTION) {
//			System.out.println("NO");
//		} else if(i == JOptionPane.YES_OPTION) {
//			System.out.println("YES");
//		}
		
		JOptionPane.showConfirmDialog(null, "msg", "title", JOptionPane.YES_NO_OPTION);
		JOptionPane.showConfirmDialog(null, "msg", "title", JOptionPane.OK_CANCEL_OPTION);
	}
}
