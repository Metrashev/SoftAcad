package less.lesson08;

public class Employee {
	private static final int WORKING_HOURS = 8;
	private String name;
	private Task currentTask;
	private double hoursLeft;
	private AllWork allWork;
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && name.length() > 1) {
			this.name = name;
		} else {
			System.out.println("Invalid name");
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if(currentTask != null) {
			this.currentTask = currentTask;
		} else {
			System.out.println("Invalid task");
		}
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if(hoursLeft > 0) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Invalid value");
		}
	}
	
	public AllWork getAllWork() {
		return allWork;
	}
	
	public void setAllWork(AllWork allWork) {
		this.allWork = allWork;
	}
	
	public void work() {
		while(hoursLeft > 0) {
			if(currentTask == null || currentTask.getWorkingHours() == 0) {
				currentTask = allWork.getNextTask();
				if(currentTask == null) {
					showReport();
					return;
				}
				System.out.println(name + " -> " + currentTask.getName());
			}
			
			if(hoursLeft > currentTask.getWorkingHours()) {
				hoursLeft -= currentTask.getWorkingHours();
				currentTask.setWorkingHours(0);
			} else {
				currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
				hoursLeft = 0;
			}
			showReport();
		}

	}
	
	public void startWorkingDay() {
		hoursLeft = WORKING_HOURS;
	}
	
	private void showReport() {
		System.out.println("==== REPORT ====");
		System.out.println("Name: " + name);
		System.out.println("Hours left: " + hoursLeft);
		System.out.println("Task name: " + (currentTask != null ? currentTask.getName() : "-no-task-"));
		System.out.println("Task hours: " + (currentTask != null ? currentTask.getWorkingHours() : "-no-task-"));
		System.out.println();
	}
	
}