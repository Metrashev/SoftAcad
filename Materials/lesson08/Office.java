package less.lesson08;

public class Office {
	private static final int SIZE = 100;
	public static void main(String[] args) {
		AllWork allWork = new AllWork(SIZE);
		for(int i=1; i<=SIZE; i++) {
			allWork.addTask(new Task("Task " + i, SIZE/i));
		}
		Employee[] employees = {
			new Employee("Employee 1"),
			new Employee("Employee 2"),
			new Employee("Employee 3"),
			new Employee("Employee 4"),
			new Employee("Employee 5")
		};
		
		for (Employee employee : employees) {
			employee.setAllWork(allWork);
		}
		
		int day = 0;
		while(!allWork.isAllWorkDone()) {
			day++;
			System.out.println("Working day: " + day);
			for (Employee employee : employees) {
				employee.startWorkingDay();
				employee.work();
			}
		}
		
		
	}
}
